
package com.web.price.lws.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContentMapping {

    @SerializedName("mainContent")
    @Expose
    private List<String> mainContent = null;
    @SerializedName("fullwidthContent")
    @Expose
    private List<String> fullwidthContent = null;
    @SerializedName("secondaryContent")
    @Expose
    private List<String> secondaryContent = null;
    @SerializedName("headerContent")
    @Expose
    private List<String> headerContent = null;

    public List<String> getMainContent() {
        return mainContent;
    }

    public void setMainContent(List<String> mainContent) {
        this.mainContent = mainContent;
    }

    public List<String> getFullwidthContent() {
        return fullwidthContent;
    }

    public void setFullwidthContent(List<String> fullwidthContent) {
        this.fullwidthContent = fullwidthContent;
    }

    public List<String> getSecondaryContent() {
        return secondaryContent;
    }

    public void setSecondaryContent(List<String> secondaryContent) {
        this.secondaryContent = secondaryContent;
    }

    public List<String> getHeaderContent() {
        return headerContent;
    }

    public void setHeaderContent(List<String> headerContent) {
        this.headerContent = headerContent;
    }

}
