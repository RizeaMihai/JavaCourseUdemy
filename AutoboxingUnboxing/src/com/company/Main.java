package com.company;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass (int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue () {
        return myValue;
    }

    public void setMyValue (int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("miez");

//        ArrayList<int> intArrayList = new ArrayList<int>(); //nu se poate folosi tip primitiv
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = 54;
        Double doubleValue = 12.25;

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
//        for (int i=0; i <= 10; i++) {
//            intArrayList.add(Integer.valueOf(i));      AUTOBOXING
//        }
//        for (int i=0; i <= 10; i++) {
//            System.out.println(i + " --> " + intArrayList.get(i).intValue());    UNBOXING
//        }

        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue;  // myIntValue.intValue();

        Double myDoubleValue = 12.25; // Double.valueOf(12.25)
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <= 10.0 ; dbl += 0.5) {
            myDoubleValues.add(dbl); // myDoubleValues.add(Double.valueOf(dbl));
        }

        for (int i=0; i < myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i); // myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }
    }
}
