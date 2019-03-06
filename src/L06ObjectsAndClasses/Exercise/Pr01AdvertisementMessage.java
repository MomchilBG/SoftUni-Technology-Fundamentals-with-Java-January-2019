package L06ObjectsAndClasses.Exercise;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pr01AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amountOfAdvertisements = Integer.parseInt(scanner.nextLine());
        List<String> phrases = new java.util.ArrayList<>(List.of("Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category."
                , "Exceptional product.", "I can't live without this product."));

        List<String> events = new java.util.ArrayList<>(List.of("Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am very happy of the results!"
                , "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"));

        List<String> authors = new java.util.ArrayList<>(List.of("Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"));

        List<String> cities = new java.util.ArrayList<>(List.of("Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"));


        for (int i = 0; i < amountOfAdvertisements; i++) {
            Collections.shuffle(authors);
            Collections.shuffle(phrases);
            Collections.shuffle(events);
            Collections.shuffle(cities);

            String author = authors.get(1);
            String phrase = phrases.get(1);
            String event = events.get(1);
            String city = cities.get(1);

            System.out.printf("%s %s %s - %s%n", phrase, event, author, city);
        }
    }
}
