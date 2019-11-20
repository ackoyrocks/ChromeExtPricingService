
package com.web.price.pojo;

import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.web.price.pojo.Breadcrumbs;
import com.web.price.pojo.Link;
//import com.web.price.pojo.ProductCount;
import com.web.price.pojo.ProductList;
public class CatalogServicesPOJO {

	private Long productCount;
	private List<Object> breadcrumbs = new ArrayList<Object>();
	private List<ProductList> productList = new ArrayList<ProductList>();
	private List<Link> links = new ArrayList<Link>();
	private Layout layout;
	public Long getProductCount() {
		return productCount;
	}
	public void setProductCount(Long productCount) {
		this.productCount = productCount;
	}
	public List<Object> getBreadcrumbs() {
		return breadcrumbs;
	}
	public void setBreadcrumbs(List<Object> breadcrumbs) {
		this.breadcrumbs = breadcrumbs;
	}
	public List<ProductList> getProductList() {
		return productList;
	}
	public void setProductList(List<ProductList> productList) {
		this.productList = productList;
	}
	public List<Link> getLinks() {
		return links;
	}
	public void setLinks(List<Link> links) {
		this.links = links;
	}
	public Layout getLayout() {
		return layout;
	}
	public void setLayout(Layout layout) {
		this.layout = layout;
	}
	public String getJvmName() {
		return jvmName;
	}
	public void setJvmName(String jvmName) {
		this.jvmName = jvmName;
	}
	public RequestParams getRequestParams() {
		return requestParams;
	}
	public void setRequestParams(RequestParams requestParams) {
		this.requestParams = requestParams;
	}
	private String jvmName;
	private RequestParams requestParams;
	

	

	}
