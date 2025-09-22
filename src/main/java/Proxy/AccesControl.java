package main.java.Proxy;
import java.util.HashSet;
import java.util.Set;


class AccessControl {
    private static AccessControl instance;
    private Set<String> allowedPairs;

    private AccessControl() {
        allowedPairs = new HashSet<>();
    }

    public static AccessControl getInstance() {
        if (instance == null) {
            instance = new AccessControl();
        }
        return instance;
    }

    public void allowAccess(String docId, String username) {
        allowedPairs.add(username + ":" + docId);
    }

    public boolean isAllowed(String docId, String username) {
        return allowedPairs.contains(username + ":" + docId);
    }
}
