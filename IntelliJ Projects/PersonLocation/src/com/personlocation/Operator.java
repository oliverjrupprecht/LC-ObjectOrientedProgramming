package com.personlocation;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        System.out.println("This application tells you the distance from one place to another.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first person's details.");
        Person person1 = setDetails(scanner);

        System.out.println("\n\nPlease enter the second person's details.");
        Person person2 = setDetails(scanner);

        double distance = distanceCalculator(person1.getLocation(), person2.getLocation());
        System.out.println("The Distance between " + person1.getName() + " and " + person2.getName() + " is: " + distance);

        scanner.close();
    }

    public static double setX(Scanner scanner) {
        System.out.println("Please enter the person's X value: ");
        return scanner.nextDouble();
    }

    public static double setY(Scanner scanner) {
        System.out.println("Please enter the person's Y value: ");
        return scanner.nextDouble();
    }

    public static String setName(Scanner scanner) {
        System.out.println("Please enter the person's name:");
        scanner.nextLine(); // to consume the leftover newline character
        return scanner.nextLine();
    }

    public static Person setDetails(Scanner scanner) {
        String personName = setName(scanner);
        double x = setX(scanner);
        double y = setY(scanner);

        Places personLocation = new Places(x, y);
        return new Person(personName, personLocation);
    }

    public static double distanceCalculator(Places loc1, Places loc2) {
        return Math.sqrt(Math.pow(loc2.getX() - loc1.getX(), 2) + Math.pow(loc2.getY() - loc1.getY(), 2));
    }
}