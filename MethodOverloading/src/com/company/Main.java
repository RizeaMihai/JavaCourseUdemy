package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Mihai", 500);
        System.out.println("The new score is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore ( String playerName, int score ) {
        System.out.println("The player "+ playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore ( int score ) {
        System.out.println("The unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore ( ) {
        System.out.println("No player name, no player score.");
        return 0;
    }

}
