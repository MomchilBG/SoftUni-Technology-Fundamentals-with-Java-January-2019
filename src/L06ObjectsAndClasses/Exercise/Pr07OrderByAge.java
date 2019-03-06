package L06ObjectsAndClasses.Exercise;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Pr07OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input;
        Set<Person> people = new TreeSet<>(Comparator.comparing(Person::getAge));

        while (!"End".equalsIgnoreCase(input = scanner.nextLine())) {
            String[] tokens = input.split(" ");
            people.add(new Person(tokens[0], tokens[1], Integer.parseInt(tokens[2])));
        }

        people.forEach(System.out::println);
    }

    private static final class Person {
        private String name;
        private String id;
        private int age;

        Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return name + " with ID: " + id + " is " + age + " years old.";
        }
    }
}
