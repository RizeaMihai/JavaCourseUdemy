package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        FootballPlayer footballPlayer1 = new FootballPlayer("Joe");
        BaseballPlayer baseballPlayer1 = new BaseballPlayer("Pat");
        SoccerPlayer soccerPlayer1 = new SoccerPlayer("Ronaldo");

        Team<FootballPlayer> footballTeam1 = new Team<>("Vikings");
        footballTeam1.addPlayer(footballPlayer1);
//        footballTeam1.addPlayer(baseballPlayer1);
//        footballTeam1.addPlayer(soccerPlayer1);
        System.out.println(footballTeam1.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(baseballPlayer1);

        Team<SoccerPlayer> brokenTeam = new Team<>("Real Madrid");
        brokenTeam.addPlayer(soccerPlayer1);

        Team<FootballPlayer> footballTeam2 = new Team<>("Melbourne");
        FootballPlayer footballPlayer2 = new FootballPlayer("Gordon");
        footballTeam2.addPlayer(footballPlayer2);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> freemantle = new Team<>("Freemantle");

        hawthorn.matchResult(freemantle, 1, 0);
        hawthorn.matchResult(footballTeam1, 3, 8);

        footballTeam1.matchResult(freemantle, 2, 1);
//        footballTeam1.matchResult(baseballTeam, 3, 3); gresit pentru ca este echipa de baseball

        System.out.println("Rankings");
        System.out.println(footballTeam1.getName() + ": " + footballTeam1.noOfPoints() + "p");
        System.out.println(footballTeam2.getName() + ": " + footballTeam2.noOfPoints() + "p");
        System.out.println(freemantle.getName() + ": " + freemantle.noOfPoints() + "p");
        System.out.println(hawthorn.getName() + ": " + hawthorn.noOfPoints() + "p");

        System.out.println(footballTeam1.compareTo(footballTeam2));
        System.out.println(footballTeam1.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(footballTeam1));
        System.out.println(footballTeam2.compareTo(footballTeam1));
//
//        ArrayList<Team> teams;
//        Collections.sort(teams);
    }
}
