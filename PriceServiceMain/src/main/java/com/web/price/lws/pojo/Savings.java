
package com.web.price.lws.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Savings {

    @SerializedName("total")
    @Expose
    private String total;
    @SerializedName("totalPercentage")
    @Expose
    private long totalPercentage;
    @SerializedName("endDate")
    @Expose
    private long endDate;

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public long getTotalPercentage() {
        return totalPercentage;
    }

    public void setTotalPercentage(long totalPercentage) {
        this.totalPercentage = totalPercentage;
    }

    public long getEndDate() {
        return endDate;
    }

    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }

}
