
package com.web.price.lws.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Price {

    @SerializedName("savings")
    @Expose
    private Savings savings;
    @SerializedName("selling")
    @Expose
    private String selling;
    @SerializedName("retail")
    @Expose
    private String retail;
    @SerializedName("was")
    @Expose
    private String was;
    @SerializedName("typeCode")
    @Expose
    private long typeCode;
    @SerializedName("typeIndicator")
    @Expose
    private String typeIndicator;

    public Savings getSavings() {
        return savings;
    }

    public void setSavings(Savings savings) {
        this.savings = savings;
    }

    public String getSelling() {
        return selling;
    }

    public void setSelling(String selling) {
        this.selling = selling;
    }

    public String getRetail() {
        return retail;
    }

    public void setRetail(String retail) {
        this.retail = retail;
    }

    public String getWas() {
        return was;
    }

    public void setWas(String was) {
        this.was = was;
    }

    public long getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(long typeCode) {
        this.typeCode = typeCode;
    }

    public String getTypeIndicator() {
        return typeIndicator;
    }

    public void setTypeIndicator(String typeIndicator) {
        this.typeIndicator = typeIndicator;
    }

}
