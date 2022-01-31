package com.company;

public class Main {

    public static void main(String[] args) {
        String varFour = "this is private to main()";

        ScopeCheck scopeInstante = new ScopeCheck();
        scopeInstante.useInner();

        ScopeCheck.InnerClass innerClass = scopeInstante.new InnerClass();
//        System.out.println("varThree is not accesible here " + innerClass.varThree);  only if is public in inner class

//        System.out.println("scopeInstance varOne is " + scopeInstante.getVarOne());
//        System.out.println(varFour);
//
//        scopeInstante.timesTwo();
//
//        System.out.println("*******************************************");
//        ScopeCheck.InnerClass innerClass = scopeInstante.new InnerClass();
//        innerClass.timesTwo();
    }
}
