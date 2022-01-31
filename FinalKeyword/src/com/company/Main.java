package com.company;

public class Main {

    public static void main(String[] args) {
//        SomeClass one = new SomeClass("One");
//        SomeClass two = new SomeClass("Two");
//        SomeClass three = new SomeClass("Three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
////        one.instanceNumber = 4;
//        System.out.println(Math.PI);
////        Math m = new Math();
//        int pw = 675123;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(123123);
//        password.letMeIn(33145);
//        password.letMeIn(-1);
//        password.letMeIn(0);
//        password.letMeIn(675123);

        System.out.println("main method callled");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + test.owner);
    }
}
