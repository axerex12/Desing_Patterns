package main.java.Chain_OF_Responsibility;


public class FeedBackHandler extends handler {

    @Override
    public void process(Message message) {
        if (message.getType() == MessageType.FEEDBACK) {
            System.out.println("FeedbackHandler processed the message: " + message.getContent());
        } else {
            System.out.println("FeedbackHandler passed the message to the next handler.");
            super.process(message);
        }

        }
}




    
