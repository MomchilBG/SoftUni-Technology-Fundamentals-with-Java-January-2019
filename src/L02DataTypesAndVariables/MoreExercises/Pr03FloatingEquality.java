package L02DataTypesAndVariables.MoreExercises;

import java.util.Scanner;

public class Pr03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numOne = Double.parseDouble(scanner.nextLine());
        double numTwo = Double.parseDouble(scanner.nextLine());

        double difference = numOne - numTwo;

        if (Math.abs(difference) < 0.000001) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
