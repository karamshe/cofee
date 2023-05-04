package org.example.model;

public class MilkType {

    private String milkName;
    private Double price;

    public MilkType(String milkName, Double price) {
        this.milkName = milkName;
        this.price = price;
    }

    public String getMilkName() {
        return milkName;
    }

    public void setMilkName(String milkName) {
        this.milkName = milkName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
