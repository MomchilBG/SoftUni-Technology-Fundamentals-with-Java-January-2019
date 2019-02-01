package L02DataTypesAndVariables.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class Pr03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal("0");

        while (counter > 0) {
            BigDecimal number = new BigDecimal(scanner.nextLine());
            sum = sum.add(number);
            counter--;
        }
        System.out.println(sum);
    }
}
