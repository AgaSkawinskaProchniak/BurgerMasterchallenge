package com.agaskaw;

public class Main {

    public static void main(String[] args) {
        Addition lettuce=new Addition("lettuce",0.50);
        Addition cheese=new Addition("cheese",1.0);
        Addition tomatoe=new Addition("tomatoe",0.50);
        Addition onion = new Addition("onion",0.25);
        Addition becon = new Addition("becon",1.0);
        Addition cucumber = new Addition("cucumber",0.25);
        Addition ketchup = new Addition("ketchup",0.25);
        Addition custard = new Addition("custard",0.25);
        Addition mayonesse = new Addition("mayonesse",0.25);

//two problems: healthy burger has problem with price, and something's wrong with showTotal price 
        BasicBurger burger = new BasicBurger();
        System.out.println("Basic burger is "+burger.getPrice());
        BasicBurger burgerWithAdds = new BasicBurger(lettuce,cheese,cucumber);
        System.out.println("Burger with lettuce, cheese and cucuber is "+burgerWithAdds.getPrice());
        HealthyBurger healthy = new HealthyBurger();
        System.out.println("Healty with no add is "+ healthy.getPrice());
        HealthyBurger healthy2 = new HealthyBurger(lettuce,cheese,cucumber,ketchup,custard,onion);
        System.out.println("Big burger with everything is "+healthy2.getPrice());
        DeluxeBurger deluxe = new DeluxeBurger("coke");
        healthy2.showTotal();
        burgerWithAdds.showTotal();
        DeluxeBurger bigBurger = new DeluxeBurger("coke");
        bigBurger.showTotal();


    }
}
