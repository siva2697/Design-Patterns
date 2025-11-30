package structural.proxypattern.securefilestore;

public interface ISecureFileStore {
    public String readFile(String fileName);
    public void writeFile(String fileName, String Context);
}
