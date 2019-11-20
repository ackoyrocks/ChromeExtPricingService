
package com.web.price.lws.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Breadcrumb {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("nValue")
    @Expose
    private String nValue;
    @SerializedName("url")
    @Expose
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNValue() {
        return nValue;
    }

    public void setNValue(String nValue) {
        this.nValue = nValue;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
