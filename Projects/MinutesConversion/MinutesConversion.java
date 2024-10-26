import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args) {
        double minutes = getInput();
        System.out.println("Your minutes in hours: " + minsToHours(minutes));
        System.out.println("Your minutes in days: " + minsToDays(minutes));
    }

    public static double getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter minutes to be converted:");
        double input = scanner.nextDouble();
        scanner.close();
        return input;
    }

    public static double minsToHours(double minutes) {
        return minutes / 60;
    }

    public static double minsToDays(double minutes) {
        return minutes / 1440;
    }
}
