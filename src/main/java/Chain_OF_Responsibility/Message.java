package main.java.Chain_OF_Responsibility;

public class Message {
    private MessageType type;
    private String content;
    private String email;



    public Message(MessageType type, String content, String email) {
        this.content = content;
        this.email = email;
        this.type = type;
    }

    public MessageType getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public String getEmail() {
        return email;
    }




}

