package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelsCompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score>1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score<1000){
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }
        if(gameOver){
            int finalScore = score + (levelsCompleted*bonus);
            System.out.println("Your final score was: " + finalScore);
        }

//        int chalScore = 10000;
//        int chalLevelsCompleted = 8;
//        int chalBonus = 200;
//        if(gameOver){
//            int finalScore = chalScore + (chalLevelsCompleted*chalBonus);
//            System.out.println("Your final score was " + finalScore);
//        }
        // nu este buna solutia pentru ca se incarca memoria cu variabile noi

//        score = 10000;
//        levelsCompleted = 8;
//        bonus = 200;
//        if(gameOver) {
//            int finalScore = score + (levelsCompleted * bonus);
//            System.out.println("Your final score was: " + finalScore);
//        }
        // nici varianta aceasta nu este buna, pentru ca in cazul unei modificari in formula, poti uita
        // sa modifici in ambele situatii
    }
}
