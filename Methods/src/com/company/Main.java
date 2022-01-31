package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelsCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelsCompleted, bonus);
        System.out.println("Your final score was: " + highScore);

        score = 10000;
        levelsCompleted = 8;
        bonus = 200;
        highScore = calculateScore(gameOver,score, levelsCompleted, bonus);
        System.out.println("Your final score was: " + highScore);

        displayHighScorePosition("Mihai", calculateHighScore(1500));
        displayHighScorePosition("George", calculateHighScore(900));
        displayHighScorePosition("Tim", calculateHighScore(400));
        displayHighScorePosition("Lex", calculateHighScore(50));

    }

    public static int calculateScore(boolean gameOver, int score, int levelsCompleted, int bonus) {

        if(gameOver){
            int finalScore = score + (levelsCompleted*bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }


    public static void displayHighScorePosition (String playerName, int position){
         System.out.println(playerName + " managed to get into position " + position + " on the high score table"    );
    }

    public static int calculateHighScore (int playerScore){
//        if(playerScore >= 1000){
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >=100) {
//            return 3;
//        }
//            return 4;
        int position = 4; // assuming position 4 will be returned
        if(playerScore >= 1000){
            position = 1;
        } else if(playerScore >= 500){
            position = 2;
        } else if(playerScore >= 100){
            position = 3;
        }
        return position;
    }
}

