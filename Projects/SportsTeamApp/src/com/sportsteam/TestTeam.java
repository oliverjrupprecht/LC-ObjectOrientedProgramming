package com.sportsteam;

import java.util.Scanner;

public class TestTeam {
    public static void main(String[] args) {
        Team team1 = setTeamData();
        Team team2 = setTeamData();
        Team team3 = setTeamData();

        displayTeamData(team1);
        displayTeamData(team2);
        displayTeamData(team3);
    }

    public static Team setTeamData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the school name: ");
        String highSchoolName = scanner.nextLine();

        System.out.println("Please enter the sport: ");
        String sport = scanner.nextLine();

        System.out.println("Please enter the team name: ");
        String teamName = scanner.nextLine();

        return new Team(highSchoolName, sport, teamName);
    }

    public static void displayTeamData(Team team) {
        System.out.println("High School Name: " + team.getHighSchoolName());
        System.out.println("Sport: " + team.getSport());
        System.out.println("Team Name: " + team.getTeamName());
        System.out.println("Motto: " + Team.MOTTO);
        System.out.println();
    }
}
