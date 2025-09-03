package main.java.Decorator;

public class BasicPrinter implements Orator {

    public void say(String message) {
        System.out.println(message);
    }
    
}
