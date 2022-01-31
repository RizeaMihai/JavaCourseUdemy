package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Miez", 1040.22);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.34);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(5);

        for (int i=0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }
        intList.add(1,2);
        System.out.println();
        for (int i=0; i < intList.size(); i++){
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
