package L06ObjectsAndClasses.Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr06VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Vehicle> vehicles = new HashMap<>();

        String input;

        while (!"End".equalsIgnoreCase(input = scanner.nextLine().trim())) {
            String[] tokens = input.split(" ");
            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];
            int horsepower = Integer.parseInt(tokens[3]);
            vehicles.put(model, new Vehicle(type, model, color, horsepower));
        }

        while (!"Close the Catalogue".equalsIgnoreCase(input = scanner.nextLine().trim())) {
            System.out.println(vehicles.get(input));
        }

        double totalCarsHorsepower = 0.0;
        double totalTrucksHorsepower = 0.0;
        int totalCars = 0;
        int totalTrucks = 0;

        for (Vehicle vehicle : vehicles.values()) {
            if ("car".equalsIgnoreCase(vehicle.type)) {
                totalCarsHorsepower += vehicle.horsepower;
                ++totalCars;
            } else {
                totalTrucksHorsepower += vehicle.horsepower;
                ++totalTrucks;
            }
        }

        double averageCarsHorsepower = (totalCars > 0) ? totalCarsHorsepower / totalCars : 0.0;
        double averageTrucksHorsepower = (totalTrucks > 0) ? totalTrucksHorsepower / totalTrucks : 0.0;

        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCarsHorsepower);
        System.out.printf("Trucks have average horsepower of: %.2f.", averageTrucksHorsepower);
    }

    private static final class Vehicle {
        private String type;
        private String model;
        private String color;
        private int horsepower;

        Vehicle(String type, String model, String color, int horsepower) {
            setType(type);
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        void setType(String type) {
            if ("car".equalsIgnoreCase(type)) {
                this.type = "Car";
            } else {
                this.type = "Truck";
            }
        }

        @Override
        public String toString() {
            return "Type: " + type + System.lineSeparator()
                    + "Model: " + model + System.lineSeparator()
                    + "Color: " + color + System.lineSeparator()
                    + "Horsepower: " + horsepower;
        }
    }
}
