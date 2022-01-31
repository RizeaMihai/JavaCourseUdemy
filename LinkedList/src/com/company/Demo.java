package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main (String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();
//        placesToVisit.add("Timisoara");
//        placesToVisit.add("Cluj");
//        placesToVisit.add("Sureanu");
//        placesToVisit.add("Bucuresti");
//        placesToVisit.add("Magura");
//        placesToVisit.add("Fundatica");
        addInOrder(placesToVisit, "Timisoara");
        addInOrder(placesToVisit, "Cluj");
        addInOrder(placesToVisit, "Sureanu");
        addInOrder(placesToVisit, "Bucuresti");
        addInOrder(placesToVisit, "Magura");
        addInOrder(placesToVisit, "Fundatica");

        printList(placesToVisit);

        addInOrder(placesToVisit, "Tg Mures");
        addInOrder(placesToVisit, "Cluj");
        printList(placesToVisit);

        visit(placesToVisit);
//
//        placesToVisit.add(4,"Brasov");
//        printList(placesToVisit);
//
//        placesToVisit.remove(3);
//        printList(placesToVisit);

    }

    private static void printList (LinkedList<String> listToPrint) {
        Iterator<String> i = listToPrint.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("====================================");
    }

    private static boolean addInOrder (LinkedList<String> listToOrder, String newCity) {
        ListIterator<String> stringListIterator = listToOrder.listIterator();
        while (stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                //equal, don't add this city
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0){
                //new city should apear before this one
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                // don't add anything
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit (LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        if (cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday is over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }

    }

    private static void printMenu () {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" + "1 - go to next city\n" + "2 - go to previous city\n" + "3 - to print the menu options");
    }
}
