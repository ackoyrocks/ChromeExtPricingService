
package com.web.price.lws.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Availability {

    @SerializedName("availabilityStatus")
    @Expose
    private String availabilityStatus;
    @SerializedName("productStockType")
    @Expose
    private String productStockType;
    @SerializedName("availabileQuantity")
    @Expose
    private long availabileQuantity;
    @SerializedName("deliveryMethodId")
    @Expose
    private long deliveryMethodId;
    @SerializedName("deliveryMethodName")
    @Expose
    private String deliveryMethodName;
    @SerializedName("storeNumber")
    @Expose
    private long storeNumber;
    @SerializedName("leadTime")
    @Expose
    private long leadTime;

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public String getProductStockType() {
        return productStockType;
    }

    public void setProductStockType(String productStockType) {
        this.productStockType = productStockType;
    }

    public long getAvailabileQuantity() {
        return availabileQuantity;
    }

    public void setAvailabileQuantity(long availabileQuantity) {
        this.availabileQuantity = availabileQuantity;
    }

    public long getDeliveryMethodId() {
        return deliveryMethodId;
    }

    public void setDeliveryMethodId(long deliveryMethodId) {
        this.deliveryMethodId = deliveryMethodId;
    }

    public String getDeliveryMethodName() {
        return deliveryMethodName;
    }

    public void setDeliveryMethodName(String deliveryMethodName) {
        this.deliveryMethodName = deliveryMethodName;
    }

    public long getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(long storeNumber) {
        this.storeNumber = storeNumber;
    }

    public long getLeadTime() {
        return leadTime;
    }

    public void setLeadTime(long leadTime) {
        this.leadTime = leadTime;
    }

}
