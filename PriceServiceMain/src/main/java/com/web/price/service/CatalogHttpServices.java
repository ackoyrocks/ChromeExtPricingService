package com.web.price.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
//import com.mashape.unirest.http.*;

public class CatalogHttpServices {

	String CATALOG_SERVICES_AUTH_TOKEN="Basic QWRvYmU6ZW9pdWV3ZjA5ZmV3bw==";
	private String authToken;
	private ResourceBundle resourceBundle;
	

	public String getBynvalue(String URL) throws ClientProtocolException, IOException {
	
	
		
		HttpClient client = HttpClientBuilder.create().build();
		StringBuilder result = new StringBuilder();
		HttpGet getRequest = new HttpGet(URL);
		getRequest.addHeader("Authorization", getAuthToken());
		
				HttpResponse response;
		try {
			response = client.execute(getRequest);
			BufferedReader br = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			String output;
			while ((output = br.readLine()) != null) {
				result.append(output);
			}
			
		} catch (ClientProtocolException e) {
			
			throw e;
		} catch (IOException e) {
			
			throw e;
		}
		
		return result.toString();

	}

	public String getAuthToken() {
		if (StringUtils.isBlank(authToken)) {
			setAuthToken(CATALOG_SERVICES_AUTH_TOKEN);
		}
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public ResourceBundle getResourceBundle() {
		return resourceBundle;
	}

	public void setResourceBundle(ResourceBundle resourceBundle) {
		this.resourceBundle = resourceBundle;
	}

}
