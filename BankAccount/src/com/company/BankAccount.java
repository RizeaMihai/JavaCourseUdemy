package com.company;

public class BankAccount {
    private long accNumber;
    private double balance;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNo;

    public BankAccount (String firstName, String lastName, String email, String phoneNo) {
        this(123456,200,email,phoneNo,firstName,lastName);
    }

    public BankAccount(){                                           // constructor
        this(0000000000000000, 0.00, "Default email", "Default phone no", "Default first name", "Default lastname");
        System.out.println("Empty constructor called");
    }

    public BankAccount(long accNumber, double balance, String email, String phoneNo, String firstName, String lastName){
        System.out.println("Account constructor with parameters, called");
        this.accNumber = accNumber;
        this.balance = balance;                                     // constructor cu parametrii
        this.email = email;
        this.phoneNo = phoneNo;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getFirstName(){
        return firstName.isEmpty() ? "Invalid name" : firstName;
    }
    public String getLastName(){
        return lastName.isEmpty() ? "Invalid name" : lastName;
    }
    public String getFullName(){
        if(firstName.isEmpty() || lastName.isEmpty()){
            System.out.println("Please insert a valid name");
        }
        return this.firstName + " " + this.lastName;
    }

    public long getAccNumber () {
        return accNumber;
    }

    public String getPhoneNo () {
        return phoneNo;
    }

    public String getEmail () {
        return email;
    }

    public double getBalance () {
        return balance;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public void setAccNumber (long accNumber){
        this.accNumber = accNumber;
    }
    public void setEmail (String email){
        this.email = email;
    }
    public void setPhoneNo (String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setBalance (double balance){
        this.balance = balance;
    }

    public void setDeposit (double deposit){
        System.out.println("Deposit of " + deposit + " made");
        this.balance += deposit;
        System.out.println("Your new balance is: " + this.balance);
    }

    public void setWithdraw (double withdrawal){
        if(balance > withdrawal){
            System.out.println("You want to withdrawal " + withdrawal);
            this.balance -= withdrawal;
            System.out.println("Your new balance is: " + this.balance);
        } else {
            System.out.println("Insuficient funds! You want to withdrawal " + withdrawal + "\nYour current balance is: " + balance);
        }
    }


}
