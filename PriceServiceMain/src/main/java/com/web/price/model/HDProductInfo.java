package com.web.price.model;

public class HDProductInfo {
	// modelNo,hdprice, was, specialBuy, savingText, brand, productDesc
	private String modelNo;
	private String hdprice;
	private String was;
	private String specialBuy;
	private String savingText;
	private String brand;
	private String productDesc;
	private String storeNumber;
	private String price7;
	private String price8;
	private String price9;
	private String price10;
	
	
	public String getPrice10() {
		return price10;
	}
	public void setPrice10(String price10) {
		this.price10 = price10;
	}
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public String getHdprice() {
		return hdprice;
	}
	public void setHdprice(String hdprice) {
		this.hdprice = hdprice;
	}
	public String getWas() {
		return was;
	}
	public void setWas(String was) {
		this.was = was;
	}
	public String getSpecialBuy() {
		return specialBuy;
	}
	public void setSpecialBuy(String specialBuy) {
		this.specialBuy = specialBuy;
	}
	public String getSavingText() {
		return savingText;
	}
	public void setSavingText(String savingText) {
		this.savingText = savingText;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getStoreNumber() {
		return storeNumber;
	}
	public void setStoreNumber(String storeNumber) {
		this.storeNumber = storeNumber;
	}
	public String getPrice7() {
		return price7;
	}
	public void setPrice7(String price7) {
		this.price7 = price7;
	}
	public String getPrice8() {
		return price8;
	}
	public void setPrice8(String price8) {
		this.price8 = price8;
	}
	public String getPrice9() {
		return price9;
	}
	public void setPrice9(String price9) {
		this.price9 = price9;
	}
	public HDProductInfo(String modelNo, String hdprice, String was, String specialBuy, String savingText, String brand,
			String productDesc, String storeNumber, String price7, String price8, String price9, String price10) {
		super();
		this.modelNo = modelNo;
		this.hdprice = hdprice;
		this.was = was;
		this.specialBuy = specialBuy;
		this.savingText = savingText;
		this.brand = brand;
		this.productDesc = productDesc;
		this.storeNumber = storeNumber;
		this.price7 = price7;
		this.price8 = price8;
		this.price9 = price9;
		this.price10 = price10;
	}

}
