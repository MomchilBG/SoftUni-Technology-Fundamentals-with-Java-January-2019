package L02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Pr03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double people = Double.parseDouble(scanner.nextLine());
        double capacity = Double.parseDouble(scanner.nextLine());

        System.out.printf("%.0f", Math.ceil(people / capacity));
    }
}
