import java.util.Scanner;

public class MathTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intValue = inputInt(scanner);
        double doubleValue = inputDouble(scanner);

        System.out.println("The sqrt of the int value: " + Math.sqrt(intValue));
        System.out.println("\nA random number between 0 and " + intValue + ": " + (Math.random() * intValue));

        System.out.println("\nThe floor value of the double: " + Math.floor(doubleValue) +
                "\nThe ceiling value of the double: " + Math.ceil(doubleValue) +
                "\nThe round value of the double: " + Math.round(doubleValue));

        System.out.println("\nThe larger value is: " + Math.max(intValue, doubleValue) +
                "\nThe smaller value is: " + Math.min(intValue, doubleValue));

        scanner.close();
    }

    public static int inputInt(Scanner scanner) {
        System.out.print("Please enter an integer: ");
        return scanner.nextInt();
    }

    public static double inputDouble(Scanner scanner) {
        System.out.print("Please enter a double: ");
        return scanner.nextDouble();
    }
}
