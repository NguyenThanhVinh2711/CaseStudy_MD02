package storage;

import java.util.List;

public interface InterfaceReadAndWrite<Data> {

    List<Data> readFile();
    void writeFile(List<Data> dataList );

}
