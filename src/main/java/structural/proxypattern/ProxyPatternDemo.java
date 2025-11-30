package structural.proxypattern;

import structural.proxypattern.proxy.AccessControlProxy;
import structural.proxypattern.securefilestore.ISecureFileStore;
import structural.proxypattern.securefilestore.SecureFileStore;

import java.util.Set;

public class ProxyPatternDemo {
    public static void main(String[] args) {

        ISecureFileStore realSecureFileStore = new SecureFileStore();
        AccessControlProxy proxy = new AccessControlProxy(realSecureFileStore, Set.of("ADMIN", "SUPER"));


        // ADMIN Request
        proxy.setCurrentRole("ADMIN");
        System.out.println(proxy.readFile("Docxyz"));
        proxy.writeFile("Docxyz", "Hello there!!!!!");
        System.out.println(proxy.readFile("Docxyz"));


        // GUEST Request
        proxy.setCurrentRole("Guest");

        try {
            proxy.writeFile("Doc456", "GTA 6");
        } catch (SecurityException ex) {
            System.err.println("Access blocked: " + ex.getMessage());
        }
    }
}
