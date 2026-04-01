package br.com.mirante.toolbox.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DadosProduto {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("sku")
    @Expose
    private String sku;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("variant")
    @Expose
    private String variant;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("list")
    @Expose
    private String list;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("productModel")
    @Expose
    private String productModel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getVariant() {
        return variant;
    }

    public void setVariant(String variant) {
        this.variant = variant;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getProductModel() {
        return productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

}
