
package com.web.price.lws.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Layout {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("contentMapping")
    @Expose
    private ContentMapping contentMapping;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContentMapping getContentMapping() {
        return contentMapping;
    }

    public void setContentMapping(ContentMapping contentMapping) {
        this.contentMapping = contentMapping;
    }

}
