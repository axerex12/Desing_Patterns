package main.java.Prototype;
import java.util.*;


public class Recommendation implements Prototype {
    public String targetAudience;
    public List<Book> books;

    public Recommendation(String targetAudience){
        this.targetAudience = targetAudience;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void changeDemographic(String newDemo) {
        this.targetAudience = newDemo;
    }

    @Override
    public String toString() {
        return "Recommendation(audience='" + targetAudience + "', books=" + books + ")";
    }


    @Override
    public Recommendation clone() {
        Recommendation cloned = new Recommendation(this.targetAudience);
        for (Book book : this.books) {
            cloned.addBook(book.clone());
        }
        return cloned;
    }
}
