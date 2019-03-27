package com.agaskaw;

public class Addition {
    private String additionName;
    private double price;

    public Addition(String additionName, double price) {
        this.additionName = additionName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getAdditionName() {
        return additionName;
    }
}
