package com.web.price.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import org.json.JSONArray;
import org.json.JSONObject;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.Gson;
//import com.web.price.lws.pojo.Breadcrumbs;

//import com.web.price.pojo.ProductList;
//import com.web.price.lws.pojo.SelectedRefinements;
import com.web.price.pojo.CatalogServicesPOJO;
 

@SuppressWarnings("deprecation")
public class JsonParseDATA {

	@SuppressWarnings({ "resource" })
	
		
		public String getSellvalue(String modelId) throws ClientProtocolException, IOException{
			
		String s,sl;
		//File jsonFile = new File("C:/Users/akanand/Desktop/price.json");
	//	try {

			//String URL_lowes="https://lwssvcs.lowes.com/CatalogServices/product/keyword/v2_0?keyword=GFE28GMKES&maxResults=01&rollUpVariants=1&priceFlag=rangeBalance&storeNumber=0595&showURL=1&showJumpNav=1";
				DefaultHttpClient httpClient = new DefaultHttpClient();

				String CATALOG_SERVICES_HOSTA="https://lwssvcs.lowes.com";
				String CATALOG_SERVICES_NVALUE_ENDPOINTB="/CatalogServices/product/keyword/v2_0?keyword={0}&maxResults=01&rollUpVariants=1&priceFlag=rangeBalance&storeNumber=0595&showURL=1&showJumpNav=1";
				String URL = CATALOG_SERVICES_HOSTA + MessageFormat.format(CATALOG_SERVICES_NVALUE_ENDPOINTB, modelId);
				HttpGet getRequest = new HttpGet(URL);
				
				getRequest.addHeader("Authorization","Basic QWRvYmU6ZW9pdWV3ZjA5ZmV3bw==");

				HttpResponse response = httpClient.execute(getRequest);

				if (response.getStatusLine().getStatusCode() != 200) {
					throw new RuntimeException("Failed : HTTP error code : "
					   + response.getStatusLine().getStatusCode());
		
				}

			
				BufferedReader br = new BufferedReader(
		                         new InputStreamReader((response.getEntity().getContent())));
//String s;
				String output,sf;
				ArrayList jsonObjList = null;
				System.out.println("Output from Server .... \n");
				while ((output = br.readLine()) != null) {
					System.out.println(output);
				//	try {
						
						JsonParser jsonParser = new JsonParser();
			            JsonObject jo = (JsonObject)jsonParser.parse(output);
			            JsonArray jsonArr = jo.getAsJsonArray("productList");
			            //jsonArr.
			            Gson googleJson = new Gson();
			             jsonObjList = googleJson.fromJson(jsonArr, ArrayList.class);
			            System.out.println("List size is : "+jsonObjList.size());
			                    System.out.println("List Elements are  : "+jsonObjList.toString());
			                    
			                    
			                    
			                   // System.out.println(jsonObjList.toArray(a));
			                   
	//System.out.println(str);
	//String sell="[{networkPrice=2799.0, pricing={productId=1.000048163E9, isSosVendorDirect=false, price={savings={total=1000.00, totalPercentage=35.0, endDate=1.50536154E12}, selling=1799.00, retail=1799.00, was=2799.00, typeCode=7.0, typeIndicator=Advertised}, availability=[{availabilityStatus=Not Available, productStockType=STK, availabileQuantity=0.0, deliveryMethodId=1.0, deliveryMethodName=Parcel Shipping, storeNumber=9998.0}, {availabilityStatus=Available, productStockType=STK, availabileQuantity=1.0, leadTime=1.5051024E12, deliveryMethodId=2.0, deliveryMethodName=Store Pickup, storeNumber=595.0}, {availabilityStatus=Available, productStockType=STK, availabileQuantity=1.0, leadTime=1.5051024E12, deliveryMethodId=3.0, deliveryMethodName=Truck Delivery, storeNumber=595.0}], @type=item}, description=27.8-cu ft French Door Refrigerator with Ice Maker (Slate) ENERGY STAR, brand=GE, productId=1.000048163E9, itemNumber=786384, modelId=GFE28GMKES, vendorNumber=83, rating=4.4482, reviewCount=357.0, imageUrls={sm=https://mobileimages.lowes.com/product/converted/084691/084691819028sm.jpg, md=https://mobileimages.lowes.com/product/converted/084691/084691819028md.jpg, lg=https://mobileimages.lowes.com/product/converted/084691/084691819028lg.jpg, xl=https://mobileimages.lowes.com/product/converted/084691/084691819028.jpg}, type=LOCALONLY, mulQuantity=0.0, minQuantity=0.0, disclaimer=In-use/lifestyle images; accessories not included, buyable=1.0, published=1.0, energyStar=Yes, lowesExclusive=No, freeShipping=1.0, links=[{rel=review, href=https://lwssvcs.lowes.com/BazaarVoiceServices/0534/1000048163/reviews.xml?apiversion=5.4&format=embedded&sort=helpfulness&dir=desc&num=5&page=1}, {rel=questions&answers, href=https://lwssvcs.lowes.com/BazaarVoiceServices/answers/0534/product/1000048163/questions.xml?apiversion=5.4&format=embedded&include=answers&sort=helpfulness&dir=desc&num=5&page=1}, {rel=epp, href=https://lwssvcs.lowes.com/commerce/resources/store/10151/product/1000048163/epp/v1_0}, {rel=epc, href=https://lwssvcs.lowes.com/commerce/resources/store/10151/product/1000048163/assets/v1_0}, {rel=relatedItems, href=https://lwssvcs.lowes.com/CatalogServices/product/1000048163/relateditems/v1_0}, {rel=requiredItems, href=https://lwssvcs.lowes.com/CatalogServices/product/1000048163/requireditems/v1_0}, {rel=specifications, href=https://lwssvcs.lowes.com/CatalogServices/product/1000048163/specifications/v1_0}, {rel=bullets, href=https://lwssvcs.lowes.com/CatalogServices/product/1000048163/bullets/v1_0}, {rel=reminder, href=https://lwssvcs.lowes.com/commerce/resources/store/10151/reminder/v1_0}, {rel=addItemToCart, href=https://lwssvcs.lowes.com/commerce/resources/store/10151/order/item/v1_0}, {rel=saveItem, href=https://lwssvcs.lowes.com/MyLowes/app/resource/bin/list/product/v1_0}, {rel=customeralsoviewed, href=https://lwssvcs.lowes.com/CatalogServices/product/1000048163/customerviewed/v1_0}, {rel=location, href=https://lwssvcs.lowes.com/CatalogServices/product/locations/v1_0?devId=devId&storeNumber=0595&itemNumber=786384}], url=/pd/GE-27-8-cu-ft-French-Door-Refrigerator-with-Ice-Maker-Slate-ENERGY-STAR/1000048163, hasVariants=false, additionalBadges=[Free Delivery], leadCapture=false}]\r\n";
			      
			      
	
					
				}
				return splitJson(jsonObjList.toString());
               // return sf;
				//return output;

			//	httpClient.getConnectionManager().shutdown();
				//httpClient.close();

			  
		//return s=sl;
		
	}

public String splitJson(String str){
	String sl1=null;
	//Strings s;
	String[] abc1= str.split(",");
for(  String s : abc1)
	{
	  if(s.contains("selling"))
	  {
	  //System.out.println(sl1);
	  String [] slar=s.split("=");
	  sl1=slar[1];
	  
	 
	  }
	
	}
return sl1;

}

}