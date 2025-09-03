package main.java.Decorator;

public class OratorDecorator implements Orator {

    private Orator orator;

    public OratorDecorator(Orator orator) {
        this.orator = orator;
    }

    @Override
    public void say (String message) {
        orator.say(message);
    }
    
}
