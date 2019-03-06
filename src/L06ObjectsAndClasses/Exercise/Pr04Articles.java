package L06ObjectsAndClasses.Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Pr04Articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Article> articles = new ArrayList<>();

        int numberOfEdits = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfEdits; i++) {
            String[] tokens = scanner.nextLine().split(", ");
            Article article = new Article(tokens[0], tokens[1], tokens[2]);
            articles.add(article);
        }

        String sort = scanner.nextLine().trim().toLowerCase();

        switch (sort) {
            case "title":
                articles.sort(Comparator.comparing(Article::getTitle));
                break;
            case "content":
                articles.sort(Comparator.comparing(Article::getContent));
                break;
            case "author":
                articles.sort(Comparator.comparing(Article::getAuthor));
                break;
            default:
                break;
        }
        articles.forEach(System.out::println);
    }

    private static final class Article {
        private String title;
        private String content;
        private String author;

        Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        String getTitle() {
            return title;
        }

        String getContent() {
            return content;
        }

        String getAuthor() {
            return author;
        }

        @Override
        public String toString() {
            return title + " - " + content + ": " + author;
        }
    }
}