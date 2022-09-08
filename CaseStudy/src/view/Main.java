package view;

import controller.ManagerClient;
import controller.ManagerProduct;
import model.client.ClientList;
import model.product.*;

import java.util.Scanner;
import static controller.ManagerClient.*;
import static controller.ManagerProduct.deleteProduct;
import static controller.ManagerProduct.displayProductList;
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
                    break;
                case 3:
                    ProductMilk productMilk = addProductMilk();
                    controllerProduct.addProductMilk(productMilk);
                    break;
                case 4:
                    ProductNoodles productNoodles = addProductNoodles();
                    controllerProduct.addProductNoodles(productNoodles);
                    break;
                case 5:
                    ProductNutritiousPorridge productNutritiousPorridge = addProductNutritiousPorridge();
                    controllerProduct.addProductNutritiousPorridge(productNutritiousPorridge);
                    break;
                case 6:
                    ProductSoda productSoda = addProductSoda();
                    controllerProduct.addProductSoda(productSoda);
                    break;
                case 7:
                    deleteClient();
                    break;
                case 8:
                    deleteProduct();
                    break;
                case 17:
                    displayClientList();
                    break;
                case 18:
                    displayProductList();
                    break;
                case 19:
                    displayClientListAndProduct();
                    break;
            }
        } while (true);
    }
}
