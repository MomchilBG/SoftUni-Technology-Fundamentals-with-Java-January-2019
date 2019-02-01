package L02DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class Pr08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());

        String biggestKeg = "";
        double sum = 0.0;

        for (int i = 0; i < counter; i++) {

            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * radius * radius * height;

            if (volume > sum) {
                sum = volume;
                biggestKeg = model;
            }
        }
        System.out.println(biggestKeg);
    }
}
