package L03Arrays.Lab;

import java.util.Scanner;

public class Pr01DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] weekDays = new String[7];

        weekDays[0] = "Monday";
        weekDays[1] = "Tuesday";
        weekDays[2] = "Wednesday";
        weekDays[3] = "Thursday";
        weekDays[4] = "Friday";
        weekDays[5] = "Saturday";
        weekDays[6] = "Sunday";

        int dayNumber = Integer.parseInt(scanner.nextLine());

        if (dayNumber >= 1 && dayNumber <= 7) {
            System.out.println(weekDays[dayNumber - 1]);
        } else {
            System.out.println("Invalid day!");
        }

    }
}
