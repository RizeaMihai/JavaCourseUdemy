package com.company;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger (String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;

    }


    public void addHealthyAddition1 (String hAdd1Name, double hAdd1Price){
        healthyExtra1Price = hAdd1Price;
        System.out.println("Adding " + hAdd1Name + " for an extra " + hAdd1Price);
    }

    public void addHealthyAddition2 (String hAdd2Name, double hAdd2Price){
        healthyExtra2Price = hAdd2Price;
        System.out.println("Adding " + hAdd2Name + " for an extra " + hAdd2Price);
    }

    @Override
    public double itemizeHamburger () {
        return super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price;
    }
}
