package com.sportsteam;

import java.util.Scanner;

public class TestGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Team 1:");
        Team team1 = TestTeam.setTeamData();

        System.out.println("Enter details for Team 2:");
        Team team2 = TestTeam.setTeamData();

        System.out.println("Please enter the game time (e.g., 7 for 7 PM): ");
        int gameTime = scanner.nextInt();

        Game game = new Game(team1, team2, gameTime);
        System.out.println(game);

        scanner.close();
    }
}
