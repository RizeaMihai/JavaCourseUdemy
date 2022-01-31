package com.company;

import com.example.game.ISaveable;
import com.example.game.Monster;
import com.example.game.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Miez", 10, 100);
        System.out.println(player1.toString());
        saveObject(player1);

        player1.setHitPoints(20);
        System.out.println(player1);
        player1.setWeapon("Axe");
        saveObject(player1);
//        loadObject(player1);
        System.out.println(player1);

        ISaveable monster1 = new Monster("Dragon", 20, 1500);
        System.out.println("Strength = " + ((Monster) monster1).getStrength());
        System.out.println(monster1);
        saveObject(monster1);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject (ISaveable objectToSave) {
        for (int i=0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject (ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
