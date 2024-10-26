import java.util.Scanner;
import java.time.Period;

public class DateParser {
    public static void main(String[] args) {
        String fullDate = dateFormatter();
        periodParser(fullDate);
    }

    public static String dateFormatter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day: ");
        int day = scanner.nextInt();

        System.out.println("Enter the month: ");
        int month = scanner.nextInt();

        System.out.println("Enter the year: ");
        int year = scanner.nextInt();

        String fullDate = ("P" + year + "Y" + month + "M" + day + "D");
        return fullDate;
    }

    public static void periodParser(String fullDate) {
        Period parsedDate = Period.parse(fullDate);

        System.out.println("The time is: ");
        System.out.println(parsedDate.getYears() + " Years\n"
                + parsedDate.getMonths() + " Months\n"
                + parsedDate.getDays() + " Days\n");
    }
}
