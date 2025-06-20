package org.example;

public class FictionBook extends Book {
    private final String genre;

    public FictionBook(int id, String title, String author, String genre) {
        super(id, title, author);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}
