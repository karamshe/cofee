package org.example.model;

public class SizeType {
    private String sizeName;
    private Double price;

    public SizeType(String sizeName, Double price) {
        this.sizeName = sizeName;
        this.price = price;

    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

