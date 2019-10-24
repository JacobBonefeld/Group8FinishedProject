import java.util.Scanner;

public class StatisticsManager {

    /**
     * Shows how much water used in total or for a specific costumer
     *
     * @return
     */

    public static int consumption() {

        Scanner in = new Scanner(System.in);
        int inputChoice = -1;
        int customerID = 0;
        String waterConsumption = "";
        String customerName = "";

        System.out.println("1. Show total consumption\n" +
                "2. Show consumption for a costumer\n" +
                "press 0 to return to start menu");
        while (inputChoice == -1) {

            if (in.hasNextInt()) {
                inputChoice = in.nextInt();
                if (inputChoice == 0) {
                    return -1;
                } else if (inputChoice != 1 && inputChoice != 2) {
                    inputChoice = -1;
                }
            } else {
                System.out.println("Input doesn't match menu number try number 1-2 or 0 for going back");
            }

            if (inputChoice == 1) {
                DB.selectSQL("SELECT SUM(reading_amount) FROM reading_card");
                waterConsumption = DB.getData();
                System.out.print("Total water consumption: ");
            } else {
                System.out.println("Input customer ID: ");
                customerID = in.nextInt();

                DB.selectSQL("SELECT customer_name FROM customer WHERE customer_id = " + customerID + " ");
                customerName = DB.getData();
                System.out.print("Water usage from " + customerName + " = ");

            DB.selectSQL("SELECT SUM(reading_amount) FROM reading_card INNER JOIN water_meters " +
                    "ON water_meters.serial = reading_card.serial WHERE water_meters.cus_id = " + customerID + "");
            waterConsumption = DB.getData();

            }
        }
        return 0;
    }
}
