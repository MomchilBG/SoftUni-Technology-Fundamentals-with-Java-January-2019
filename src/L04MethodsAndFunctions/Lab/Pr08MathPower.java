package L04MethodsAndFunctions.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pr08MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        double sum = 1.0;

        DecimalFormat df = new DecimalFormat("#.######");

        System.out.println(df.format(result(number, power, sum)));
    }

    private static double result(double number, int power, double sum) {

        for (int i = 0; i < power; i++) {
            sum *= number;
        }

        return sum;
    }
}
