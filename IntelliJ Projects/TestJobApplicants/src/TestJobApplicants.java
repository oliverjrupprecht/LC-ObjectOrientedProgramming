import java.util.Scanner;

public class TestJobApplicants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        JobApplicant applicant1 = new JobApplicant();
        JobApplicant applicant2 = new JobApplicant();
        JobApplicant applicant3 = new JobApplicant();

        setJobApplicants(scanner, applicant1);
        setJobApplicants(scanner, applicant2);
        setJobApplicants(scanner, applicant3);

        scanner.close();
    }

    public static void setJobApplicants(Scanner scanner, JobApplicant applicant) {
        System.out.println("Please enter the applicant's name: ");
        applicant.setName(scanner.nextLine());

        System.out.println("Please enter the applicant's phone number: ");
        applicant.setPhoneNumber(scanner.nextDouble());
        scanner.nextLine();  // Clear the newline

        System.out.println("Is the applicant proficient in word processing (true or false): ");
        applicant.setWordProcessing(scanner.nextBoolean());

        System.out.println("Is the applicant proficient in spreadsheets (true or false): ");
        applicant.setSpreadsheets(scanner.nextBoolean());

        System.out.println("Is the applicant proficient in databases (true or false): ");
        applicant.setDatabases(scanner.nextBoolean());

        System.out.println("Is the applicant proficient in graphics (true or false): ");
        applicant.setGraphics(scanner.nextBoolean());

        scanner.nextLine();  // Clear the newline for the next applicant
    }
}
