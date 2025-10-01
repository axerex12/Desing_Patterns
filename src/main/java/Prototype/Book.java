package main.java.Prototype;

public class Book implements Prototype {
    public String author, title, genre;
    public int pubYear;

    public Book(String author, String title, String genre, int pubYear){
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.pubYear = pubYear;
    }

    @Override
    public Book clone() {
        return new Book(this.author, this.title, this.genre, this.pubYear);
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", title=" + title + ", genre=" + genre + ", pubYear=" + pubYear + "]";
    }
    
}
