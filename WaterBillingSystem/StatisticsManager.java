import java.util.Scanner;

public class StatisticsManager {

    public static void consumption(){

        Scanner in = new Scanner(System.in);
        int inputChoice = 0;
        int customerID = 0;
        String waterConsumption = "";
        String customerName = "";

        System.out.print("1. Show total consumption\n" +
                "2. Show consumption for a costumer");

        inputChoice = in.nextInt();

        if(inputChoice == 1){
            DB.selectSQL("SELECT SUM(reading_amount) FROM reading_card");
            waterConsumption = DB.getData();
            System.out.print("Total water consumption: ");
        } else {
            System.out.println("Input customer ID: ");
            customerID = in.nextInt();

            DB.selectSQL("SELECT customer_name FROM customer WHERE customer_id = " + customerID +" ");
            customerName = DB.getData();
            System.out.print("Water usage from " + customerName + " = ");

            DB.selectSQL("SELECT SUM(reading_amount) FROM reading_card INNER JOIN water_meters " +
                    "ON water_meters.serial = reading_card.serial WHERE water_meters.cus_id = " + customerID + "");
            waterConsumption = DB.getData();

        }
        System.out.println(waterConsumption + " m3");

    }
}
