package view;

import controller.ManagerClient;
import controller.ManagerProduct;
import model.*;

import java.util.Scanner;

import static controller.ManagerClient.*;
import static view.ControllerView.*;

public class Main {
    public static void main(String[] args) {
        ManagerClient controllerClient = new ManagerClient();
        ManagerProduct controllerProduct = new ManagerProduct();

        do {
            showMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập lựa chọn của bạn");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ClientList clients = addClientList();
                    controllerClient.addClient(clients);
                    break;
                case 2:
                    ProductJam productJam = addProductJam();
                    controllerProduct.addProductJam(productJam);
                case 3:
                    ProductMilk productMilk= addProductMilk();
                    controllerProduct.addProductMilk(productMilk);
                case 4:
                    ProductNoodles productNoodles = addProductNoodles();
                    controllerProduct.addProductNoodles(productNoodles);
                case 5:
                    ProductNutritiousPorridge productNutritiousPorridge = addProductNutritiousPorridge();
                    controllerProduct.addProductNutritiousPorridge(productNutritiousPorridge);
                case 6:
                    ProductSoda productSoda = addProductSoda();
                    controllerProduct.addProductSoda(productSoda);
//                case 3:
//                    deleteClient();
//                    break;
////            case 4:
//                case 5:
//                    editClientList();
//                    break;
////            case 6:
//                case 7:
//                    findIdClientList();
//                    break;
////            case 8:
//                case 9:
//                    displayClientList();
//                    break;
////            case 10:
//                case 11:
//                    displayClientListAndProduct();
//                    break;
////            case 12:
////
//                case 13:
//                    System.exit(0);
//                    break;
            }
        } while (true);
    }
}
