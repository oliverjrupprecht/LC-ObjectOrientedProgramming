import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poemType = getInput(scanner);
        Poem createdPoem = returnPoem(poemType, scanner);

        System.out.println("Poem created successfully: " + createdPoem);
    }

    public static int getInput(Scanner scanner) {
        boolean validInput = false;
        int input = 0;

        while (!validInput) {
            System.out.println("What poem would you like to create? 1 - Poem, 2 - Couplet, 3 - Limerick, 4 - Haiku: ");
            input = scanner.nextInt();
            if (input <= 4 && input >= 1) {
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a number between 1-4.");
            }
        }

        return input;
    }

    public static Poem returnPoem(int input, Scanner scanner) {
        Poem poem = null;

        switch (input) {
            case 1:
                System.out.println("You have selected Poem, please enter the number of lines you need: ");
                int numLines = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Please enter the name: ");
                String poemName = scanner.nextLine();
                poem = new Poem(poemName, numLines);
                break;

            case 2:
                System.out.println("You have chosen Couplet, please enter the name: ");
                scanner.nextLine();
                String coupletName = scanner.nextLine();
                poem = new Couplet(coupletName);
                break;

            case 3:
                System.out.println("You have chosen Limerick, please enter the name: ");
                scanner.nextLine();
                String limerickName = scanner.nextLine();
                poem = new Limerick(limerickName);
                break;

            case 4:
                System.out.println("You have chosen Haiku, please enter the name: ");
                scanner.nextLine();
                String haikuName = scanner.nextLine();
                poem = new Haiku(haikuName);
                break;
        }

        return poem;
    }
}
