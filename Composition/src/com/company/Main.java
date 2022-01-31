package com.company;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B", "dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27 inch Beast","Acer", 27, new Resolution(2540,1440));
        Motherboard theMotherboard = new Motherboard("BJ-200","Asus", 4, 6,"v2.44");
        PC thePC = new PC(theCase,theMonitor,theMotherboard);

        thePC.powerUP();

        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("modern",4,3,2,1);

        Lamp lamp = new Lamp("Classic",false,75);

        Bedroom bedroom = new Bedroom("Tims", wall1, wall2, wall3, wall4,ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();


    }
}
