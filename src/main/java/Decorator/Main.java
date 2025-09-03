package main.java.Decorator;

public class Main {
    public static void main(String[] args) {

        Orator orator = new BasicPrinter();
        Orator orator2 = new BasicPrinter();
        orator = new EncryptedPrinter(orator);
        orator2 = new XMLPrinter(orator2);

        orator.say("Hello, Decorator Pattern!");
        orator2.say("Hello, Decorator Pattern!");

    }
    
}
