package L01BasicSyntaxConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Pr09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double robesPrice = Double.parseDouble(scanner.nextLine());
        double beltsPrice = Double.parseDouble(scanner.nextLine());

        double extraLightsabers = Math.ceil(students * 1.1);
        double lightsabers = lightsabersPrice * extraLightsabers;
        double freeBelts = students - Math.floor(students / 6.0);
        double belts = beltsPrice * freeBelts;
        double robes = robesPrice * students;

        double all = lightsabers + belts + robes;

        if (money >= all) {
            System.out.printf("The money is enough - it would cost %.2flv.", all);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", all - money);
        }
    }
}
