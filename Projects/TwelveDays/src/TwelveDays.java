import java.util.Scanner;

public class TwelveDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = getValidDay(scanner);
        versePrinter(day);

        scanner.close();
    }

    public static int getValidDay(Scanner scanner) {
        int day;
        while (true) {
            System.out.println("Please enter a day between 1 and 12: ");
            day = scanner.nextInt();
            if (day >= 1 && day <= 12) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid number between 1 and 12.");
            }
        }
        return day;
    }

    public static void versePrinter(int day) {
        switch (day) {
            case 1:
                System.out.println("On the first day of Christmas,\n" +
                        "my true love gave to me\n" +
                        "A partridge in a pear tree.");
                break;

            case 2:
                System.out.println("On the second day of Christmas,\n" +
                        "my true love gave to me\n" +
                        "Two turtle doves,\n" +
                        "And a partridge in a pear tree.");
                break;

            case 3:
                System.out.println("On the third day of Christmas,\n" +
                        "my true love gave to me\n" +
                        "Three French hens,\n" +
                        "Two turtle doves,\n" +
                        "And a partridge in a pear tree.");
                break;

            case 4:
                System.out.println("On the fourth day of Christmas,\n" +
                        "my true love gave to me\n" +
                        "Four calling birds,\n" +
                        "Three French hens,\n" +
                        "Two turtle doves,\n" +
                        "And a partridge in a pear tree.");
                break;

            case 5:
                System.out.println("On the fifth day of Christmas,\n" +
                        "my true love gave to me\n" +
                        "Five golden rings,\n" +
                        "Four calling birds,\n" +
                        "Three French hens,\n" +
                        "Two turtle doves,\n" +
                        "And a partridge in a pear tree.");
                break;

            case 6:
                System.out.println("On the sixth day of Christmas,\n" +
                        "my true love gave to me\n" +
                        "Six geese a-laying,\n" +
                        "Five golden rings,\n" +
                        "Four calling birds,\n" +
                        "Three French hens,\n" +
                        "Two turtle doves,\n" +
                        "And a partridge in a pear tree.");
                break;

            case 7:
                System.out.println("On the seventh day of Christmas,\n" +
                        "my true love gave to me\n" +
                        "Seven swans a-swimming,\n" +
                        "Six geese a-laying,\n" +
                        "Five golden rings,\n" +
                        "Four calling birds,\n" +
                        "Three French hens,\n" +
                        "Two turtle doves,\n" +
                        "And a partridge in a pear tree.");
                break;

            case 8:
                System.out.println("On the eighth day of Christmas,\n" +
                        "my true love gave to me\n" +
                        "Eight maids a-milking,\n" +
                        "Seven swans a-swimming,\n" +
                        "Six geese a-laying,\n" +
                        "Five golden rings,\n" +
                        "Four calling birds,\n" +
                        "Three French hens,\n" +
                        "Two turtle doves,\n" +
                        "And a partridge in a pear tree.");
                break;

            case 9:
                System.out.println("On the ninth day of Christmas,\n" +
                        "my true love gave to me\n" +
                        "Nine ladies dancing,\n" +
                        "Eight maids a-milking,\n" +
                        "Seven swans a-swimming,\n" +
                        "Six geese a-laying,\n" +
                        "Five golden rings,\n" +
                        "Four calling birds,\n" +
                        "Three French hens,\n" +
                        "Two turtle doves,\n" +
                        "And a partridge in a pear tree.");
                break;

            case 10:
                System.out.println("On the tenth day of Christmas,\n" +
                        "my true love gave to me\n" +
                        "Ten lords a-leaping,\n" +
                        "Nine ladies dancing,\n" +
                        "Eight maids a-milking,\n" +
                        "Seven swans a-swimming,\n" +
                        "Six geese a-laying,\n" +
                        "Five golden rings,\n" +
                        "Four calling birds,\n" +
                        "Three French hens,\n" +
                        "Two turtle doves,\n" +
                        "And a partridge in a pear tree.");
                break;

            case 11:
                System.out.println("On the eleventh day of Christmas,\n" +
                        "my true love gave to me\n" +
                        "Eleven pipers piping,\n" +
                        "Ten lords a-leaping,\n" +
                        "Nine ladies dancing,\n" +
                        "Eight maids a-milking,\n" +
                        "Seven swans a-swimming,\n" +
                        "Six geese a-laying,\n" +
                        "Five golden rings,\n" +
                        "Four calling birds,\n" +
                        "Three French hens,\n" +
                        "Two turtle doves,\n" +
                        "And a partridge in a pear tree.");
                break;

            case 12:
                System.out.println("On the twelfth day of Christmas,\n" +
                        "my true love gave to me\n" +
                        "Twelve drummers drumming,\n" +
                        "Eleven pipers piping,\n" +
                        "Ten lords a-leaping,\n" +
                        "Nine ladies dancing,\n" +
                        "Eight maids a-milking,\n" +
                        "Seven swans a-swimming,\n" +
                        "Six geese a-laying,\n" +
                        "Five golden rings,\n" +
                        "Four calling birds,\n" +
                        "Three French hens,\n" +
                        "Two turtle doves,\n" +
                        "And a partridge in a pear tree!");
                break;

        }
    }
}
