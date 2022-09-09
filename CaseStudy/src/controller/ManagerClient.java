package controller;

import model.client.ClientList;
import model.product.ProductList;
import storage.InterfaceReadAndWrite;
import storage.ReadAndWriteClient;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

import static controller.ManagerProduct.productLists;

public class ManagerClient implements Serializable {

    private static InterfaceReadAndWrite readFile = ReadAndWriteClient.getInstance();

    public static List<ClientList> clientList;

    static {
        clientList = readFile.readFile();
    }

    public void overWriteClient(ClientList client) {
        clientList.add(client);
        readFile.writeFile(clientList);
    }

    public static void deleteClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id khách hàng cần xoá:");
        int idClient = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < clientList.size(); i++) {
            if (idClient == clientList.get(i).getIdClient()) {
                check = true;
                clientList.remove(clientList.get(i));
                System.out.println("Xoá thành công.");
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy idClient.");
        }
        readFile.writeFile(clientList);
    }

    public static void displayClientList() {
        for (int i = 0; i < clientList.size(); i++) {
            System.out.println("-----Danh sách khách hàng-----");
            System.out.println(clientList.get(i).toString1());
            System.out.println("------------------------------");
        }
    }

    public static void displayClientListAndProduct() {
        for (int i = 0; i < clientList.size(); i++) {
            System.out.println("-----Danh sách khách hàng với đồ khách mua-----");
            System.out.println(clientList.get(i).toString());
            System.out.println("-----------------------------------------------");
        }
    }

    public static void findIdClientList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id khách hàng cần tìm:");
        int idClient = scanner.nextInt();
        boolean check = false;
        for (int i = 0; i < clientList.size(); i++) {
            if (idClient == clientList.get(i).getIdClient()) {
                check = true;
                System.out.println("-----Found-----");
                System.out.println(clientList.get(i));
                System.out.println("--------------");
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy id khách hàng,Khách hàng không tồn tại.");
        }
    }

    public static ClientList editClientList() {
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id khách hàng cần sửa thông tin:");
        int idClient = scannerI.nextInt();
        boolean check = false;
        for (int i = 0; i < clientList.size(); i++) {
            if (idClient == clientList.get(i).getIdClient()) {
                check = true;
                System.out.println("-----ID found-----");
                System.out.println("-----Please-----");
                System.out.println("Nhập id khách hàng mới:");
                int idClientList = scannerI.nextInt();
                System.out.println("Nhập tên khách hàng mới:");
                String name = scannerS.nextLine();
                System.out.println("Nhập số điện thoại khách hàng mới:");
                int phoneNumber = scannerI.nextInt();
                System.out.println("Nhập id sản phẩm mới của khách hàng:");
                int idProduct = scannerI.nextInt();

                System.out.println("Sửa thành công.");

                clientList.get(i).setIdClient(idClientList);
                clientList.get(i).setNameClient(name);
                clientList.get(i).setPhoneNumber(phoneNumber);

                boolean checkId = false;
                ClientList client = null;
                ProductList product = null;

                for (int j = 0; i < productLists.size(); i++) {
                    if (productLists.get(j).getIdProduct().equals(idProduct)) {
                        checkId = true;
                        product = productLists.get(j);
                    }
                }
                if (checkId) {
                    client = new ClientList(idClient, name, phoneNumber, product);
                    return client;
                }

            }
        }
        if (!check) {
            System.out.println("Không tìm thấy id khách hàng cần sửa thông tin.");
        }
        readFile.writeFile(clientList);
        return null;
    }
}
