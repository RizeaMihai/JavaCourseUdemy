package com.company;

public class Hamburger {
    private String breadRollType;
    private String name;
    private double price;
    private String meat;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;


    public Hamburger (String name, String meat, double price, String breadRollType) {
        this.breadRollType = breadRollType;
        this.name = name;
        this.price = price;
        this.meat = meat;
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
        System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat + ", price is " + price);
    }

    public void addHamburgerAddition1(String firstAddName, double firstAddPrice){
        addition1Price = firstAddPrice;
        System.out.println("Adding " + firstAddName + " for an extra " + firstAddPrice);
    }

    public void addHamburgerAddition2(String secondAddName, double secondAddPrice){
        addition2Price = secondAddPrice;
        System.out.println("Adding " + secondAddName + " for an extra " + secondAddPrice);
    }

    public void addHamburgerAddition3(String thirdAddName, double thirdAddPrice){
        addition3Price = thirdAddPrice;
        System.out.println("Adding " + thirdAddName + " for an extra " + thirdAddPrice);
    }

    public void addHamburgerAddition4(String forthAddName, double forthAddPrice){
        addition4Price = forthAddPrice;
        System.out.println("Adding " + forthAddName + " for an extra " + forthAddPrice);
    }

    public double itemizeHamburger(){

        this.price +=  addition1Price + addition2Price + addition3Price + addition4Price;
        return this.price;
    }

}




