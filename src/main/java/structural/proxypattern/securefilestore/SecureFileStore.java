package structural.proxypattern.securefilestore;

import java.util.HashMap;

public class SecureFileStore implements ISecureFileStore {

    HashMap<String, String> fileStoreData;

    public SecureFileStore() {
        this.fileStoreData = new HashMap<>();
    }

    @Override
    public String readFile(String fileName) {

        return fileStoreData.get(fileName);

    }

    @Override
    public void writeFile(String fileName, String data) {
        this.fileStoreData.put(fileName, data);
    }
}
