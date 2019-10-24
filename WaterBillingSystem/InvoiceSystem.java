import java.util.Scanner;

public class InvoiceSystem {

    public static int calcPrice() {
        Scanner in = new Scanner(System.in);
        int waterTax = 1;
        int drainageTax = 1;
        int chosenType = 1;
        int waterAmount = 0;

        do {
            System.out.println("Please Input what's the type of customer it is\n" +
                    "1. Agriculture \n" +
                    "2. Industry\n" +
                    "3. Private \n" +
                    "type 0 to return");
            if (in.hasNextInt()) {
                chosenType = in.nextInt();
            } else {
                System.out.println("please input a number matching the customer type");
            }
            if(chosenType ==0){
                return -1;
            }
        } while (waterTax < 1 || waterTax > 3);
        DB.selectSQL("(SELECT water_tax FROM segment WHERE (segment_id =" + chosenType + "))");

        do {
            String data = DB.getData();
            if (data.equals(DB.NOMOREDATA)) {
                break;
            } else {
                waterTax = Integer.parseInt(data);
            }
        } while (true);
        DB.selectSQL("(SELECT drain_tax FROM segment WHERE (segment_id =" + chosenType + "))");

        do {
            String data = DB.getData();
            if (data.equals(DB.NOMOREDATA)) {
                break;
            } else {
                drainageTax = Integer.parseInt(data);
            }
        } while (true);
        System.out.println("water tax: " + waterTax + " per m^3" + " Drainage tax: " + drainageTax + " per m^3\n" +
                "Please insert the amount of water you want to calculate the price of in m^3");

        do {
            if (in.hasNextInt()) {
                waterAmount = in.nextInt();
            } else {
                System.out.println("please insert a number matching the usage");
            }
        } while (waterAmount < 0);

        System.out.println("total price for water usage: " + calculator(waterTax, drainageTax, waterAmount) + " DKK");
        return 0;
    }

    private static int calculator(int waterTax, int drainTax, int waterAmount) {
        int totalPrice;
        totalPrice = (waterTax + drainTax) * waterAmount;
        return totalPrice;
    }
}


