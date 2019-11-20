package com.web.price.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.simple.JSONObject;
import org.springframework.context.annotation.Bean;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.web.price.pojo.CatalogServicesPOJO;
import com.web.price.pojo.Price;
import com.web.price.pojo.Pricing;
import com.web.price.pojo.ProductList;


@Service("catalogService")
public class CatalogServices {
	
	String CATALOG_SERVICES_HOSTA="https://lwssvcs.lowes.com";
	String CATALOG_SERVICES_NVALUE_ENDPOINTB="/CatalogServices/product/keyword/v2_0?keyword={0}&maxResults=01&rollUpVariants=1&priceFlag=rangeBalance&storeNumber=0595&showURL=1&showJumpNav=1";
	
	//private CatalogHttpServices catalogHttpServices  = new CatalogHttpServices();
	private ResourceBundle resourceBundle;
	
	//Lowes Network Price:
	
	public Map<String,String> getLowePrice(String modelId) throws  IOException {
		PriceService ps= new PriceService();
		return ps.getBySellingPrice(modelId);
		}
		
public ResourceBundle getResourceBundle() {
		return resourceBundle;
	}

	public void setResourceBundle(ResourceBundle resourceBundle) {
		this.resourceBundle = resourceBundle;
	}

	

}
