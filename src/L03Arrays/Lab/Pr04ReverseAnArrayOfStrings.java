package L03Arrays.Lab;

import java.util.Scanner;

public class Pr04ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] characters = scanner.nextLine().split("\\s+");

        for (int i = characters.length - 1; i >= 0; i--) {
            System.out.print(characters[i] + " ");
        }
    }
}
