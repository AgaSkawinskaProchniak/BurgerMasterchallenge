package com.agaskaw;

public class HealthyBurger extends BasicBurger {
private String healthyBreadRoll;
private Addition addition5;
private Addition addition6;
private double price;
private int counter;


    public HealthyBurger() {
        this.healthyBreadRoll="brown rye bread roll";
        this.price= 4.50;

    }

    public HealthyBurger(Addition addition1, Addition addition2, Addition addition3, Addition addition4, Addition addition5, Addition addition6) {
        super(addition1, addition2, addition3, addition4);
        this.healthyBreadRoll = "brown rye bread roll";
        this.addition5 = addition5;
        this.addition6 = addition6;
        this.price=4.5+addition1.getPrice()+addition2.getPrice()+addition3.getPrice()+addition4.getPrice()+addition5.getPrice()+addition6.getPrice();
   this.counter=6;
    }

    public HealthyBurger(Addition addition1, Addition addition2, Addition addition3, Addition addition4, Addition addition5) {
        super(addition1, addition2, addition3, addition4);
        this.healthyBreadRoll = "brown rye bread roll";
        this.addition5 = addition5;
        this.price=4.5+addition1.getPrice()+addition2.getPrice()+addition3.getPrice()+addition4.getPrice()+addition5.getPrice();
        this.counter=5;
    }

    public HealthyBurger(Addition addition1, Addition addition2, Addition addition3, Addition addition4) {
        super(addition1, addition2, addition3, addition4);
        this.healthyBreadRoll = "brown rye bread roll";
        this.price=4.5+addition1.getPrice()+addition2.getPrice()+addition3.getPrice()+addition4.getPrice();
    }

    public HealthyBurger(Addition addition1, Addition addition2, Addition addition3) {
        super(addition1, addition2, addition3);
        this.healthyBreadRoll = "brown rye bread roll";
        this.price=4.5+addition1.getPrice()+addition2.getPrice()+addition3.getPrice();
    }

    public HealthyBurger(Addition addition1, Addition addition2) {
        super(addition1, addition2);
        this.healthyBreadRoll = "brown rye bread roll";
        this.price=4.5+addition1.getPrice()+addition2.getPrice();

    }
    public HealthyBurger(Addition addition1) {
        super(addition1);
        this.healthyBreadRoll = "brown rye bread roll";
        this.price=4.5+addition1.getPrice();
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void showTotal() {
        super.showTotal();
        switch (counter){
            case 5:
                System.out.println("Extra additions was : "+addition5.getAdditionName()+"cost of "+addition5.getPrice());
                break;
            case 6:
                System.out.println("Extra additions were: "+addition5.getAdditionName()+" cost of "+addition5.getPrice()+" and "+addition6.getAdditionName()+" cost of "+addition6.getPrice());
        }

    }
}
