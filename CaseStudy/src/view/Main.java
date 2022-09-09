package view;

import controller.ManagerClient;
import controller.ManagerProduct;
import model.client.ClientList;
import model.product.*;

import java.util.Scanner;
import static controller.ManagerClient.*;
import static controller.ManagerProduct.*;
import static view.ControllerView.*;

public class Main {
    public static void main(String[] args) {
        do {
            showMenuManager();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập lựa chọn của bạn");
            int choice = scanner.nextInt(); ;

            switch (choice){
                case 1:
                    showMenuClient();
                    break;
                case 2:
                    showMenuProduct();
                    break;
                case 3:
                    showCalculatorPrice();
                    break;
            }
        }while (true);
    }
}
