package com.sportsteam;

public class Team {
    private String highSchoolName;
    private String sport;
    private String teamName;
    public final static String MOTTO = "Sportsmanship!";

    public Team(String highSchoolName, String sport, String teamName) {
        this.highSchoolName = highSchoolName;
        this.sport = sport;
        this.teamName = teamName;
    }

    public String getHighSchoolName() {
        return highSchoolName;
    }

    public String getSport() {
        return sport;
    }

    public String getTeamName() {
        return teamName;
    }
}
