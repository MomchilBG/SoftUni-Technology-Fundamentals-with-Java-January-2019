package L04MethodsAndFunctions.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pr11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numOne = Double.parseDouble(scanner.nextLine());
        String operation = scanner.nextLine();
        double numTwo = Double.parseDouble(scanner.nextLine());

        add(operation, numOne, numTwo);
        multiply(operation, numOne, numTwo);
        subtract(operation, numOne, numTwo);
        divide(operation, numOne, numTwo);

    }

    private static void add(String operation, double numOne, double numTwo) {
        double result;
        if ("+".equalsIgnoreCase(operation)) {
            result = numOne + numTwo;
            decimalFormat(result);
        }
    }

    private static void multiply(String operation, double numOne, double numTwo) {
        double result;
        if ("*".equalsIgnoreCase(operation)) {
            result = numOne * numTwo;
            decimalFormat(result);
        }
    }

    private static void subtract(String operation, double numOne, double numTwo) {
        double result;
        if ("-".equalsIgnoreCase(operation)) {
            result = numOne - numTwo;
            decimalFormat(result);
        }
    }

    private static void divide(String operation, double numOne, double numTwo) {
        double result;
        if ("/".equalsIgnoreCase(operation)) {
            result = numOne / numTwo;
            decimalFormat(result);
        }
    }

    private static void decimalFormat(double result) {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(result));
    }
}