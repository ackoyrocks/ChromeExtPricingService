
package com.web.price.pojo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

public class ProductList {

	private String networkPrice;
	 private JsonNode pricing;
	

	public JsonNode getPricing() {
		return pricing;
	}

	public void setPricing(JsonNode pricing) {
		this.pricing = pricing;
	}

	private String description;
	private String brand;
	private Long productId;
	private String itemNumber;
	private String modelId;
	private String vendorNumber;
	private Double rating;
	private Long reviewCount;
	private ImageUrls imageUrls;
	private String type;
	private Long mulQuantity;
	private Long minQuantity;
	private List<Link> links = new ArrayList<Link>();
	private String disclaimer;

	/**
	 * 
	 * @return The networkPrice
	 */
	public String getNetworkPrice() {
		return networkPrice;
	}

	/**
	 * 
	 * @param networkPrice
	 *            The networkPrice
	 */
	public void setNetworkPrice(String networkPrice) {
		this.networkPrice = networkPrice;
	}

	/**
	 * 
	 * @return The description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 *            The description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * 
	 * @return The brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * 
	 * @param brand
	 *            The brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * 
	 * @return The productId
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * 
	 * @param productId
	 *            The productId
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * 
	 * @return The itemNumber
	 */
	public String getItemNumber() {
		return itemNumber;
	}

	/**
	 * 
	 * @param itemNumber
	 *            The itemNumber
	 */
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	/**
	 * 
	 * @return The modelId
	 */
	public String getModelId() {
		return modelId;
	}

	/**
	 * 
	 * @param modelId
	 *            The modelId
	 */
	public void setModelId(String modelId) {
		this.modelId = modelId;
	}

	/**
	 * 
	 * @return The vendorNumber
	 */
	public String getVendorNumber() {
		return vendorNumber;
	}

	/**
	 * 
	 * @param vendorNumber
	 *            The vendorNumber
	 */
	public void setVendorNumber(String vendorNumber) {
		this.vendorNumber = vendorNumber;
	}

	/**
	 * 
	 * @return The rating
	 */
	public Double getRating() {
		return rating;
	}

	/**
	 * 
	 * @param rating
	 *            The rating
	 */
	public void setRating(Double rating) {
		this.rating = rating;
	}

	/**
	 * 
	 * @return The reviewCount
	 */
	public Long getReviewCount() {
		return reviewCount;
	}

	/**
	 * 
	 * @param reviewCount
	 *            The reviewCount
	 */
	public void setReviewCount(Long reviewCount) {
		this.reviewCount = reviewCount;
	}

	/**
	 * 
	 * @return The imageUrls
	 */
	public ImageUrls getImageUrls() {
		return imageUrls;
	}

	/**
	 * 
	 * @param imageUrls
	 *            The imageUrls
	 */
	public void setImageUrls(ImageUrls imageUrls) {
		this.imageUrls = imageUrls;
	}

	/**
	 * 
	 * @return The type
	 */
	public String getType() {
		return type;
	}

	/**
	 * 
	 * @param type
	 *            The type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 
	 * @return The mulQuantity
	 */
	public Long getMulQuantity() {
		return mulQuantity;
	}

	/**
	 * 
	 * @param mulQuantity
	 *            The mulQuantity
	 */
	public void setMulQuantity(Long mulQuantity) {
		this.mulQuantity = mulQuantity;
	}

	/**
	 * 
	 * @return The minQuantity
	 */
	public Long getMinQuantity() {
		return minQuantity;
	}

	/**
	 * 
	 * @param minQuantity
	 *            The minQuantity
	 */
	public void setMinQuantity(Long minQuantity) {
		this.minQuantity = minQuantity;
	}

	/**
	 * 
	 * @return The links
	 */
	public List<Link> getLinks() {
		return links;
	}

	/**
	 * 
	 * @param links
	 *            The links
	 */
	public void setLinks(List<Link> links) {
		this.links = links;
	}

	/**
	 * 
	 * @return The disclaimer
	 */
	public String getDisclaimer() {
		return disclaimer;
	}

	/**
	 * 
	 * @param disclaimer
	 *            The disclaimer
	 */
	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}

}
