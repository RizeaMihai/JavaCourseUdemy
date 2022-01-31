package com.company;

public class Penguin extends Bird{

    public Penguin (String name) {
        super(name);
    }

    @Override
    public void fly () {
        super.fly();
        System.out.println(getName() + " said : I'm not very good at that, can we go for a swim instead?");
    }

    @Override
    public String getName () {
        return super.getName();
    }
}
