package storage;

import model.client.ClientList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteClient implements InterfaceReadAndWrite<ClientList> {

    private static ReadAndWriteClient readAndWriteClient;

    private ReadAndWriteClient() {
    }

    public static ReadAndWriteClient getInstance(){
        if (readAndWriteClient == null){
            readAndWriteClient  = new ReadAndWriteClient();
        }
        return readAndWriteClient;
    }

    @Override
    public List<ClientList> readFile() {
        List<ClientList> ClientLists = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("client.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ClientLists = (List<ClientList>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ClientLists;
    }

    @Override
    public void writeFile(List<ClientList> ClientLists) {

        try {
            FileOutputStream fos = new FileOutputStream("client.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ClientLists);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
