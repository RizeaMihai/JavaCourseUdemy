package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName (String firstN) {
        this.firstName = firstN;
    }

    public void setLastName (String secondN){
        this.lastName = secondN;
    }

    public void setAge (int howOld){
        if (howOld < 0 || howOld > 100){
            this.age = 0;
        } else {
            this.age = howOld;
        }
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public int getAge(){
        return this.age;
    }

    public boolean isTeen(){
       return  (age > 12 && age < 20) ? true : false;
    }

    public String getFullName(){
        if (firstName.isEmpty() && lastName.isEmpty()){
            return "";
        } else if (lastName.isEmpty()){
            return this.firstName;
        } else if (firstName.isEmpty()){
            return this.lastName;
        } else {
            return this.firstName + " " + this.lastName;
        }

    }
}
