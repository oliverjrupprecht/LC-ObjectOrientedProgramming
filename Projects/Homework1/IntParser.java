import java.util.Scanner;

public class IntParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");

        String input = scanner.nextLine();
        int parsedInput = Integer.parseInt(input);

        System.out.println("Your age is: " + parsedInput);
    }
}
