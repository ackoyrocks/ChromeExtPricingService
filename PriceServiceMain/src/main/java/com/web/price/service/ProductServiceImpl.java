package com.web.price.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.web.price.helper.Helper;
import com.web.price.model.HDProductInfo;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService{
	
	//private static final AtomicLong counter = new AtomicLong();
	
	@Autowired
	WriteExcel writeExcelService;
	
	private static List<HDProductInfo> products;
	
	static{
		products= populateDummyProducts();
	}

	public List<HDProductInfo> findAllProducts() {
		return products;
	}
	
	public HDProductInfo findById(String id) {
		
		
		for(HDProductInfo product : products){
			if(product.getModelNo().equals(id)){
				return product;
			}
		}
		return null;
	}
	
	public HDProductInfo findByPrice(String price) {
		
		/*for(HDProductInfo product : products){
			if(product.getPrice().equalsIgnoreCase(price)){
				return product;
			}
		}*/
		return null;
	}
	
	public void saveProduct(HDProductInfo product) {
		product.setModelNo(product.getModelNo());
		products.add(product);
		
	}

	public void updateProduct(HDProductInfo product) {
		int index = products.indexOf(product);
		products.set(index, product);
	}

	public void deleteProductById(String modelId) {
		
		for (Iterator<HDProductInfo> iterator = products.iterator(); iterator.hasNext(); ) {
		    HDProductInfo product = iterator.next();
		    if (product.getModelNo().equals(modelId)) {
		        iterator.remove();
		    }
		}
	}

	public boolean isModelIDExist(HDProductInfo product) {
		return findById(product.getModelNo())!=null;
	}

	private static List<HDProductInfo> populateDummyProducts(){
		List<HDProductInfo> products = new ArrayList<HDProductInfo>();
		/*products.add(new HDProductInfo("abc","10.20"));
		products.add(new HDProductInfo("efg","20"));
		products.add(new HDProductInfo("hij","30"));
		products.add(new HDProductInfo("xyz","40"));*/
		return products;
	}

	public void deleteAllProducts() {
		products.clear();
	}
	

	@Override
	public void saveHDdata(HDProductInfo product, String lowesPrice) {
		Helper helper = new Helper();
		if(null != product)
		{
			if(!product.getWas().isEmpty())
			{
				product.setWas( product.getWas().substring(product.getWas().indexOf('$'), product.getWas().length()));
		        
			}
			 if(!product.getSpecialBuy().isEmpty())
			{
				product.setSpecialBuy(product.getSpecialBuy().substring(product.getSpecialBuy().indexOf('$'), product.getSpecialBuy().length()));
			}
			 if(!product.getSavingText().isEmpty())
			{
				String temp1 = product.getSavingText().substring(product.getSavingText().indexOf('S'), product.getSavingText().indexOf(')')+1);
				String temp2 = product.getSavingText().substring(product.getSavingText().indexOf('t'), product.getSavingText().lastIndexOf('/')+5);
				product.setSavingText(temp1+temp2);
			}
			
			try {
				writeExcelService.writeDataToExcel(product, lowesPrice);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
