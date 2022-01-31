package com.company;

public class Main {

    public static void main(String[] args) {
//
//        int value = 3;
//        if ( value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 6;

        switch (switchValue)  {
            case 1:
                System.out.println("switchValue was 1");
                break;
            case 2:
                System.out.println("switchValue was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3, or 4, or 5");
                System.out.println("Actually was " + switchValue);
                break;
            default:
                System.out.println("switchValue wasn't 1, 2, 3, 4 or 5");
                break;
        }

        char caracterul = 'E';
        switch (caracterul) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Caracterul este " + caracterul);
                break;
            default:
                System.out.println("Not found");
        }

        String month = "jAnUaRy";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }

    }
}
