public class NumbersDemo {
    public static void main(String[] args) {
        int int1 = 12;
        int int2 = 4;
        displayTwiceTheNumber(int1, int2);
        displayNumberPlusFive(int1, int2);
        displayNumberSquared(int1, int2);
    }

    public static void displayTwiceTheNumber(int int1, int int2) {
        System.out.println("Double the first value is: " + (int1 * 2) +
                            "\nDouble the second value is: " + (int2 * 2));
    }

    public static void displayNumberPlusFive(int int1, int int2) {
        System.out.println("The first value plus five is: " + (int1 + 5) +
                            "\nThe second value plus five is: " + (int2 + 5));
    }

    public static void displayNumberSquared(int int1, int int2){
        System.out.println("The first value squared is: " + (int1 * int1) +
                            "\nThe second value squared is: " + (int2 * int2));
    }
}
