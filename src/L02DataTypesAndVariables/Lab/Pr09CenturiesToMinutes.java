package L02DataTypesAndVariables.Lab;

import java.util.Scanner;

public class Pr09CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int centuries = Integer.parseInt(scanner.nextLine());
        long years = centuries * 100L;
        long days = (long) (years * 365.2422);
        long hours = days * 24L;
        long minutes = hours * 60L;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes"
                , centuries, years, days, hours, minutes);

    }
}
