package org.example;

public class Main {
    public static void main(String[] args) {
        Mongo mongo = new Mongo();

        FictionBook fictionBook = new FictionBook(1, "Animal form", "The white tiger", "Fantasy");
        NonFictionBook nonFictionBook = new NonFictionBook(2, "N-CERT", "The diary of young gil", "The art of war");

        mongo.insertBook(fictionBook);
        mongo.insertBook(nonFictionBook);

        mongo.showAllBooks();

        mongo.close();
    }
}
