package main.java.Proxy;

class Document implements DocumentInterface {
    private String id;
    private String creationDate;
    private String content;

    public Document(String id, String creationDate, String content) {
        this.id = id;
        this.creationDate = creationDate;
        this.content = content;
    }

    @Override
    public String getId() {
        return this.id;
    }
    @Override
    public String getCreationDate() {
        return this.creationDate;
    }

    @Override
    public String getContent(User user) {
        return this.content;
    }
}
