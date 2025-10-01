package main.java.Prototype;

public class Main {

    public static void main(String[] args) {
        Recommendation teenRec = new Recommendation("Teens");
        teenRec.addBook(new Book("The Hunger Games", "Suzanne Collins", "Dystopian", 2008));
        teenRec.addBook(new Book("Harry Potter", "J.K. Rowling", "Fantasy", 1997));

        System.out.println(teenRec);

        Recommendation adultRec = teenRec.clone();
        adultRec.changeDemographic("Adults");
        adultRec.addBook(new Book("Kanye West", "Mein Kampf", "Educational", 1949));
        adultRec.removeBook(adultRec.books.get(1));
        adultRec.removeBook(adultRec.books.get(0));
        

        System.out.println(adultRec);

        
    }
    
}
