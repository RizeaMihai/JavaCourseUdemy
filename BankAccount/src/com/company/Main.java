package com.company;

public class Main {

    public static void main(String[] args) {
        // nu mai trebuie, daca se creeaza constructorul
//        mihaiAcc.setFirstName("Mihai");
//        System.out.println("First name = " + mihaiAcc.getFirstName());
//        mihaiAcc.setLastName("Rizea");
//        System.out.println("Last name = "  + mihaiAcc.getLastName());
//        System.out.println("Name = " + mihaiAcc.getFullName());
//        mihaiAcc.setAccNumber(1234_5678_9012_3456L);
//        System.out.println("Account number = " + mihaiAcc.getAccNumber());
//        mihaiAcc.setEmail("test.app@gmail.com");
//        System.out.println("Email address = " + mihaiAcc.getEmail());
//        mihaiAcc.setPhoneNo("0712 345 678");
//        System.out.println("Phone number = " + mihaiAcc.getPhoneNo());
        BankAccount mihaiAcc = new BankAccount();//(1234_5678_9012_3456L, 0.00, "test.app@gmail.com", "0712 345 678", "Mihai", "Rizea");
        System.out.println(mihaiAcc.getAccNumber());
        System.out.println(mihaiAcc.getBalance());
        mihaiAcc.setBalance(50.0);
        System.out.println("Your balance is: " + mihaiAcc.getBalance());
        mihaiAcc.setWithdraw(100.0);
        mihaiAcc.setDeposit(51.0);
        mihaiAcc.setWithdraw(100.0);

        BankAccount timsAcc = new BankAccount("Tim","Buchalka", "tim@email.com", "0223");
        System.out.println("name is " + timsAcc.getFirstName() + ", account number is " + timsAcc.getAccNumber());

        VipCustomer persoana1 = new VipCustomer();
        System.out.println(persoana1.getName());

        VipCustomer persoana2 = new VipCustomer(25000.00, "miez@email.com");
        System.out.println(persoana2.getName());

        VipCustomer persoana3 = new VipCustomer("Cristina", 50000.00, "cristina@email.com");
        System.out.println(persoana3.getName());
    }
}
