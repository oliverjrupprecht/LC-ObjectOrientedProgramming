package com.sportsteam;

public class Game {
    private Team gameTeam1;
    private Team gameTeam2;
    private int gameTime;

    public Game(Team gameTeam1, Team gameTeam2, int gameTime) {
        this.gameTeam1 = gameTeam1;
        this.gameTeam2 = gameTeam2;
        this.gameTime = gameTime;
    }

    @Override
    public String toString() {
        return "Game Information:\n" +
                "Team 1: " + gameTeam1.getTeamName() + " (" + gameTeam1.getSport() + " from " + gameTeam1.getHighSchoolName() + ")\n" +
                "Team 2: " + gameTeam2.getTeamName() + " (" + gameTeam2.getSport() + " from " + gameTeam2.getHighSchoolName() + ")\n" +
                "Game Time: " + gameTime + " PM";
    }
}
