
package com.web.price.lws.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductList_ {

    @SerializedName("networkPrice")
    @Expose
    private String networkPrice;
    @SerializedName("pricing")
    @Expose
    private Pricing pricing;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("productId")
    @Expose
    private long productId;
    @SerializedName("itemNumber")
    @Expose
    private String itemNumber;
    @SerializedName("modelId")
    @Expose
    private String modelId;
    @SerializedName("vendorNumber")
    @Expose
    private String vendorNumber;
    @SerializedName("rating")
    @Expose
    private double rating;
    @SerializedName("reviewCount")
    @Expose
    private long reviewCount;
    @SerializedName("imageUrls")
    @Expose
    private ImageUrls imageUrls;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("mulQuantity")
    @Expose
    private long mulQuantity;
    @SerializedName("minQuantity")
    @Expose
    private long minQuantity;
    @SerializedName("disclaimer")
    @Expose
    private String disclaimer;
    @SerializedName("buyable")
    @Expose
    private long buyable;
    @SerializedName("published")
    @Expose
    private long published;
    @SerializedName("energyStar")
    @Expose
    private String energyStar;
    @SerializedName("lowesExclusive")
    @Expose
    private String lowesExclusive;
    @SerializedName("freeShipping")
    @Expose
    private long freeShipping;
    @SerializedName("links")
    @Expose
    private List<Link> links = null;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("hasVariants")
    @Expose
    private boolean hasVariants;
    @SerializedName("additionalBadges")
    @Expose
    private List<String> additionalBadges = null;
    @SerializedName("leadCapture")
    @Expose
    private boolean leadCapture;

    public String getNetworkPrice() {
        return networkPrice;
    }

    public void setNetworkPrice(String networkPrice) {
        this.networkPrice = networkPrice;
    }

    public Pricing getPricing() {
        return pricing;
    }

    public void setPricing(Pricing pricing) {
        this.pricing = pricing;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getVendorNumber() {
        return vendorNumber;
    }

    public void setVendorNumber(String vendorNumber) {
        this.vendorNumber = vendorNumber;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public long getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(long reviewCount) {
        this.reviewCount = reviewCount;
    }

    public ImageUrls getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(ImageUrls imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getMulQuantity() {
        return mulQuantity;
    }

    public void setMulQuantity(long mulQuantity) {
        this.mulQuantity = mulQuantity;
    }

    public long getMinQuantity() {
        return minQuantity;
    }

    public void setMinQuantity(long minQuantity) {
        this.minQuantity = minQuantity;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public long getBuyable() {
        return buyable;
    }

    public void setBuyable(long buyable) {
        this.buyable = buyable;
    }

    public long getPublished() {
        return published;
    }

    public void setPublished(long published) {
        this.published = published;
    }

    public String getEnergyStar() {
        return energyStar;
    }

    public void setEnergyStar(String energyStar) {
        this.energyStar = energyStar;
    }

    public String getLowesExclusive() {
        return lowesExclusive;
    }

    public void setLowesExclusive(String lowesExclusive) {
        this.lowesExclusive = lowesExclusive;
    }

    public long getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(long freeShipping) {
        this.freeShipping = freeShipping;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isHasVariants() {
        return hasVariants;
    }

    public void setHasVariants(boolean hasVariants) {
        this.hasVariants = hasVariants;
    }

    public List<String> getAdditionalBadges() {
        return additionalBadges;
    }

    public void setAdditionalBadges(List<String> additionalBadges) {
        this.additionalBadges = additionalBadges;
    }

    public boolean isLeadCapture() {
        return leadCapture;
    }

    public void setLeadCapture(boolean leadCapture) {
        this.leadCapture = leadCapture;
    }

}
