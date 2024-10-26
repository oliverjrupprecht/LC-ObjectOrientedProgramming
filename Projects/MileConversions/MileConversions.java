import java.util.Scanner;

public class MileConversions {
    public static void main(String[] args) {
        double miles = getInput();
        System.out.println(miles + " is equal to " + milesToInches(miles) + " inches.");
        System.out.println(miles + " is equal to " + milesToFeet(miles) + " feet.");
        System.out.println(miles + "is equal to " + milesToYards(miles) + " yards.");
    }

    public static double milesToInches(double miles) {
        double inchesValue = miles * 63360;
        return inchesValue;
    }

    public static double milesToFeet(double miles) {
        double milesValue = miles * 5280;
        return milesValue;
    }

    public static double milesToYards(double miles) {
        double yardsValue = miles * 1760;
        return yardsValue;
    }

    public static double getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input miles:");
        double input = scanner.nextDouble();
        scanner.close();
        return input;
    }
}
