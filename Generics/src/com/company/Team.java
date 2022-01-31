package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {

    @Override
    public int compareTo (Team<T> team) {
        if (this.noOfPoints() > team.noOfPoints()){
            return 1;
        } else if (this.noOfPoints() < team.noOfPoints()) {
            return -1;
        } else {
            return 0;
        }
    }

    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public boolean addPlayer (T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already in the team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " is now in the team");
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult (Team<T> oponent, int ourScore, int theirScore) {

        String message;
        if (ourScore > theirScore) {
            won ++;
            message = " won vs ";
        } else if (ourScore == theirScore){
            tied++;
            message = " tied to ";
        } else {
            lost++;
            message = " lost against ";
        }
        played++;
        if (oponent != null) {
            System.out.println(this.getName() + message + oponent.getName());
            oponent.matchResult(null, ourScore, theirScore);
        }
    }

    public int noOfPoints () {
        return (won * 3) + tied;
    }
}
