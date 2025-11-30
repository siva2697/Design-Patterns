package structural.proxypattern.proxy;

import structural.proxypattern.securefilestore.ISecureFileStore;

import java.util.Set;

public class AccessControlProxy implements ISecureFileStore {

    ISecureFileStore secureFileStore; // The real object
    private final Set<String> allowedRoles;

    private String currentRole;

    public AccessControlProxy(ISecureFileStore secureFileStore, Set<String> allowedRoles) {
        this.secureFileStore = secureFileStore;
        this.allowedRoles = allowedRoles;
    }

    public String getCurrentRole() {
        return currentRole;
    }

    public void setCurrentRole(String role) {
        this.currentRole = role;
    }

    private boolean isAuthorized(String role) {
        return !allowedRoles.contains(role);
    }

    public String readFile(String fileName) {

        if(isAuthorized(currentRole)) {
            throw new SecurityException("Access Denied for role: " + currentRole);
        };

        return this.secureFileStore.readFile(fileName);
    }

    public void writeFile(String fileName,String context) {

        if(isAuthorized(currentRole)) {
            throw new SecurityException("Access Denied for role: " + currentRole);
        };

        this.secureFileStore.writeFile(fileName, context);

    }
}
