package com.web.price.service;

import java.util.List;

import com.web.price.model.HDProductInfo;



public interface ProductService {
	
	HDProductInfo findById(String modelId);
	
	HDProductInfo findByPrice(String price);
	
	void saveProduct(HDProductInfo product);
	
	void updateProduct(HDProductInfo product);
	
	void deleteProductById(String modelId);

	List<HDProductInfo> findAllProducts(); 
	
	void deleteAllProducts();
	
	public boolean isModelIDExist(HDProductInfo product);
	public void saveHDdata(HDProductInfo product, String lowesPrice);
	
}
