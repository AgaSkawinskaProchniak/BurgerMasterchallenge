package com.agaskaw;

public class DeluxeBurger extends BasicBurger {
    private String beverage;
    private String chips;
    private double price;

    public DeluxeBurger(String beverage) {
        this.beverage = beverage;
        this.chips = "chips";
        this.price=5.50;
    }

    public String getBeverage() {
        return beverage;
    }

    @Override
    public void showTotal() {
        System.out.println("Deluxe Burger is "+this.price+" no additions, chips and "+this.getBeverage());
    }
}
