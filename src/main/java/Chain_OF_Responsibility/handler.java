package main.java.Chain_OF_Responsibility;

public abstract class handler {

    private handler nextHandler;

    public void process(Message message) {
        if (nextHandler != null) {
            nextHandler.process(message);
        }
    }

    public void setNextHandler(handler nextHandler) {
        this.nextHandler = nextHandler;
    }


    
}
