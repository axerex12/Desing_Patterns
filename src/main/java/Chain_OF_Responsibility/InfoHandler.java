package main.java.Chain_OF_Responsibility;

public class InfoHandler extends handler {

    @Override
    public void process(Message message) {
        if (message.getType() == MessageType.INFO) {
            System.out.println("InfoHandler processed the message: " + message.getContent());
        } else {
            System.out.println("InfoHandler passed the message to the next handler.");
            super.process(message);
        }

        }
}
