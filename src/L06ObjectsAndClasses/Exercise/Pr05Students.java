package L06ObjectsAndClasses.Exercise;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Pr05Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfStudents = Integer.parseInt(scanner.nextLine());
        Set<Student> students = new TreeSet<>(Comparator.comparing(Student::getGrade).reversed());

        for (int i = 0; i < numOfStudents; i++) {
            String[] tokens = scanner.nextLine().trim().split(" ");
            students.add(new Student(tokens[0], tokens[1], Double.parseDouble(tokens[2])));
        }

        students.forEach(System.out::println);
    }

    private static final class Student {
        private String firstName;
        private String lastName;
        private double grade;

        Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", firstName, lastName, grade);
        }

        double getGrade() {
            return grade;
        }
    }
}
