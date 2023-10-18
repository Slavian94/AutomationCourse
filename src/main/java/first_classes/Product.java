package first_classes;

import java.math.BigDecimal;

public class Product {

    private String productName;
    private int productCode;
    private BigDecimal price;
    private String productDescription;
    private double availability;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getAvailability() {
        return availability;
    }

    public void setAvailability(double availability) {
        this.availability = availability;
    }
}

