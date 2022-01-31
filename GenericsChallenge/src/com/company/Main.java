package com.company;

public class Main {

    public static void main(String[] args) {
        League<Team<SoccerPlayer>> soccerLeague = new League<>("La Liga");

        Team<SoccerPlayer> real = new Team<>("Real Madrid");
        Team<SoccerPlayer> atleti = new Team<>("Atletico Madrid");
        Team<SoccerPlayer> barca = new Team<>("Barcelona");
        Team<SoccerPlayer> getafe = new Team<>("Getafe");

        soccerLeague.add(real);
        soccerLeague.add(atleti);
        soccerLeague.add(barca);
        soccerLeague.add(getafe);

        real.matchResult(barca, 7, 1);
        real.matchResult(atleti, 2, 1);
        real.matchResult(getafe, 5, 0);

        barca.matchResult(real, 2, 3);
        barca.matchResult(atleti, 2, 2);
        barca.matchResult(getafe, 1, 0);

        atleti.matchResult(barca, 2, 1);
        atleti.matchResult(real, 1, 4);
        atleti.matchResult(getafe, 2, 2);

        getafe.matchResult(barca, 2, 2);
        getafe.matchResult(atleti, 3, 2);
        getafe.matchResult(real, 1, 5);

        soccerLeague.showLeagueTable();

    }
}
