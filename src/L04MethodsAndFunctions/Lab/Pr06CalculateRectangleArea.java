package L04MethodsAndFunctions.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pr06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println(df.format(getRectangleArea(width, length)));
    }

    private static double getRectangleArea(double width, double length) {
        return width * length;
    }
}
