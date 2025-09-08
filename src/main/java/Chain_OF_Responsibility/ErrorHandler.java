package main.java.Chain_OF_Responsibility;

public class ErrorHandler extends handler {

    @Override
    public void process(Message message) {
        if (message.getType() == MessageType.ERROR) {
            System.out.println("ErrorHandler processed the message: " + message.getContent());
        } else {
            System.out.println("ErrorHandler passed the message to the next handler.");
            super.process(message);
        }

        }
}
