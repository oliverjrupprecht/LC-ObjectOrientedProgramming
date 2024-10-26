import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerData customerData = new CustomerData();

        setCustomerData(scanner, customerData);
        String plan = serviceLogic(customerData);
        System.out.println("Recommended Plan: " + plan);
    }

    public static String serviceLogic(CustomerData customerData) {
        double talkMinutes = customerData.getTalkMinutess();
        double textMessages = customerData.getTalkMessages();
        double data = customerData.getDataNeeded();

        if (data > 0) {
            if (data < 3) {
                return "Plan E at $79 per month";
            } else {
                return "Plan F at $87 per month";
            }
        } else if (talkMinutes >= 500) {
            if (textMessages > 0 && textMessages < 100) {
                return "Plan C at $61 per month";
            } else if (textMessages >= 100) {
                return "Plan D at $70 per month";
            }
        } else if (talkMinutes < 500) {
            if (textMessages == 0) {
                return "Plan A at $49 per month";
            } else if (textMessages > 0) {
                return "Plan B at $55 per month";
            }
        }
        return "No suitable plan found.";
    }

    public static CustomerData setCustomerData(Scanner scanner, CustomerData customerData) {
        System.out.println("Please enter the talk minutes you need: ");
        customerData.setTalkMinutess(scanner.nextDouble());

        System.out.println("Please enter the text messages you need: ");
        customerData.setTalkMessages(scanner.nextDouble());

        System.out.println("Please enter the amount of data you need: ");
        customerData.setDataNeeded(scanner.nextDouble());

        return customerData;
    }
}
