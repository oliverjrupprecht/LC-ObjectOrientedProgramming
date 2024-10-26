import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Numbers numObject = new Numbers(0, 0, 0);

        setValues(numObject);

        System.out.println("Number 1: " + numObject.getNum1());
        System.out.println("Number 2: " + numObject.getNum2());
        System.out.println("Number 3: " + numObject.getNum3());

        System.out.println("These are your numbers in ascending order: ");
        numObject.sortAscending();
        System.out.println(numObject.toString());

        System.out.println("These are your numbers in descending order: ");
        numObject.sortDescending();
        System.out.println(numObject.toString());
    }

    public static void setValues(Numbers numObject) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number 1: ");
        numObject.setNum1(scanner.nextDouble());

        System.out.println("Please enter number 2: ");
        numObject.setNum2(scanner.nextDouble());

        System.out.println("Please enter number 3: ");
        numObject.setNum3(scanner.nextDouble());

        scanner.close();
    }
}
