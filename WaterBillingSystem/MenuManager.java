import java.util.Scanner;

public class MenuManager {
    public static void chooseMenu() {
        Scanner in = new Scanner(System.in);
        int chosenMenu = -1;
        System.out.print("Welcome to the Water Billing system! ");
        while (chosenMenu == -1) {
            System.out.println("We have the following functions you can use\n" +
                    "1. Manage Customers\n" +
                    "2. Manage Reading Cards \n" +
                    "3. Create invoice \n" +
                    "4. Statics [Unavailable]\n" +
                    "5. Verify Payment [Unavailable]\n" +
                    "6. Manage Reminders [Unavailable]");

            if (in.hasNextInt()) {
                chosenMenu = in.nextInt();
            }

            switch (chosenMenu) {
                case 1:
                    chosenMenu = manageCustomers();
                    break;

                case 2:
                    chosenMenu = manageReadingCards();
                    break;

                case 3:
                    chosenMenu = createInvoice();
                    break;

                case 4:
                    chosenMenu = manageStatistics();
                    break;

                case 5:
                    chosenMenu = verifyPayments();
                    break;

                case 6:
                    chosenMenu = manageReminders();
                    break;

                default:
                    System.out.println("Input doesn't match menu number try a number from 1-6");
                    chosenMenu = -1;
                    break;
            }
        }
    }

    private static int manageCustomers() {
        Scanner in = new Scanner(System.in);
        int chosenMenu = -1;
        System.out.println("The following functions can be found in the Customer manager\n" +
                "1. Edit Customer [Unavailable]\n" +
                "2. Add Customer\n" +
                "press 0 to go back");

        while (chosenMenu == -1) {

            if (in.hasNextInt()) {
                chosenMenu = in.nextInt();
            }

            switch (chosenMenu) {
                case 0:
                    return -1;

                case 1:
                    System.out.println("NOT AVAILABLE IN PROOF OF CONCEPT VERSION");
                    break;

                case 2:
                    return CustomerManager.addCustomer();

                default:
                    System.out.println("Input doesn't match menu number try a number from 1-2");
                    chosenMenu = -1;
                    break;
            }
        }
        return 0;
    }

    private static int manageReadingCards() {
        Scanner in = new Scanner(System.in);
        int chosenMenu = -1;
        System.out.println("The following functions can be found in the Reading Card manager\n" +
                "1. Generate Reading Card [Unavailable]\n" +
                "2. Insert Reading Card Data\n" +
                "3. \n" +
                "press 0 to go back"
        );

        while (chosenMenu == -1) {

            if (in.hasNextInt()) {
                chosenMenu = in.nextInt();
            }

            switch (chosenMenu) {
                case 0:
                    return -1;

                case 1:
                    System.out.println("NOT AVAILABLE IN PROOF OF CONCEPT VERSION");
                    break;
                case 2:
                    return ReadingCardController.insertReadingCardData();

                default:
                    System.out.println("Input doesn't match menu number try a number from 1-2");
                    chosenMenu = -1;
                    break;
            }
        }
        return 0;
    }

    private static int createInvoice() {
        Scanner in = new Scanner(System.in);
        int chosenMenu = -1;
        System.out.println("The following functions can be found in the Invoice Controller\n" +
                "1. Calculate Price\n" +
                "2. Generate Invoice [Unavailable]\n" +
                "press 0 to go back"
        );

        while (chosenMenu == -1) {

            if (in.hasNextInt()) {
                chosenMenu = in.nextInt();
            }

            switch (chosenMenu) {
                case 0:
                    return -1;

                case 1:
                    return InvoiceSystem.calcPrice();
                case 2:
                    System.out.println("NOT AVAILABLE IN PROOF OF CONCEPT VERSION");
                    break;

                default:
                    System.out.println("Input doesn't match menu number try a number from 1-2");
                    chosenMenu = -1;
                    break;
            }
        }
        return 0;
    }

    private static int manageStatistics() {
        Scanner in = new Scanner(System.in);
        int chosenMenu = -1;
        System.out.println("The following functions \n" +
                "1. Generate payment Statistics [Unavailable]\n" +
                "2. Generate Consumption Statistics [Unavailable]" +
                "press 0 to go back"
        );

        while (chosenMenu == -1) {

            if (in.hasNextInt()) {
                chosenMenu = in.nextInt();
            }

            switch (chosenMenu) {
                case 0:
                    return -1;

                case 1:
                    System.out.println("NOT AVAILABLE IN PROOF OF CONCEPT VERSION");
                    break;

                case 2:
                    System.out.println("NOT AVAILABLE IN PROOF OF CONCEPT VERSION");
                    break;

                default:
                    System.out.println("Input doesn't match menu number try a number from 1-2");
                    chosenMenu = -1;
                    break;
            }
        }
        return 0;
    }

    private static int verifyPayments() {
        Scanner in = new Scanner(System.in);
        int chosenMenu = -1;
        System.out.println("The following Payment verification functions are available\n" +
                "1. Import .csv file [Unavailable]" +
                "press 0 to go back"
        );

        while (chosenMenu == -1) {

            if (in.hasNextInt()) {
                chosenMenu = in.nextInt();
            }

            switch (chosenMenu) {
                case 0:
                    return -1;

                case 1:
                    System.out.println("NOT AVAILABLE IN PROOF OF CONCEPT VERSION");
                    break;

                default:
                    System.out.println("Input doesn't match menu number try pressing 1");
                    chosenMenu = -1;
                    break;
            }
        }
        return 0;
    }

    private static int manageReminders() {
        Scanner in = new Scanner(System.in);
        int chosenMenu = -1;
        System.out.println("The following functions can be found in the Reminder manager\n" +
                "1. Check Payment Status [Unavailable]\n" +
                "2. Check Reminder Amounts [Unavailable]" +
                "press 0 to go back");

        while (chosenMenu == -1) {

            if (in.hasNextInt()) {
                chosenMenu = in.nextInt();
            }

            switch (chosenMenu) {
                case 0:
                    return -1;
                case 1:
                    System.out.println("NOT AVAILABLE IN PROOF OF CONCEPT VERSION");
                    break;

                case 2:
                    System.out.println("NOT AVAILABLE IN PROOF OF CONCEPT VERSION");
                    break;

                default:
                    System.out.println("Input doesn't match menu number try a number from 1-2");
                    chosenMenu = -1;
                    break;
            }
        }
        return 0;
    }
}
