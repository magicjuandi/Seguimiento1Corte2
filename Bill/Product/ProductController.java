package com.Bill.Product;

public class ProductController {
    private Product modelP;
    private ProductView viewP;

    public ProductController(Product modelP, ProductView viewP) {
        this.modelP = modelP;
        this.viewP = viewP;
    }

    public String getProductName(){
        return modelP.getProductName();
    }
    public void setProductName(String ProductName){
        modelP.setProductName(ProductName);
    }
    public String getProductId(){
        return modelP.getProductId();
    }
    public void setProductId(String ProductId){
        modelP.setProductId(ProductId);
    }
    public String getProductPrice(){
        return modelP.getProductPrice();
    }
    public void setProductPrice(String ProductPrice){
        modelP.setProductPrice(ProductPrice);
    }
    public void updateViewP(){
        viewP.printProductDetails(getProductName(), getProductId(), getProductPrice());
    }
}
