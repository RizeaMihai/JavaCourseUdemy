package com.company;

public class DeluxeBurger extends  Hamburger {

    public DeluxeBurger(){
        super("Deluxe", "Sausage and bacon", 15.2d , "White");
        super.addHamburgerAddition1("chips", 2.5d);
        super.addHamburgerAddition2("drink", 1.4d);
    }

    @Override
    public void addHamburgerAddition1 (String firstAddName, double firstAddPrice) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2 (String secondAddName, double secondAddPrice) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3 (String thirdAddName, double thirdAddPrice) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4 (String forthAddName, double forthAddPrice) {
        System.out.println("No additional items can be added to a deluxe burger");
    }
}
