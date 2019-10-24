import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReadingCardController {

    public static int insertReadingCardData() {
        int chosenMenu = -1;
        Scanner in = new Scanner(System.in);
        int serialID, readingAmount, readingDate;

        System.out.println("The following functions can be found in the customer manager\n" +
                "1. Insert Reading Card Data\n" +
                "press 0 to go back");
        while (chosenMenu == -1) {

            if (in.hasNextInt()) {
                chosenMenu = in.nextInt();
                if (chosenMenu == 0) {
                    return -1;
                } else if (chosenMenu != 1) {
                    chosenMenu = -1;
                }
            } else {
                System.out.println("Input doesn't match menu number try number 1 or 0 for going back");
            }
        }

        System.out.println("Enter serial number of water meter: ");
        serialID = in.nextInt();

        System.out.println("Enter read amount of water: ");
        readingAmount = in.nextInt();

        System.out.println("Enter reading date ddmmyyyy: ");
        readingDate = in.nextInt();

        DB.insertSQL("INSERT INTO reading_card values(NULL," + readingDate + ",NULL," + readingAmount + "," +
                " " + serialID + ") ");
        return 0;
    }


}
