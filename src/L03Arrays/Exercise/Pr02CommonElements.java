package L03Arrays.Exercise;

import java.util.Scanner;

public class Pr02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] string = scanner.nextLine().split("\\s+");
        String[] secondString = scanner.nextLine().split("\\s+");

        for (String s : secondString) {
            for (String s1 : string) {
                if (s.equals(s1)) {
                    System.out.print(s + " ");
                }
            }
        }
    }
}
