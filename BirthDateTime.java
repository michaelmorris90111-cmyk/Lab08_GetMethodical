
import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);

        int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        int maxDay;

        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                maxDay = 30;
                break;

            case 2:
                maxDay = 29;
                break;

            default:
                maxDay = 31;
                break;
        }

        int day = SafeInput.getRangedInt(in, "Enter your birth day", 1, maxDay);

        int hour = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);

        int minute = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);

        System.out.println();
        System.out.println("Your birth date and time:");
        System.out.println(month + "/" + day + "/" + year);
        System.out.println(hour + ":" + String.format("%02d", minute));
    }
}
