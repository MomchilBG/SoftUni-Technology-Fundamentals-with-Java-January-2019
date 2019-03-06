package L06ObjectsAndClasses.Exercise;

import java.util.Scanner;

public class Pr02Articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(", ");

        Article article = new Article(tokens[0], tokens[1], tokens[2]);

        int numberOfEdits = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfEdits; i++) {
            String[] edits = scanner.nextLine().split(": ");

            if ("Edit".equalsIgnoreCase(edits[0])) {
                article.edit(edits[1]);
            } else if ("ChangeAuthor".equalsIgnoreCase(edits[0])) {
                article.changeAuthor(edits[1]);
            } else if ("Rename".equalsIgnoreCase(edits[0])) {
                article.rename(edits[1]);
            }
        }

        System.out.println(article);
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

        void edit(String content) {
            this.content = content;
        }

        void changeAuthor(String author) {
            this.author = author;
        }

        void rename(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return title + " - " + content + ": " + author;
        }
    }
}