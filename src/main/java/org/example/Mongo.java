package org.example;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Mongo {
    private final MongoCollection<Document> collection;
    private final MongoClient client;

    public Mongo() {
        // Connect to MongoDB running locally
        client = MongoClients.create("mongodb://localhost:27017");
        MongoDatabase db = client.getDatabase("newlibrary");
        collection = db.getCollection("Book");
    }

    public void insertBook(Book book) {
        // Create a document with basic book info
        Document doc = new Document("id", book.getId())
                .append("title", book.getTitle())
                .append("author", book.getAuthor());

        // Add extra info if book is Fiction or NonFiction
        if (book instanceof FictionBook) {
            doc.append("type", "Fiction")
                    .append("genre", ((FictionBook) book).getGenre());
        } else if (book instanceof NonFictionBook) {
            doc.append("type", "NonFiction")
                    .append("subject", ((NonFictionBook) book).getSubject());
        }

        // Insert the document into MongoDB
        collection.insertOne(doc);
        System.out.println("Inserted book: " + book.getTitle());
    }

    public void showAllBooks() {
        System.out.println("Books in database:");
        for (Document doc : collection.find()) {
            System.out.println(doc.toJson());
        }
    }

    public void close() {
        client.close();
    }
}
