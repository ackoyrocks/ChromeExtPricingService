package com.web.price.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;


public class PriceService {

	
	public Map<String,String> getBySellingPrice(String modelId) throws ClientProtocolException, IOException {
		
		Map<String,String> valueMap= new HashMap<String,String>();
		String sellingprice=null;
		String productURL = "";
		String productImage = "";
       
        	DefaultHttpClient httpClient = new DefaultHttpClient();

        	String CATALOG_SERVICES_HOSTA="https://lwssvcs.lowes.com";
        	String CATALOG_SERVICES_NVALUE_ENDPOINTB="/CatalogServices/product/keyword/v2_0?keyword={0}&maxResults=01&rollUpVariants=1&priceFlag=rangeBalance&storeNumber=0595&showURL=1&showJumpNav=1";
        	
        	 String encodemodelId = URLEncoder.encode(modelId, "UTF-8");
        	String URL = CATALOG_SERVICES_HOSTA + MessageFormat.format(CATALOG_SERVICES_NVALUE_ENDPOINTB, encodemodelId);
        	HttpGet getRequest = new HttpGet(URL);
        	
        	getRequest.addHeader("Authorization","Basic QWRvYmU6ZW9pdWV3ZjA5ZmV3bw==");

        	HttpResponse response = httpClient.execute(getRequest);

        	if (response.getStatusLine().getStatusCode() != 200) {
        		throw new RuntimeException("Failed : HTTP error code : "
        		   + response.getStatusLine().getStatusCode());

        	}


        	BufferedReader br = new BufferedReader(
                             new InputStreamReader((response.getEntity().getContent())));

        	String output;
        	
        	
        	try{
        		while ((output = br.readLine()) != null) {
            		//System.out.println(output);
            	
                     JsonObject jsonObject = new JsonParser().parse(output).getAsJsonObject();
                     sellingprice=jsonObject.get("productList").getAsJsonArray()
                    							  .get(0).getAsJsonObject()
                    							  .get("pricing").getAsJsonObject()
                    							  .get("price").getAsJsonObject()
                    							  .get("selling").getAsString();
                         
                            
                          // System.out.println(sellingprice);url
                     productURL =     jsonObject.get("productList").getAsJsonArray()
    						  .get(0).getAsJsonObject()
    						  .get("url").getAsString();
                     productImage = jsonObject.get("productList").getAsJsonArray()
    						  .get(0).getAsJsonObject()
    						  .get("imageUrls").getAsJsonObject()
    						  .get("md").getAsString();
                     String productRating = jsonObject.get("productList").getAsJsonArray()

                             .get(0).getAsJsonObject()

                             .get("rating").getAsString();
                     String reviewCount = jsonObject.get("productList").getAsJsonArray()

                             .get(0).getAsJsonObject()

                             .get("reviewCount").getAsString();

                     

                           String productRating1= productRating.substring(0, productRating.lastIndexOf('.')+2); 
                
                    // imageUrls
                     valueMap.put("LowesSellingPrice", sellingprice);
                     valueMap.put("LowesProductUrl", productURL);
                     valueMap.put("LowesProductImage", productImage);
                     valueMap.put("LowesProductRating", productRating1);
                     valueMap.put("LowesProductReviewCount", reviewCount);
        	}
        	}
        	finally {
				return valueMap;
			}
        	//System.out.println("Output from Server .... \n");
        	
        	
        	//return valueMap;
        }
	 
}