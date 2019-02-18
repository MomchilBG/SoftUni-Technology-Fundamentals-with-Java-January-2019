package L04MethodsAndFunctions.Lab;

import java.util.Scanner;

public class Pr02Grades {
    public static void main(String[] args) {
        grades();
    }

    private static void grades() {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 2.0 && grade < 3.0) {
            System.out.println("Fail");
        } else if (grade >= 3.0 && grade < 3.5) {
            System.out.println("Poor");
        } else if (grade >= 3.5 && grade < 4.5) {
            System.out.println("Good");
        } else if (grade >= 4.5 && grade < 5.5) {
            System.out.println("Very good");
        } else if (grade >= 5.5 && grade <= 6) {
            System.out.println("Excellent");
        }
    }
}
