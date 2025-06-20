package org.example;

public class NonFictionBook extends Book {
    private final String subject;

    public NonFictionBook(int id, String title, String author, String subject) {
        super(id, title, author);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}
