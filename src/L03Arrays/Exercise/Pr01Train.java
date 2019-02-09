package L03Arrays.Exercise;

import java.util.Scanner;

public class Pr01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = Integer.parseInt(scanner.nextLine());
        int[] train = new int[counter];
        int sum = 0;
        StringBuilder num = new StringBuilder();

        for (int i = 0; i < counter; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            train[i] = people;
            sum += people;
            num.append(train[i]).append(" ");
        }
        System.out.println(num);
        System.out.println(sum);
    }
}
