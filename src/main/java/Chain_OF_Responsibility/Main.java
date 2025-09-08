package main.java.Chain_OF_Responsibility;

public class Main {

    public static void main(String[] args) {

        handler primaryHandler;

        handler feedbackHandler = new FeedBackHandler();
        handler errorHandler = new ErrorHandler();
        handler infoHandler = new InfoHandler();

        feedbackHandler.setNextHandler(errorHandler);
        errorHandler.setNextHandler(infoHandler);
        primaryHandler = feedbackHandler;

        Message feedbackMessage = new Message(MessageType.FEEDBACK, "This is a feedback message", "user@example.com");
        Message errorMessage = new Message(MessageType.ERROR, "This is an error message", "admin@example.com");
        Message infoMessage = new Message(MessageType.INFO, "This is an informational message", "info@example.com");

        primaryHandler.process(feedbackMessage);
        primaryHandler.process(errorMessage);
        primaryHandler.process(infoMessage);
    }
}
