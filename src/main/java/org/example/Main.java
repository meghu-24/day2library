package org.example;

public class Main {
    public static void main(String[] args) {
        Mongo dbm = new Mongo();

        FictionBook fb = new FictionBook("1", "Harry Potter", "J.K. Rowling", "Fantasy");
        NonFictionBook nfb = new NonFictionBook("2", "Java Basics", "James Gosling", "Programming");

        dbm.insertBook(fb);
        dbm.insertBook(nfb);

        System.out.println("All Books in Library:");
        dbm.displayAllBooks();
    }
}
