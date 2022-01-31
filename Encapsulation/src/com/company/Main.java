package com.company;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.health = 20;
//        player.fullName = " Tim";
//        player.weapon = "Sword";
//
//        int damage = 5;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 17;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());
        player.loseHealth(30);
        System.out.println("Player health is " + player.getHealth());

    }
}
