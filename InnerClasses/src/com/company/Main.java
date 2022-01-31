package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        Gearbox dacia = new Gearbox(6);
//        Gearbox.Gear first = dacia.new Gear(1, 12.3);
//        Gearbox.Gear second = new Gearbox.Gear(2, 15.4);  GRESIT
//        Gearbox.Gear third = new Gearbox.Gear(3, 17.8);   GRESIT
//        System.out.println(first.driveSpeed(1000));

//        dacia.operateClucth(true);
//        dacia.changeGear(1);
//        dacia.operateClucth(false);
//        System.out.println(dacia.wheelSpeed(1000));
//        dacia.changeGear(2);
//        System.out.println(dacia.wheelSpeed(3000));
//        dacia.operateClucth(true);
//        dacia.changeGear(3);
//        dacia.operateClucth(false);
//        System.out.println(dacia.wheelSpeed(6000));

//        class ClickListener implements Button.OnClickListener {
//            public ClickListener() {
//                System.out.println("I've been attached");
//            }
//
//            @Override
//            public void onClick (String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//        btnPrint.setOnClickListener(new ClickListener() {
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick (String title) {
                System.out.println(title + " was clicked");
            }
        });

        listen();
    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
