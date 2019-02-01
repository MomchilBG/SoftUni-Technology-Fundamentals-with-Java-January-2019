package L02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Pr07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < counter; i++) {

            int liters = Integer.parseInt(scanner.nextLine());

            if (sum + liters <= 255) {
                sum += liters;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(sum);
    }
}
