
package com.web.price.lws.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageUrls {

    @SerializedName("sm")
    @Expose
    private String sm;
    @SerializedName("md")
    @Expose
    private String md;
    @SerializedName("lg")
    @Expose
    private String lg;
    @SerializedName("xl")
    @Expose
    private String xl;

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }

    public String getMd() {
        return md;
    }

    public void setMd(String md) {
        this.md = md;
    }

    public String getLg() {
        return lg;
    }

    public void setLg(String lg) {
        this.lg = lg;
    }

    public String getXl() {
        return xl;
    }

    public void setXl(String xl) {
        this.xl = xl;
    }

}
