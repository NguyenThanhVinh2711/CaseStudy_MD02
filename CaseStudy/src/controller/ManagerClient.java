package controller;

import com.sun.security.ntlm.Client;
import model.ClientList;
import model.ProductList;
import storage.InterfaceReadAndWrite;
import storage.ReadAndWriteClient;
import storage.ReadAndWriteProduct;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

public class ManagerClient implements Serializable {

    private static InterfaceReadAndWrite readFile = ReadAndWriteClient.getInstance();

    public static List<ClientList> clientList;

    static {
        clientList = readFile.readFile();
    }

    public void addClient(ClientList client) {
        clientList.add(client);
        readFile.writeFile(clientList);
    }

    public static void deleteClient() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id khách hàng cần xoá");
        int idClient = scanner.nextInt();
        for (int i = 0; i < clientList.size(); i++) {
            if (idClient == clientList.get(i).getIdClient()) {
                clientList.remove(clientList.get(i));
            } else {
                System.out.println("Không tìm thấy idClient.");
                break;
            }
        }

    }

    public static void displayClientList() {
        for (int i = 0; i < clientList.size(); i++) {
            System.out.println(clientList.get(i).toString1());
        }
    }

    public static void displayClientListAndProduct(){
        for (int i = 0; i < clientList.size(); i++) {
            System.out.println(clientList.get(i).toString());
        }
    }

    public static void findIdClientList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id khach hang can tim");
        int idClient = scanner.nextInt();

        for (int i = 0; i < clientList.size(); i++) {
            if ( idClient == clientList.get(i).getIdClient() ){
                System.out.println(clientList.get(i));
            }
            else {
                System.out.println("khong tim thay id khach hang.");
                break;
            }
        }
    }

    public static void  editClientList(){
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id khách hàng cần sửa thông tin");
        int idClient = scannerI.nextInt();

        for (int i = 0; i < clientList.size(); i++) {
            if (idClient == clientList.get(i).getIdClient() ){
                System.out.println("Nhập id khách hàng mới");
                int idClientList = scannerI.nextInt();
                System.out.println("Nhập tên khách hàng mới");
                String name = scannerS.nextLine();
                System.out.println("Nhập số điện thoại khách hàng mới");
                int phoneNumber = scannerI.nextInt();
                clientList.get(i).setIdClient(idClientList);
                clientList.get(i).setNameClient(name);
                clientList.get(i).setPhoneNumber(phoneNumber);
            }
            else {
                System.out.println("Khong tim thay id khach hang can sua thong tin");
            }
        }
    }
}
