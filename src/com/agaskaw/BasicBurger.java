package com.agaskaw;

public class BasicBurger {
    private String bradRoll;
    private String meat;
    private double price;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;
    private int countAddition;

    public BasicBurger(Addition addition1, Addition addition2, Addition addition3, Addition addition4) {
        this.bradRoll = "white bread roll";
        this.meat = "pork meat";
        this.price = 4.0+addition1.getPrice()+addition2.getPrice()+addition3.getPrice()+addition4.getPrice();
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.addition4 = addition4;
        this.countAddition = 4;
    }

    public BasicBurger(Addition addition1, Addition addition2, Addition addition3){
        this.bradRoll = "white bread roll";
        this.meat = "pork meat";
        this.price = 4.0+addition1.getPrice()+addition2.getPrice()+addition3.getPrice();
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.countAddition=3;
    }

    public BasicBurger(Addition addition1, Addition addition2) {
        this.bradRoll = "white brad roll";
        this.meat = "pork meat";
        this.price = 4.0+addition1.getPrice()+addition2.getPrice();
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.countAddition=2;
    }

    public BasicBurger(Addition addition1) {
        this.bradRoll = "white bread roll";
        this.meat = "pork meat";
        this.price = 4.0+addition1.getPrice();
        this.addition1 = addition1;
        this.countAddition=1;
    }

    public BasicBurger() {
        this.bradRoll = "white bread roll";
        this.meat = "pork meat";
        this.price = 4.0;
        this.countAddition=0;
    }

    public double getPrice() {
        return price;
    }

        public Addition getAddition1() {
        return addition1;
    }

    public Addition getAddition2() {
        return addition2;
    }

    public Addition getAddition3() {
        return addition3;
    }

    public Addition getAddition4() {
        return addition4;
    }

    public void showTotal(){
        switch(countAddition) {
            case 0:
                System.out.println("Total burger price is "+this.getPrice()+" no additions were chosen.");
            case 1:
                System.out.println("Total burger price is " + this.getPrice() +
                        " additions are " + addition1.getAdditionName() +
                        " cost of " + addition1.getPrice()+
                        ". Basic price of burger is "+(this.getPrice()-addition1.getPrice()));
                break;

            case 2:
                System.out.println("Total burger price is " + this.getPrice() +
                        " additions are " + addition1.getAdditionName() +
                        " cost of " + addition1.getPrice() +
                        " and " + addition2.getAdditionName() +
                        " cost of " + addition2.getPrice()+
                        ". Basic price of burger is "+(this.getPrice()-addition1.getPrice()-addition2.getPrice()));
                break;

            case 3:
                System.out.println("Total burger price is " + this.getPrice() +
                        " additions are " + addition1.getAdditionName() +
                        " cost of " + addition1.getPrice() +
                        " and " + addition2.getAdditionName() +
                        " cost of " + addition2.getPrice() +
                        " and " + addition3.getAdditionName() +
                        " cost of " + addition3.getPrice()+
                        ". Basic price of burger is "+(this.getPrice()-addition1.getPrice()-addition2.getPrice()-addition3.getPrice()));
                break;

            case 4:
                System.out.println("Total burger price is " + this.getPrice() +
                        " additions are " + addition1.getAdditionName() +
                        " cost of " + addition1.getPrice() +
                        " and " + addition2.getAdditionName() +
                        " cost of " + addition2.getPrice() +
                        " and " + addition3.getAdditionName() +
                        " cost of " + addition3.getPrice() +
                        " and " + addition4.getAdditionName() +
                        " cost of " + addition4.getPrice()+
                        ". Basic price of burger is "+(this.getPrice()-addition1.getPrice()-addition2.getPrice()-addition3.getPrice()+addition4.getPrice()));
                break;

                default:
                    System.out.println("I've got lost... sorry...");
                    break;
        }



    }

}

