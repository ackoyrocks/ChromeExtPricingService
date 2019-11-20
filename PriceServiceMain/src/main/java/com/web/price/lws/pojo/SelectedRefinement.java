
package com.web.price.lws.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SelectedRefinement {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("navStateID")
    @Expose
    private long navStateID;
    @SerializedName("seoUrl")
    @Expose
    private Object seoUrl;
    @SerializedName("multiSelect")
    @Expose
    private Object multiSelect;
    @SerializedName("refinementValues")
    @Expose
    private List<RefinementValue> refinementValues = null;

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

    public Object getMultiSelect() {
        return multiSelect;
    }

    public void setMultiSelect(Object multiSelect) {
        this.multiSelect = multiSelect;
    }

    public List<RefinementValue> getRefinementValues() {
        return refinementValues;
    }

    public void setRefinementValues(List<RefinementValue> refinementValues) {
        this.refinementValues = refinementValues;
    }

}
