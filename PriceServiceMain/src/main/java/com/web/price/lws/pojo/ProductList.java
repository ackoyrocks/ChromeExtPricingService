
package com.web.price.lws.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProductList {

    @SerializedName("productCount")
    @Expose
    private long productCount;
    @SerializedName("breadcrumbs")
    @Expose
    private List<Breadcrumb> breadcrumbs = null;
    @SerializedName("categories")
    @Expose
    private List<Object> categories = null;
    @SerializedName("selectedRefinements")
    @Expose
    private List<SelectedRefinement> selectedRefinements = null;
    @SerializedName("productList")
    @Expose
    private List<ProductList_> productList = null;
    @SerializedName("sortMethods")
    @Expose
    private List<String> sortMethods = null;
    @SerializedName("links")
    @Expose
    private List<Link_> links = null;
    @SerializedName("layout")
    @Expose
    private Layout layout;
    @SerializedName("jvmName")
    @Expose
    private String jvmName;
    @SerializedName("requestParams")
    @Expose
    private RequestParams requestParams;

    public long getProductCount() {
        return productCount;
    }

    public void setProductCount(long productCount) {
        this.productCount = productCount;
    }

    public List<Breadcrumb> getBreadcrumbs() {
        return breadcrumbs;
    }

    public void setBreadcrumbs(List<Breadcrumb> breadcrumbs) {
        this.breadcrumbs = breadcrumbs;
    }

    public List<Object> getCategories() {
        return categories;
    }

    public void setCategories(List<Object> categories) {
        this.categories = categories;
    }

    public List<SelectedRefinement> getSelectedRefinements() {
        return selectedRefinements;
    }

    public void setSelectedRefinements(List<SelectedRefinement> selectedRefinements) {
        this.selectedRefinements = selectedRefinements;
    }

    public List<ProductList_> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductList_> productList) {
        this.productList = productList;
    }

    public List<String> getSortMethods() {
        return sortMethods;
    }

    public void setSortMethods(List<String> sortMethods) {
        this.sortMethods = sortMethods;
    }

    public List<Link_> getLinks() {
        return links;
    }

    public void setLinks(List<Link_> links) {
        this.links = links;
    }

    public Layout getLayout() {
        return layout;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    public String getJvmName() {
        return jvmName;
    }

    public void setJvmName(String jvmName) {
        this.jvmName = jvmName;
    }

    public RequestParams getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(RequestParams requestParams) {
        this.requestParams = requestParams;
    }

}
