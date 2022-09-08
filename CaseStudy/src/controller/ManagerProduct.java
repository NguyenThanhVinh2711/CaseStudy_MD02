package controller;

import model.*;
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

    public static void editProductListJam() {
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm cần sửa:");
        String idProduct = scannerI.nextLine();
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i).getIdProduct().equals(idProduct)) {
                System.out.println("Nhập id sản phẩm mới");
                String newIdProduct = scannerS.nextLine();
                System.out.println("Nhập tên sản phẩm mới");
                String newNameProduct = scannerS.nextLine();
                System.out.println("Nhập ngày sản xuất mới");
                int newDayOfManufacture = scannerI.nextInt();
                System.out.println("Nhập tháng sản xuất mới");
                int newMonthOfManufacture = scannerI.nextInt();
                System.out.println("Nhập năm sản xuất mới");
                int newYearOfManufacture = scannerI.nextInt();
                System.out.println("Nhập ngày hết hạn mới");
                int newDayExpiration = scannerI.nextInt();
                System.out.println("Nhập tháng hết hạn mới");
                int newMonthExpiration = scannerI.nextInt();
                System.out.println("Nhập năm hết hạn mới");
                int newYearExpiration = scannerI.nextInt();
                System.out.println("Nhập giá sản phẩm mới");
                int newPrice = scannerI.nextInt();
                System.out.println("Nhập tồn kho mới");
                int newStock = scannerI.nextInt();
                System.out.println("Nhập số lượng sản phẩm mới khách hàng mua: ");
                int newCustomerBuy = scannerI.nextInt();

                productLists.get(i).setIdProduct(newIdProduct);
                productLists.get(i).setNameProduct(newNameProduct);
                productLists.get(i).setDateOfManufacture(LocalDate.of(newYearOfManufacture, newMonthOfManufacture, newDayOfManufacture));
                productLists.get(i).setExpirationDate(LocalDate.of(newYearExpiration, newMonthExpiration, newDayExpiration));
                productLists.get(i).setPrice(newPrice);
                productLists.get(i).setNumberOfProductsInStock(newStock);
                ProductJam pJ = (ProductJam) productLists.get(i);
                pJ.setQuantityOfJamCustomersBuy(newCustomerBuy);
            }
        }
    }
    public static void editProductListMilk(){
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm cần sửa:");
        String idProduct = scannerI.nextLine();
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i).getIdProduct().equals(idProduct)){
                System.out.println("Nhập id sản phẩm mới");
                String newIdProduct = scannerS.nextLine();
                System.out.println("Nhập tên sản phẩm mới");
                String newNameProduct = scannerS.nextLine();
                System.out.println("Nhập ngày sản xuất mới");
                int newDayOfManufacture = scannerI.nextInt();
                System.out.println("Nhập tháng sản xuất mới");
                int newMonthOfManufacture = scannerI.nextInt();
                System.out.println("Nhập năm sản xuất mới");
                int newYearOfManufacture = scannerI.nextInt();
                System.out.println("Nhập ngày hết hạn mới");
                int newDayExpiration = scannerI.nextInt();
                System.out.println("Nhập tháng hết hạn mới");
                int newMonthExpiration= scannerI.nextInt();
                System.out.println("Nhập năm hết hạn mới");
                int newYearExpiration = scannerI.nextInt();
                System.out.println("Nhập giá sản phẩm mới");
                int newPrice = scannerI.nextInt();
                System.out.println("Nhập tồn kho mới");
                int newStock = scannerI.nextInt();
                System.out.println("Nhập số lượng sản phẩm mới khách hàng mua: ");
                int newCustomerBuy = scannerI.nextInt();

                productLists.get(i).setIdProduct(newIdProduct);
                productLists.get(i).setNameProduct(newNameProduct);
                productLists.get(i).setDateOfManufacture(LocalDate.of(newYearOfManufacture, newMonthOfManufacture, newDayOfManufacture));
                productLists.get(i).setExpirationDate(LocalDate.of(newYearExpiration, newMonthExpiration, newDayExpiration));
                productLists.get(i).setPrice(newPrice);
                productLists.get(i).setNumberOfProductsInStock(newStock);
                ProductMilk  pM = (ProductMilk) productLists.get(i);
                pM.setQuantityOfMilkCustomersBuy(newCustomerBuy);
            }
        }
    }
    public static void editProductListNoodles(){
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm cần sửa:");
        String idProduct = scannerI.nextLine();
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i).getIdProduct().equals(idProduct)){
                System.out.println("Nhập id sản phẩm mới");
                String newIdProduct = scannerS.nextLine();
                System.out.println("Nhập tên sản phẩm mới");
                String newNameProduct = scannerS.nextLine();
                System.out.println("Nhập ngày sản xuất mới");
                int newDayOfManufacture = scannerI.nextInt();
                System.out.println("Nhập tháng sản xuất mới");
                int newMonthOfManufacture = scannerI.nextInt();
                System.out.println("Nhập năm sản xuất mới");
                int newYearOfManufacture = scannerI.nextInt();
                System.out.println("Nhập ngày hết hạn mới");
                int newDayExpiration = scannerI.nextInt();
                System.out.println("Nhập tháng hết hạn mới");
                int newMonthExpiration= scannerI.nextInt();
                System.out.println("Nhập năm hết hạn mới");
                int newYearExpiration = scannerI.nextInt();
                System.out.println("Nhập giá sản phẩm mới");
                int newPrice = scannerI.nextInt();
                System.out.println("Nhập tồn kho mới");
                int newStock = scannerI.nextInt();
                System.out.println("Nhập số lượng sản phẩm mới khách hàng mua: ");
                int newCustomerBuy = scannerI.nextInt();

                productLists.get(i).setIdProduct(newIdProduct);
                productLists.get(i).setNameProduct(newNameProduct);
                productLists.get(i).setDateOfManufacture(LocalDate.of(newYearOfManufacture, newMonthOfManufacture, newDayOfManufacture));
                productLists.get(i).setExpirationDate(LocalDate.of(newYearExpiration, newMonthExpiration, newDayExpiration));
                productLists.get(i).setPrice(newPrice);
                productLists.get(i).setNumberOfProductsInStock(newStock);
                ProductNoodles  pNoodles = (ProductNoodles) productLists.get(i);
                pNoodles.setQuantityOfNoodlesCustomersBuy(newCustomerBuy);
            }
        }
    }
    public static void editProductListNutritiousPorridge(){
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm cần sửa:");
        String idProduct = scannerI.nextLine();
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i).getIdProduct().equals(idProduct)){
                System.out.println("Nhập id sản phẩm mới");
                String newIdProduct = scannerS.nextLine();
                System.out.println("Nhập tên sản phẩm mới");
                String newNameProduct = scannerS.nextLine();
                System.out.println("Nhập ngày sản xuất mới");
                int newDayOfManufacture = scannerI.nextInt();
                System.out.println("Nhập tháng sản xuất mới");
                int newMonthOfManufacture = scannerI.nextInt();
                System.out.println("Nhập năm sản xuất mới");
                int newYearOfManufacture = scannerI.nextInt();
                System.out.println("Nhập ngày hết hạn mới");
                int newDayExpiration = scannerI.nextInt();
                System.out.println("Nhập tháng hết hạn mới");
                int newMonthExpiration= scannerI.nextInt();
                System.out.println("Nhập năm hết hạn mới");
                int newYearExpiration = scannerI.nextInt();
                System.out.println("Nhập giá sản phẩm mới");
                int newPrice = scannerI.nextInt();
                System.out.println("Nhập tồn kho mới");
                int newStock = scannerI.nextInt();
                System.out.println("Nhập số lượng sản phẩm mới khách hàng mua: ");
                int newCustomerBuy = scannerI.nextInt();

                productLists.get(i).setIdProduct(newIdProduct);
                productLists.get(i).setNameProduct(newNameProduct);
                productLists.get(i).setDateOfManufacture(LocalDate.of(newYearOfManufacture, newMonthOfManufacture, newDayOfManufacture));
                productLists.get(i).setExpirationDate(LocalDate.of(newYearExpiration, newMonthExpiration, newDayExpiration));
                productLists.get(i).setPrice(newPrice);
                productLists.get(i).setNumberOfProductsInStock(newStock);
                ProductNutritiousPorridge  pNp = (ProductNutritiousPorridge) productLists.get(i);
                pNp.setQuantityOfNutritiousPorridgeCustomersBuy(newCustomerBuy);
            }
        }
    }
    public static void editProductListSoda(){
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm cần sửa:");
        String idProduct = scannerI.nextLine();
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i).getIdProduct().equals(idProduct)){
                System.out.println("Nhập id sản phẩm mới");
                String newIdProduct = scannerS.nextLine();
                System.out.println("Nhập tên sản phẩm mới");
                String newNameProduct = scannerS.nextLine();
                System.out.println("Nhập ngày sản xuất mới");
                int newDayOfManufacture = scannerI.nextInt();
                System.out.println("Nhập tháng sản xuất mới");
                int newMonthOfManufacture = scannerI.nextInt();
                System.out.println("Nhập năm sản xuất mới");
                int newYearOfManufacture = scannerI.nextInt();
                System.out.println("Nhập ngày hết hạn mới");
                int newDayExpiration = scannerI.nextInt();
                System.out.println("Nhập tháng hết hạn mới");
                int newMonthExpiration= scannerI.nextInt();
                System.out.println("Nhập năm hết hạn mới");
                int newYearExpiration = scannerI.nextInt();
                System.out.println("Nhập giá sản phẩm mới");
                int newPrice = scannerI.nextInt();
                System.out.println("Nhập tồn kho mới");
                int newStock = scannerI.nextInt();
                System.out.println("Nhập số lượng sản phẩm mới khách hàng mua: ");
                int newCustomerBuy = scannerI.nextInt();

                productLists.get(i).setIdProduct(newIdProduct);
                productLists.get(i).setNameProduct(newNameProduct);
                productLists.get(i).setDateOfManufacture(LocalDate.of(newYearOfManufacture, newMonthOfManufacture, newDayOfManufacture));
                productLists.get(i).setExpirationDate(LocalDate.of(newYearExpiration, newMonthExpiration, newDayExpiration));
                productLists.get(i).setPrice(newPrice);
                productLists.get(i).setNumberOfProductsInStock(newStock);
                ProductSoda  pS = (ProductSoda) productLists.get(i);
                pS.setQuantityOfSodaCustomersBuy(newCustomerBuy);
            }
        }
    }



}
