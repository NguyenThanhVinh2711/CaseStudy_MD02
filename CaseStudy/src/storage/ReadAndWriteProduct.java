package storage;

import model.Product.ProductList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteProduct implements InterfaceReadAndWrite<ProductList> {
    private static ReadAndWriteProduct readAndWriteProduct;

    private ReadAndWriteProduct() {
    }

    public static ReadAndWriteProduct getInstance(){
        if (readAndWriteProduct == null){
            readAndWriteProduct = new ReadAndWriteProduct();
        }
        return readAndWriteProduct;
    }



    @Override
    public List<ProductList> readFile() {
        List<ProductList> ProductLists = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream("product.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ProductLists = (List<ProductList>) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ProductLists;
    }

    @Override
    public void writeFile(List<ProductList> ProductLists) {
        try {
            FileOutputStream fos = new FileOutputStream("product.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ProductLists);
            oos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
