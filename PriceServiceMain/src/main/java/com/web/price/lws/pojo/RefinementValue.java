
package com.web.price.lws.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RefinementValue {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("navStateID")
    @Expose
    private long navStateID;
    @SerializedName("seoUrl")
    @Expose
    private Object seoUrl;
    @SerializedName("productCount")
    @Expose
    private Object productCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNavStateID() {
        return navStateID;
    }

    public void setNavStateID(long navStateID) {
        this.navStateID = navStateID;
    }

    public Object getSeoUrl() {
        return seoUrl;
    }

    public void setSeoUrl(Object seoUrl) {
        this.seoUrl = seoUrl;
    }

    public Object getProductCount() {
        return productCount;
    }

    public void setProductCount(Object productCount) {
        this.productCount = productCount;
    }

}
