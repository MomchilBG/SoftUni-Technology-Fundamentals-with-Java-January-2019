package L01BasicSyntaxConditionalStatementsAndLoops.Lab;

import java.util.Scanner;

public class Pr07TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int ticketPrice = 0;

        if ("Weekday".equalsIgnoreCase(dayType)) {
            if (age >= 0 && age <= 18) {
                ticketPrice = 12;
            } else if (age > 18 && age <= 64) {
                ticketPrice = 18;
            } else if (age > 64 && age <= 122) {
                ticketPrice = 12;
            }
        } else if ("Weekend".equalsIgnoreCase(dayType)) {
            if (age >= 0 && age <= 18) {
                ticketPrice = 15;
            } else if (age > 18 && age <= 64) {
                ticketPrice = 20;
            } else if (age > 64 && age <= 122) {
                ticketPrice = 15;
            }
        } else {
            if (age >= 0 && age <= 18) {
                ticketPrice = 5;
            } else if (age > 18 && age <= 64) {
                ticketPrice = 12;
            } else if (age > 64 && age <= 122) {
                ticketPrice = 10;
            }
        }
        if (age < 0 || age > 122) {
            System.out.println("Error!");
        } else {
            System.out.printf("%d$", ticketPrice);
        }
    }
}

