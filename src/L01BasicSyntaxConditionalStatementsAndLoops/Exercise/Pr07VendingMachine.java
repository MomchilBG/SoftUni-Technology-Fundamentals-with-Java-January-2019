package L01BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Pr07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        while (true) {
            String coins = scanner.nextLine();
            if ("Start".equalsIgnoreCase(coins)) {
                break;
            }
            double amount = Double.parseDouble(coins);
            if (amount == 0.1 || amount == 0.2 || amount == 0.5 || amount == 1.0 || amount == 2.0) {
                sum += amount;
            } else {
                System.out.printf("Cannot accept %.2f", amount);
            }
        }
        double nuts = 2.0;
        double water = 0.7;
        double crisps = 1.5;
        double soda = 0.8;
        double coke = 1.0;
        while (true) {
            String item = scanner.nextLine();
            if ("End".equalsIgnoreCase(item)) {
                break;
            } else if ("Nuts".equalsIgnoreCase(item)) {
                if (nuts > sum) {
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.println("Purchased Nuts");
                    sum -= nuts;
                }
            } else if ("Water".equalsIgnoreCase(item)) {
                if (water > sum) {
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.println("Purchased Water");
                    sum -= water;
                }
            } else if ("Crisps".equalsIgnoreCase(item)) {
                if (crisps > sum) {
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.println("Purchased Crisps");
                    sum -= crisps;
                }
            } else if ("Soda".equalsIgnoreCase(item)) {
                if (soda > sum) {
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.println("Purchased Soda");
                    sum -= soda;
                }
            } else if ("Coke".equalsIgnoreCase(item)) {
                if (coke > sum) {
                    System.out.println("Sorry, not enough money");
                } else {
                    System.out.println("Purchased Coke");
                    sum -= coke;
                }
            } else {
                System.out.println("Invalid product");
            }
        }
        System.out.printf("Change: %.2f", sum);
    }
}