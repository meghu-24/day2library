package org.example;

public class FictionBook extends Books {
    private String genre;

    public FictionBook(String id, String title, String author, String genre) {
        super(id, title, author);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}
