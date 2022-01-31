package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(double creditLimit, String email){
        this("John Doe", creditLimit, email);
    }

    public VipCustomer(){
        this("John Doe Returns", 999999,"johndoereturns@email.com");
    }

    public String getName () {
        return name;
    }

    public double getCreditLimit () {
        return creditLimit;
    }

    public String getEmail () {
        return email;
    }
}
