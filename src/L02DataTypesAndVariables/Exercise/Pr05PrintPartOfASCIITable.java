package L02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Pr05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());

        for (char code = (char) numOne; code <= (char) numTwo; code++) {
            System.out.print(code + " ");
        }
    }
}
