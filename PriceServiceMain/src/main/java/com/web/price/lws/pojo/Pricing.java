
package com.web.price.lws.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pricing {

    @SerializedName("productId")
    @Expose
    private long productId;
    @SerializedName("isSosVendorDirect")
    @Expose
    private boolean isSosVendorDirect;
    @SerializedName("price")
    @Expose
    private Price price;
    @SerializedName("availability")
    @Expose
    private List<Availability> availability = null;
    @SerializedName("@type")
    @Expose
    private String type;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public boolean isIsSosVendorDirect() {
        return isSosVendorDirect;
    }

    public void setIsSosVendorDirect(boolean isSosVendorDirect) {
        this.isSosVendorDirect = isSosVendorDirect;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public List<Availability> getAvailability() {
        return availability;
    }

    public void setAvailability(List<Availability> availability) {
        this.availability = availability;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
