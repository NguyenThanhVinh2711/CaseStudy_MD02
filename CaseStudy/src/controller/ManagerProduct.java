package controller;

import model.product.*;
import storage.InterfaceReadAndWrite;
import storage.ReadAndWriteProduct;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ManagerProduct {
    private static InterfaceReadAndWrite readFile = ReadAndWriteProduct.getInstance();

    public static List<ProductList> productLists;

    static {
        productLists = readFile.readFile();
    }

    public void addProductJam(ProductJam productJam) {
        productLists.add(productJam);
        readFile.writeFile(productLists);
    }

    public void addProductMilk(ProductMilk productMilk) {
        productLists.add(productMilk);
        readFile.writeFile(productLists);
    }

    public void addProductSoda(ProductSoda productSoda) {
        productLists.add(productSoda);
        readFile.writeFile(productLists);
    }

    public void addProductNoodles(ProductNoodles productNoodles) {
        productLists.add(productNoodles);
        readFile.writeFile(productLists);
    }

    public void addProductNutritiousPorridge(ProductNutritiousPorridge productNutritiousPorridge) {
        productLists.add(productNutritiousPorridge);
        readFile.writeFile(productLists);
    }

    public static void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id loại sản phẩm cần xoá");
        String idProductList = scanner.nextLine();
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i).getIdProduct().equals(idProductList)) {
                productLists.remove(productLists.get(i));
            } else {
                System.out.println("Không tìm thấy idProduct.");
                break;
            }
        }
    }

    public static void displayProductList() {
        for (int i = 0; i < productLists.size(); i++) {
            System.out.println(productLists.get(i).toString());
        }
    }

    public static void findIdProductList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm cần tìm:");
        String idProduct = scanner.nextLine();
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i).getIdProduct().equals(idProduct)) {
                System.out.println(productLists.get(i));
            } else {
                System.out.println("Không tìm thấy id sản phẩm");
                break;
            }
        }
    }





}
