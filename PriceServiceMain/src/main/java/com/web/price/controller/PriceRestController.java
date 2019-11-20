package com.web.price.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.web.price.model.HDProductInfo;
import com.web.price.service.CatalogHttpServices;
import com.web.price.service.CatalogServices;
import com.web.price.service.ProductService;
import com.web.price.service.WriteExcel;

@RestController
public class PriceRestController {

	@Autowired
	ProductService productService; // Service which will do all data
									// retrieval/manipulation work

	@Autowired
	CatalogServices catalogService;

	@Autowired
	WriteExcel writeExcelService;

	// -------------------Retrieve All
	// Products--------------------------------------------------------

	@RequestMapping(value = "/productPrice/", method = RequestMethod.GET)
	public ResponseEntity<List<HDProductInfo>> listAllProducts() {
		List<HDProductInfo> products = productService.findAllProducts();

		if (products.isEmpty()) {
			return new ResponseEntity<List<HDProductInfo>>(HttpStatus.NO_CONTENT);// You
																			// many
																			// decide
																			// to
																			// return
																			// HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<HDProductInfo>>(products, HttpStatus.OK);
	}

	// -------------------Retrieve Single
	// Product--------------------------------------------------------

	@RequestMapping(value = "/productPrice/{modelId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HDProductInfo> getProduct(@PathVariable("modelId") String id) throws IOException {

		System.out.println("Fetching Model# " + id);
		HDProductInfo product = productService.findById(id);
		if (product == null) {
			System.out.println("Model# " + id + " not found");
			return new ResponseEntity<HDProductInfo>(HttpStatus.NOT_FOUND);
		}

		/*if (Float.parseFloat(comparePrice(id)) <= Float.parseFloat(product.getPrice10())) {
			String lowesbuy = "Welcome To Lowes! Buy same item at $" + comparePrice(id);
			System.out.println(lowesbuy);
		}*/
		return new ResponseEntity<HDProductInfo>(product, HttpStatus.OK);
	}

	// -------------------Create a
	// Product--------------------------------------------------------

	// modelNo,hdprice, was, specialBuy, savingText, brand, productDesc
	@RequestMapping(value = "/productPrice/", method = RequestMethod.POST, produces = "application/json")
	
	public @ResponseBody Map<String, String> createProduct(@RequestParam("modelNo") String modelNo,
			@RequestParam("hdprice") String hdprice, @RequestParam("was") String was,
			@RequestParam("specialBuy") String specialBuy, @RequestParam("savingText") String savingText,
			@RequestParam("brand") String brand, @RequestParam("productDesc") String productDesc,
			@RequestParam("storeNumber") String storeNumber, @RequestParam("price7") String price7,
			@RequestParam("price8") String price8, @RequestParam("price9") String price9,
			@RequestParam("price10") String price10, UriComponentsBuilder ucBuilder) throws IOException {
		
		Map<String,String> returnMap = new HashMap<String,String>();
		
		HDProductInfo product = new HDProductInfo(modelNo, hdprice, was, specialBuy, savingText, brand, productDesc, storeNumber, price7, price8,
				price9, price10);
		product.setBrand(product.getBrand().trim());  
		returnMap = catalogService.getLowePrice(product.getModelNo()); 
		
		
		productService.saveHDdata(product,returnMap.get("LowesSellingPrice") );
		
		if(null != product.getHdprice() && !returnMap.get("LowesSellingPrice").isEmpty() &&
				(Double.parseDouble(product.getHdprice()) >= Double.parseDouble(returnMap.get("LowesSellingPrice"))))
		{
			returnMap.put("noShow", "Y");
		}
		
		return returnMap; 
	}

	// ------------------- Update a Product
	// --------------------------------------------------------

	/*
	 * @RequestMapping(value = "/productPrice/{modelId}", method =
	 * RequestMethod.PUT) public ResponseEntity<Product>
	 * updateProduct(@PathVariable("modelId") String id, @RequestBody Product
	 * product) { System.out.println("Updating Model# " + id);
	 * 
	 * Product currentProduct = productService.findById(id);
	 * 
	 * if (currentProduct==null) { System.out.println("Model# " + id +
	 * " not found"); return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
	 * }
	 * 
	 * currentProduct.setPrice(product.getPrice());
	 * 
	 * 
	 * productService.updateProduct(currentProduct); return new
	 * ResponseEntity<Product>(currentProduct, HttpStatus.OK); }
	 */
	// ------------------- Delete a Product
	// --------------------------------------------------------

	@RequestMapping(value = "/productPrice/{modelId}", method = RequestMethod.DELETE)
	
	public ResponseEntity<HDProductInfo> deleteProduct(@PathVariable("modelId") String id) {
		System.out.println("Fetching & Deleting Model# " + id);

		HDProductInfo product = productService.findById(id);
		if (product == null) {
			System.out.println("Unable to delete. Model#  " + id + " not found");
			return new ResponseEntity<HDProductInfo>(HttpStatus.NOT_FOUND);
		}

		productService.deleteProductById(id);
		return new ResponseEntity<HDProductInfo>(HttpStatus.NO_CONTENT);
	}

	// ------------------- Delete All Product
	// --------------------------------------------------------

	@RequestMapping(value = "/productPrice/", method = RequestMethod.DELETE)
	public ResponseEntity<HDProductInfo> deleteAllProducts() {
		System.out.println("Deleting All Model#");

		productService.deleteAllProducts();
		return new ResponseEntity<HDProductInfo>(HttpStatus.NO_CONTENT);
	}

	public JSONObject comparePrice(String mid) throws IOException {
		Map<String,String> temp = new HashMap<String,String>();
		temp = catalogService.getLowePrice(mid);
		JSONObject Entity = new JSONObject(); 
		Set<String> keys = temp.keySet();
        for(String key:keys) {
        	Entity.put(key, temp.get(key));
        }
		
		return Entity;
	}
}
