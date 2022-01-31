package com.company;

public class Dog extends Animal{

    public Dog (String name) {
        super(name);
    }

    @Override
    public void eating () {
        System.out.println(getName() + " is eating!");
    }

    @Override
    public void breath () {
        System.out.println("Breath in, breath out, repeat");
    }
}
