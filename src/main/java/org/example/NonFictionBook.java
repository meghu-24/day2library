package org.example;

public class NonFictionBook extends Books {
    private String subject;

    public NonFictionBook(String id, String title, String author, String subject) {
        super(id, title, author);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}
