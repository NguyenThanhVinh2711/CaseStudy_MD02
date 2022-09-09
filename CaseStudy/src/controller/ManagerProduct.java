package controller;

import model.Receipt;
import model.product.*;
import storage.InterfaceReadAndWrite;
import storage.ReadAndWriteProduct;

import java.util.List;
import java.util.Scanner;

public class ManagerProduct {
    private static InterfaceReadAndWrite readFile = ReadAndWriteProduct.getInstance();

    public static List<ProductList> productLists;

    static {
        productLists = readFile.readFile();
    }

    public void overWriteAddProductJam(ProductJam productJam) {
        productLists.add(productJam);
        readFile.writeFile(productLists);
    }

    public void overWriteAddProductMilk(ProductMilk productMilk) {
        productLists.add(productMilk);
        readFile.writeFile(productLists);
    }

    public void overWriteAddProductSoda(ProductSoda productSoda) {
        productLists.add(productSoda);
        readFile.writeFile(productLists);
    }

    public void overWriteAddProductNoodles(ProductNoodles productNoodles) {
        productLists.add(productNoodles);
        readFile.writeFile(productLists);
    }

    public void overWriteAddProductNutritiousPorridge(ProductNutritiousPorridge productNutritiousPorridge) {
        productLists.add(productNutritiousPorridge);
        readFile.writeFile(productLists);
    }

    public static void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id loại sản phẩm cần xoá");
        String idProductList = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i).getIdProduct().equals(idProductList)) {
                check = true;
                productLists.remove(productLists.get(i));
                System.out.println("Xoá thành công.");
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy idProduct.");
        }

        readFile.writeFile(productLists);
    }

    public static void displayProductList() {
        for (int i = 0; i < productLists.size(); i++) {
            System.out.println("-----Danh sách sản phẩm-----");
            System.out.println(productLists.get(i).toString());
            System.out.println("----------------------------");
        }
    }

    public static void findIdProductList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm cần tìm:");
        String idProduct = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i).getIdProduct().equals(idProduct)) {
                check = true;
                System.out.println("-----Products found-----");
                System.out.println(productLists.get(i));
                System.out.println("------------------------");
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy id sản phẩm");
        }
        readFile.writeFile(productLists);
    }

    public double getReceiptProduct() {
        double totalPrice = 0;
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i) instanceof Receipt) {
                totalPrice = ((Receipt) productLists.get(i)).getReceipt();
                System.out.println("-----Price-----");
                System.out.println(totalPrice);
                System.out.println("---------------");
            }
        }
        return totalPrice;
    }


}
