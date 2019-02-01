package L02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Pr11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());
        double snowballValue = 0.0;
        int snow = 0;
        int time = 0;
        int quality = 0;
        double result;

        for (int i = 0; i < counter; i++) {

            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            result = Math.pow(snowballSnow / snowballTime, snowballQuality);

            if (result > snowballValue) {
                snowballValue = result;
                snow = snowballSnow;
                time = snowballTime;
                quality = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snow, time, snowballValue, quality);
    }
}
