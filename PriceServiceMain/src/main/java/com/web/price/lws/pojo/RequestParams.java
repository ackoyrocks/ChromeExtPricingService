
package com.web.price.lws.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RequestParams {

    @SerializedName("storeNumber")
    @Expose
    private String storeNumber;
    @SerializedName("offset")
    @Expose
    private long offset;
    @SerializedName("maxResults")
    @Expose
    private long maxResults;
    @SerializedName("showURL")
    @Expose
    private boolean showURL;
    @SerializedName("rollUpVariants")
    @Expose
    private boolean rollUpVariants;
    @SerializedName("channelType")
    @Expose
    private String channelType;
    @SerializedName("employee")
    @Expose
    private boolean employee;

    public String getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(String storeNumber) {
        this.storeNumber = storeNumber;
    }

    public long getOffset() {
        return offset;
    }

    public void setOffset(long offset) {
        this.offset = offset;
    }

    public long getMaxResults() {
        return maxResults;
    }

    public void setMaxResults(long maxResults) {
        this.maxResults = maxResults;
    }

    public boolean isShowURL() {
        return showURL;
    }

    public void setShowURL(boolean showURL) {
        this.showURL = showURL;
    }

    public boolean isRollUpVariants() {
        return rollUpVariants;
    }

    public void setRollUpVariants(boolean rollUpVariants) {
        this.rollUpVariants = rollUpVariants;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public boolean isEmployee() {
        return employee;
    }

    public void setEmployee(boolean employee) {
        this.employee = employee;
    }

}
