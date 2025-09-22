package main.java.Proxy;
import java.util.HashMap;
import java.util.Map;

class Library {
    private Map<String, DocumentInterface> documents = new HashMap<>();

    public void addDocument(Document doc) {
        documents.put(doc.getId(), doc);
    }

    public void addProtectedDocument(Document doc, String... allowedUsers) {
        DocumentProxy proxy = new DocumentProxy(doc);
        documents.put(doc.getId(), proxy);

        AccessControl acs = AccessControl.getInstance();
        for (String user : allowedUsers) {
            acs.allowAccess(doc.getId(), user);
        }
    }

    public DocumentInterface getDocument(String id) {
        return documents.get(id);
    }
}
