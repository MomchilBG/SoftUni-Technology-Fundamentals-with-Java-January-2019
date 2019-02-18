package L04MethodsAndFunctions.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pr04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String operation = scanner.nextLine();
        double numOne = Double.parseDouble(scanner.nextLine());
        double numTwo = Double.parseDouble(scanner.nextLine());

        add(operation, numOne, numTwo);
        multiply(operation, numOne, numTwo);
        subtract(operation, numOne, numTwo);
        divide(operation, numOne, numTwo);

    }

    private static void add(String operation, double numOne, double numTwo) {
        if ("add".equalsIgnoreCase(operation)) {
            double result = numOne + numTwo;
            decimalFormat(result);
        }
    }

    private static void multiply(String operation, double numOne, double numTwo) {
        if ("multiply".equalsIgnoreCase(operation)) {
            double result = numOne * numTwo;
            decimalFormat(result);
        }
    }

    private static void subtract(String operation, double numOne, double numTwo) {
        if ("subtract".equalsIgnoreCase(operation)) {
            double result = numOne - numTwo;
            decimalFormat(result);
        }
    }

    private static void divide(String operation, double numOne, double numTwo) {
        if ("divide".equalsIgnoreCase(operation)) {
            double result = numOne / numTwo;
            decimalFormat(result);
        }
    }

    private static void decimalFormat(double result) {
        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println(df.format(result));
    }
}
