package L04MethodsAndFunctions.Exercise;

import java.util.Scanner;

public class Pr04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        password(scanner);
    }

    private static void password(Scanner scanner) {
        String password = scanner.nextLine();
        char checkSymbol;

        boolean characterCheck = false;
        boolean digitCheck = false;
        boolean lettersAndDigitsCheck = false;
        boolean a = true;

        if (password.length() >= 6 && password.length() <= 10) {
            characterCheck = true;
        } else {
            System.out.printf("Password must be between 6 and 10 characters%n");
        }

        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            checkSymbol = password.charAt(i);
            if (checkSymbol >= 48 && checkSymbol <= 57) {
                counter++;
                if (counter >= 2) {
                    digitCheck = true;
                }
            }
            if (checkSymbol >= 65 && checkSymbol <= 90 || checkSymbol >= 97 && checkSymbol <= 122 || checkSymbol >= 48 && checkSymbol <= 57) {
                lettersAndDigitsCheck = true;
            } else {
                lettersAndDigitsCheck = false;
                a = false;
            }
        }
        if (!a) {
            System.out.printf("Password must consist only of letters and digits%n");
        }

        if (!digitCheck) {
            System.out.printf("Password must have at least 2 digits%n");
        }

        if (characterCheck && digitCheck && lettersAndDigitsCheck) {
            System.out.printf("Password is valid%n");
        }
    }
}
