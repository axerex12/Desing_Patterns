package main.java.Proxy;

import java.nio.file.AccessDeniedException;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        User Maija = new User("Maija");
        User Pekka = new User("Pekka");

        Document doc1 = new Document("doc1", "2025-09-22", "Public Report Content");
        library.addDocument(doc1);

        Document doc2 = new Document("doc2", "2025-09-20", "Top Secret Content");
        library.addProtectedDocument(doc2, "Maija");

        try {
            System.out.println("Maija reads doc1: " + library.getDocument("doc1").getContent(Maija));
            System.out.println("Pekka reads doc1: " + library.getDocument("doc1").getContent(Pekka));

            System.out.println("Maija reads doc2: " + library.getDocument("doc2").getContent(Maija));
            System.out.println("Pekka reads doc2: " + library.getDocument("doc2").getContent(Pekka));
        } catch (AccessDeniedException e) {
            System.out.println("Access denied: " + e.getMessage());
        }
    }
}

