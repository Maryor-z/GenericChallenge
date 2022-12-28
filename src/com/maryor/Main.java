package com.maryor;

public class Main {
    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");
        Team<FootballPlayer> ifeRaptors = new Team<>("Ife Raptors");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        ifeRaptors.matchResult(hawthorn, 3, 5);
        melbourne.matchResult(fremantle, 0, 0);

        footballLeague.add(ifeRaptors);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

        footballLeague.showLeagueTable();


    }
}
