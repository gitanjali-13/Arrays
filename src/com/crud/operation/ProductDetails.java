package com.crud.operation;

public class ProductDetails {
    String productName;
    float productPrize;
    int productCode;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getProductPrize() {
        return productPrize;
    }

    public void setProductPrize(int productPrize) {
        this.productPrize = productPrize;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    @Override
    public String toString() {
        return "ShopDetails{" +
                "productName='" + productName + '\'' +
                ", productPrize=" + productPrize +
                ", productCode=" + productCode +
                '}';
    }
}
