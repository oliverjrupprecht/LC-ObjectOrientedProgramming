import java.util.Scanner;
import java.util.ArrayList;

public class ApartmentApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Apartment> apartments = new ArrayList<>();

        apartmentGenerator(scanner, apartments);

        for (Apartment apt : apartments) {
            System.out.println(apt);
        }

        filterApartments(scanner, apartments);

        scanner.close();
    }

    public static void apartmentGenerator(Scanner scanner, ArrayList<Apartment> apartments) {
        System.out.println("How many apartments would you like to add to the database: ");
        int databaseSize = scanner.nextInt();
        int startingApartmentNum = 1;

        for (int i = 0; i < databaseSize; ++i) {
            int apartmentNum = startingApartmentNum + i;

            System.out.println("Enter number of bedrooms for apartment #" + apartmentNum + ": ");
            int bedroomNum = scanner.nextInt();

            System.out.println("Enter number of bathrooms for apartment #" + apartmentNum + ": ");
            int bathNum = scanner.nextInt();

            System.out.println("Enter rent amount for apartment #" + apartmentNum + ": ");
            int rentAmount = scanner.nextInt();

            Apartment apartment = new Apartment(apartmentNum, bedroomNum, bathNum, rentAmount);
            apartments.add(apartment);
        }
    }

    public static void filterApartments(Scanner scanner, ArrayList<Apartment> apartments) {
        System.out.println("\nEnter your apartment criteria:");

        System.out.print("Minimum number of bedrooms: ");
        int minBedrooms = scanner.nextInt();

        System.out.print("Minimum number of bathrooms: ");
        int minBathrooms = scanner.nextInt();

        System.out.print("Maximum rent: ");
        int maxRent = scanner.nextInt();

        System.out.println("\nApartments matching your criteria:");

        boolean found = false;
        for (Apartment apt : apartments) {
            if (apt.getBedroomNum() >= minBedrooms && apt.getBathNum() >= minBathrooms && apt.getRentAmount() <= maxRent) {
                System.out.println(apt);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No apartments available that match your criteria.");
        }
    }
}