package main.java.Proxy;

class DocumentProxy implements DocumentInterface {
    private Document realDocument;
    private String id;
    private String creationDate;

    public DocumentProxy(Document realDocument) {
        this.realDocument = realDocument;
        this.id = realDocument.getId();
        this.creationDate = realDocument.getCreationDate();
    }

    @Override
    public String getId() { return id; }

    @Override
    public String getCreationDate() { return creationDate; }

    @Override
    public String getContent(User user) {
        AccessControl acs = AccessControl.getInstance();
        if (acs.isAllowed(id, user.getUsername())) {
            return realDocument.getContent(user);
        } else {
            throw new SecurityException("Access denied for user " + user.getUsername());
        }
}
}
