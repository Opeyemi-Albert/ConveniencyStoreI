package Products;

import Enum.Category;

public class Product {
    private String productDescription;
    private String productName;
    private Integer price;
    private Integer discount;
    private Category category;


    public Product( String productDescription, String productName, Integer price, Integer discount, Category category) {
        this.productDescription = productDescription;
        this.productName = productName;
        this.price = price;
        this.discount = discount;
        this.category = category;
    }

    public Product() {
    }


    public String getProductDescription() {return productDescription;}

    public void setProductDescription(String productDescription) {this.productDescription = productDescription;}

    public String getProductName() {return productName;}

    public void setProductName(String productName) {this.productName = productName;}

    public Integer getPrice() {return price;}

    public void setPrice(Integer price) {this.price = price;}

    public Integer getDiscount() {return discount;}

    public void setDiscount(Integer discount) {this.discount = discount;}

    public Category getCategory() {return category;}

    public void setCategory(Category category) {this.category = category;}

//    @Override
//    public String toString() {
//        return "Product{" +
//                ", productDescription='" + productDescription + '\'' +
//                ", productName='" + productName + '\'' +
//                ", price=" + price +
//                ", discount=" + discount +
//                ", category=" + category +
//                '}';
//    }
}
