package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Labrador");
        dog.eating();
        dog.breath();

//        Bird bird = new Bird("Papagal");
//        bird.eating();
//        bird.breath();

        Papagal american = new Papagal("George");
        american.eating();
        american.breath();
        american.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
