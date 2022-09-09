package view;

import controller.ManagerClient;
import controller.ManagerProduct;
import model.client.ClientList;
import model.product.*;

import java.time.LocalDate;
import java.util.Scanner;

import static controller.ManagerClient.*;
import static controller.ManagerProduct.*;

public class ControllerView {

    static ManagerClient controllerClient = new ManagerClient();
    static ManagerProduct controllerProduct = new ManagerProduct();

    public static void showMenuManager() {
        System.out.println("-----MENU-----");
        System.out.println("1.Quản lý khách hàng.");
        System.out.println("2.Quản lý sản phẩm.");
        System.out.println("3.Tính tiền sản phẩm khách đã mua.");
        System.out.println("0.Stop");
        System.out.println("-----END-----");
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập lựa chọn của bạn:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showMenuClient();
                    break;
                case 2:
                    showMenuProduct();
                    break;
                case 3:
                    showCalculatorPrice();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }

    public static void showMenuClient() {
        System.out.println("-----MENU-----");
        System.out.println("1.Thêm khách hàng.");
        System.out.println("2.Xoá Khách hàng.");
        System.out.println("3.Sửa thông tin khách hàng.");
        System.out.println("4.Tìm kiếm thông tin khách hàng.");
        System.out.println("5.Hiển thị thông tin khách hàng.");
        System.out.println("0.Quay lại màn hình quản lý.");
        System.out.println("-----END-----");
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập lựa chọn của bạn:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ClientList clients = addClientList();
                    controllerClient.overWriteClient(clients);
                    break;
                case 2:
                    deleteClient();
                    break;
                case 3:
                    editClientList();
                    break;
                case 4:
                    findIdClientList();
                    break;
                case 5:
                    displayClientList();
                    break;
                case 0:
                    showMenuManager();
            }
        } while (true);
    }

    public static void showMenuProduct() {
        System.out.println("-----MENU-----");
        System.out.println("1.Thêm sản phẩm Jam. ");
        System.out.println("2.Thêm sản phẩm Milk. ");
        System.out.println("3.Thêm sản phẩm Noodles. ");
        System.out.println("4.Thêm sản phẩm Cháo dinh dưỡng. ");
        System.out.println("5.Thêm sản phẩm Soda. ");
        System.out.println("6.Sửa thông tin sản phẩm Jam. ");
        System.out.println("7.Sửa thông tin sản phẩm Milk. ");
        System.out.println("8.Sửa thông tin sản phẩm Noodles. ");
        System.out.println("9.Sửa thông tin sản phẩm Cháo dinh dưỡng. ");
        System.out.println("10.Sửa thông tin sản phẩm Soda. ");
        System.out.println("11.Xoá sản phẩm.");
        System.out.println("12.Tìm kiếm thông tin sản phẩm.");
        System.out.println("13.Hiển thị thông tin sản phẩm.");
        System.out.println("0.Quay lại màn hình quản lý.");
        System.out.println("-----END-----");
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập lựa chọn của bạn:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ProductJam productJam = addProductJam();
                    controllerProduct.overWriteAddProductJam(productJam);
                    break;
                case 2:
                    ProductMilk productMilk = addProductMilk();
                    controllerProduct.overWriteAddProductMilk(productMilk);
                    break;
                case 3:
                    ProductNoodles productNoodles = addProductNoodles();
                    controllerProduct.overWriteAddProductNoodles(productNoodles);
                    break;
                case 4:
                    ProductNutritiousPorridge productNutritiousPorridge = addProductNutritiousPorridge();
                    controllerProduct.overWriteAddProductNutritiousPorridge(productNutritiousPorridge);
                    break;
                case 5:
                    ProductSoda productSoda = addProductSoda();
                    controllerProduct.overWriteAddProductSoda(productSoda);
                    break;
                case 6:
                    editProductListJam();
                    break;
                case 7:
                    editProductListMilk();
                    break;
                case 8:
                    editProductListNoodles();
                    break;
                case 9:
                    editProductListNutritiousPorridge();
                    break;
                case 10:
                    editProductListSoda();
                    break;
                case 11:
                    deleteProduct();
                    break;
                case 12:
                    findIdProductList();
                    break;
                case 13:
                    displayProductList();
                    break;
                case 0:
                    showMenuManager();
            }
        } while (true);
    }

    public static void showCalculatorPrice() {
        System.out.println("-----MENU-----");
        System.out.println("1.Hiển thị thông tin sản phẩm khách hàng đã mua.");
        System.out.println("2.Tính tiền cho khách.");
        System.out.println("0.Quay lại màn hình quản lý.");
        System.out.println("-----END-----");
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập lựa chọn của bạn:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    displayClientListAndProduct();
                    break;
                case 2:
                    controllerProduct.getReceiptProduct();
                    break;
                case 0:
                    showMenuManager();
            }
        } while (true);

    }

    public static ClientList addClientList() {
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id khách hàng:");
        int idClient = scannerI.nextInt();
        System.out.println("Nhập tên khách hàng:");
        String nameClient = scannerS.nextLine();
        System.out.println("Nhập số điện thoại khách hàng:");
        int phoneNumber = scannerI.nextInt();
        System.out.println("Nhập id sản phẩm khách hàng mua:");
        String idProduct = scannerS.nextLine();

        boolean check = false;
        ClientList client = null;
        ProductList product = null;

        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i).getIdProduct().equals(idProduct)) {
                check = true;
                product = productLists.get(i);
            }
        }
        if (check) {
            client = new ClientList(idClient, nameClient, phoneNumber, product);
        }
        System.out.println("Thêm thành công.");
        return client;
    }

    public static ProductJam addProductJam() {

        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm:");
        String idProduct = scannerS.nextLine();
        System.out.println("Nhập tên sản phẩm:");
        String nameProduct = scannerS.nextLine();
        System.out.println(" Nhập ngày sản xuất:");
        int dayOfManufacture = scannerI.nextInt();
        System.out.println(" Nhập tháng sản xuất:");
        int monthOfManufacture = scannerI.nextInt();
        System.out.println(" Nhập năm sản xuất:");
        int yearOfManufacture = scannerI.nextInt();
        System.out.println("Nhập ngày hết hạn:");
        int dayExpiration = scannerI.nextInt();
        System.out.println("Nhập tháng hết hạn:");
        int monthExpiration = scannerI.nextInt();
        System.out.println("Nhập năm hết hạn:");
        int yearExpiration = scannerI.nextInt();
        System.out.println("Nhập giá sản phẩm:");
        int price = scannerI.nextInt();

        System.out.println("Nhập số lượng sản phẩm khách hàng mua: ");
        int quantityOfJamCustomersBuy = scannerI.nextInt();

        System.out.println("Thêm thành công.");

        return new ProductJam(idProduct, nameProduct, LocalDate.of(yearOfManufacture, monthOfManufacture, dayOfManufacture), LocalDate.of(yearExpiration, monthExpiration, dayExpiration), price, quantityOfJamCustomersBuy);
    }

    public static ProductMilk addProductMilk() {
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm:");
        String idProduct = scannerS.nextLine();
        System.out.println("Nhập tên sản phẩm:");
        String nameProduct = scannerS.nextLine();
        System.out.println(" Nhập ngày sản xuất:");
        int dayOfManufacture = scannerI.nextInt();
        System.out.println(" Nhập tháng sản xuất:");
        int monthOfManufacture = scannerI.nextInt();
        System.out.println(" Nhập năm sản xuất:");
        int yearOfManufacture = scannerI.nextInt();
        System.out.println("Nhập ngày hết hạn:");
        int dayExpiration = scannerI.nextInt();
        System.out.println("Nhập tháng hết hạn:");
        int monthExpiration = scannerI.nextInt();
        System.out.println("Nhập năm hết hạn:");
        int yearExpiration = scannerI.nextInt();
        System.out.println("Nhập giá sản phẩm:");
        int price = scannerI.nextInt();
        System.out.println("Nhập số lượng sản phẩm khách hàng mua: ");
        int quantityOfJamCustomersBuy = scannerI.nextInt();

        System.out.println("Thêm thành công.");

        return new ProductMilk(idProduct, nameProduct, LocalDate.of(yearOfManufacture, monthOfManufacture, dayOfManufacture), LocalDate.of(yearExpiration, monthExpiration, dayExpiration), price, quantityOfJamCustomersBuy);
    }

    public static ProductNoodles addProductNoodles() {
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm:");
        String idProduct = scannerS.nextLine();
        System.out.println("Nhập tên sản phẩm:");
        String nameProduct = scannerS.nextLine();
        System.out.println(" Nhập ngày sản xuất:");
        int dayOfManufacture = scannerI.nextInt();
        System.out.println(" Nhập tháng sản xuất:");
        int monthOfManufacture = scannerI.nextInt();
        System.out.println(" Nhập năm sản xuất:");
        int yearOfManufacture = scannerI.nextInt();
        System.out.println("Nhập ngày hết hạn:");
        int dayExpiration = scannerI.nextInt();
        System.out.println("Nhập tháng hết hạn:");
        int monthExpiration = scannerI.nextInt();
        System.out.println("Nhập năm hết hạn:");
        int yearExpiration = scannerI.nextInt();
        System.out.println("Nhập giá sản phẩm:");
        int price = scannerI.nextInt();
        System.out.println("Nhập số lượng sản phẩm khách hàng mua: ");
        int quantityOfJamCustomersBuy = scannerI.nextInt();

        System.out.println("Thêm thành công.");

        return new ProductNoodles(idProduct, nameProduct, LocalDate.of(yearOfManufacture, monthOfManufacture, dayOfManufacture), LocalDate.of(yearExpiration, monthExpiration, dayExpiration), price, quantityOfJamCustomersBuy);
    }

    public static ProductNutritiousPorridge addProductNutritiousPorridge() {
        Scanner scannerI = new Scanner(System.in);

        Scanner scannerS = new Scanner(System.in);

        System.out.println("Nhập id sản phẩm:");
        String idProduct = scannerS.nextLine();
        System.out.println("Nhập tên sản phẩm:");
        String nameProduct = scannerS.nextLine();
        System.out.println(" Nhập ngày sản xuất:");
        int dayOfManufacture = scannerI.nextInt();
        System.out.println(" Nhập tháng sản xuất:");
        int monthOfManufacture = scannerI.nextInt();
        System.out.println(" Nhập năm sản xuất:");
        int yearOfManufacture = scannerI.nextInt();
        System.out.println("Nhập ngày hết hạn:");
        int dayExpiration = scannerI.nextInt();
        System.out.println("Nhập tháng hết hạn:");
        int monthExpiration = scannerI.nextInt();
        System.out.println("Nhập năm hết hạn:");
        int yearExpiration = scannerI.nextInt();
        System.out.println("Nhập giá sản phẩm:");
        int price = scannerI.nextInt();
        System.out.println("Nhập số lượng sản phẩm khách hàng mua: ");
        int quantityOfJamCustomersBuy = scannerI.nextInt();

        System.out.println("Thêm thành công.");

        return new ProductNutritiousPorridge(idProduct, nameProduct, LocalDate.of(yearOfManufacture, monthOfManufacture, dayOfManufacture), LocalDate.of(yearExpiration, monthExpiration, dayExpiration), price, quantityOfJamCustomersBuy);
    }

    public static ProductSoda addProductSoda() {
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm:");
        String idProduct = scannerS.nextLine();
        System.out.println("Nhập tên sản phẩm:");
        String nameProduct = scannerS.nextLine();
        System.out.println(" Nhập ngày sản xuất:");
        int dayOfManufacture = scannerI.nextInt();
        System.out.println(" Nhập tháng sản xuất:");
        int monthOfManufacture = scannerI.nextInt();
        System.out.println(" Nhập năm sản xuất:");
        int yearOfManufacture = scannerI.nextInt();
        System.out.println("Nhập ngày hết hạn:");
        int dayExpiration = scannerI.nextInt();
        System.out.println("Nhập tháng hết hạn:");
        int monthExpiration = scannerI.nextInt();
        System.out.println("Nhập năm hết hạn:");
        int yearExpiration = scannerI.nextInt();
        System.out.println("Nhập giá sản phẩm:");
        int price = scannerI.nextInt();
        System.out.println("Nhập số lượng sản phẩm khách hàng mua: ");
        int quantityOfJamCustomersBuy = scannerI.nextInt();

        System.out.println("Thêm thành công.");

        return new ProductSoda(idProduct, nameProduct, LocalDate.of(yearOfManufacture, monthOfManufacture, dayOfManufacture), LocalDate.of(yearExpiration, monthExpiration, dayExpiration), price, quantityOfJamCustomersBuy);
    }

    public static void editProductListMilk() {
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm cần sửa:");
        String idProduct = scannerI.nextLine();
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i).getIdProduct().equals(idProduct)) {
                System.out.println("Nhập id sản phẩm mới:");
                String newIdProduct = scannerS.nextLine();
                System.out.println("Nhập tên sản phẩm mới:");
                String newNameProduct = scannerS.nextLine();
                System.out.println("Nhập ngày sản xuất mới:");
                int newDayOfManufacture = scannerI.nextInt();
                System.out.println("Nhập tháng sản xuất mới:");
                int newMonthOfManufacture = scannerI.nextInt();
                System.out.println("Nhập năm sản xuất mới:");
                int newYearOfManufacture = scannerI.nextInt();
                System.out.println("Nhập ngày hết hạn mới:");
                int newDayExpiration = scannerI.nextInt();
                System.out.println("Nhập tháng hết hạn mới:");
                int newMonthExpiration = scannerI.nextInt();
                System.out.println("Nhập năm hết hạn mới:");
                int newYearExpiration = scannerI.nextInt();
                System.out.println("Nhập giá sản phẩm mới:");
                int newPrice = scannerI.nextInt();
                System.out.println("Nhập số lượng sản phẩm mới khách hàng mua: ");
                int newCustomerBuy = scannerI.nextInt();

                productLists.get(i).setIdProduct(newIdProduct);
                productLists.get(i).setNameProduct(newNameProduct);
                productLists.get(i).setDateOfManufacture(LocalDate.of(newYearOfManufacture, newMonthOfManufacture, newDayOfManufacture));
                productLists.get(i).setExpirationDate(LocalDate.of(newYearExpiration, newMonthExpiration, newDayExpiration));
                productLists.get(i).setPrice(newPrice);

                ProductMilk pM = (ProductMilk) productLists.get(i);
                pM.setQuantityOfMilkCustomersBuy(newCustomerBuy);

                System.out.println("Sửa thành công.");

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
                System.out.println("Nhập id sản phẩm mới:");
                String newIdProduct = scannerS.nextLine();
                System.out.println("Nhập tên sản phẩm mới:");
                String newNameProduct = scannerS.nextLine();
                System.out.println("Nhập ngày sản xuất mới:");
                int newDayOfManufacture = scannerI.nextInt();
                System.out.println("Nhập tháng sản xuất mới:");
                int newMonthOfManufacture = scannerI.nextInt();
                System.out.println("Nhập năm sản xuất mới:");
                int newYearOfManufacture = scannerI.nextInt();
                System.out.println("Nhập ngày hết hạn mới:");
                int newDayExpiration = scannerI.nextInt();
                System.out.println("Nhập tháng hết hạn mới:");
                int newMonthExpiration = scannerI.nextInt();
                System.out.println("Nhập năm hết hạn mới:");
                int newYearExpiration = scannerI.nextInt();
                System.out.println("Nhập giá sản phẩm mới:");
                int newPrice = scannerI.nextInt();
                System.out.println("Nhập số lượng sản phẩm mới khách hàng mua: ");
                int newCustomerBuy = scannerI.nextInt();

                productLists.get(i).setIdProduct(newIdProduct);
                productLists.get(i).setNameProduct(newNameProduct);
                productLists.get(i).setDateOfManufacture(LocalDate.of(newYearOfManufacture, newMonthOfManufacture, newDayOfManufacture));
                productLists.get(i).setExpirationDate(LocalDate.of(newYearExpiration, newMonthExpiration, newDayExpiration));
                productLists.get(i).setPrice(newPrice);

                ProductJam pJ = (ProductJam) productLists.get(i);
                pJ.setQuantityOfJamCustomersBuy(newCustomerBuy);
                System.out.println("Sửa thành công.");
            }
        }
    }

    public static void editProductListNoodles() {
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm cần sửa:");
        String idProduct = scannerI.nextLine();
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i).getIdProduct().equals(idProduct)) {
                System.out.println("Nhập id sản phẩm mới:");
                String newIdProduct = scannerS.nextLine();
                System.out.println("Nhập tên sản phẩm mới:");
                String newNameProduct = scannerS.nextLine();
                System.out.println("Nhập ngày sản xuất mới:");
                int newDayOfManufacture = scannerI.nextInt();
                System.out.println("Nhập tháng sản xuất mới:");
                int newMonthOfManufacture = scannerI.nextInt();
                System.out.println("Nhập năm sản xuất mới:");
                int newYearOfManufacture = scannerI.nextInt();
                System.out.println("Nhập ngày hết hạn mới:");
                int newDayExpiration = scannerI.nextInt();
                System.out.println("Nhập tháng hết hạn mới:");
                int newMonthExpiration = scannerI.nextInt();
                System.out.println("Nhập năm hết hạn mới:");
                int newYearExpiration = scannerI.nextInt();
                System.out.println("Nhập giá sản phẩm mới:");
                int newPrice = scannerI.nextInt();

                System.out.println("Nhập số lượng sản phẩm mới khách hàng mua: ");
                int newCustomerBuy = scannerI.nextInt();

                productLists.get(i).setIdProduct(newIdProduct);
                productLists.get(i).setNameProduct(newNameProduct);
                productLists.get(i).setDateOfManufacture(LocalDate.of(newYearOfManufacture, newMonthOfManufacture, newDayOfManufacture));
                productLists.get(i).setExpirationDate(LocalDate.of(newYearExpiration, newMonthExpiration, newDayExpiration));
                productLists.get(i).setPrice(newPrice);

                ProductNoodles pNoodles = (ProductNoodles) productLists.get(i);
                pNoodles.setQuantityOfNoodlesCustomersBuy(newCustomerBuy);
                System.out.println("Sửa thành công.");
            }
        }
    }

    public static void editProductListNutritiousPorridge() {
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm cần sửa:");
        String idProduct = scannerI.nextLine();
        for (int i = 0; i < productLists.size(); i++) {
            if (productLists.get(i).getIdProduct().equals(idProduct)) {
                System.out.println("Nhập id sản phẩm mới:");
                String newIdProduct = scannerS.nextLine();
                System.out.println("Nhập tên sản phẩm mới:");
                String newNameProduct = scannerS.nextLine();
                System.out.println("Nhập ngày sản xuất mới:");
                int newDayOfManufacture = scannerI.nextInt();
                System.out.println("Nhập tháng sản xuất mới:");
                int newMonthOfManufacture = scannerI.nextInt();
                System.out.println("Nhập năm sản xuất mới:");
                int newYearOfManufacture = scannerI.nextInt();
                System.out.println("Nhập ngày hết hạn mới");
                int newDayExpiration = scannerI.nextInt();
                System.out.println("Nhập tháng hết hạn mới");
                int newMonthExpiration = scannerI.nextInt();
                System.out.println("Nhập năm hết hạn mới");
                int newYearExpiration = scannerI.nextInt();
                System.out.println("Nhập giá sản phẩm mới");
                int newPrice = scannerI.nextInt();

                System.out.println("Nhập số lượng sản phẩm mới khách hàng mua: ");
                int newCustomerBuy = scannerI.nextInt();

                productLists.get(i).setIdProduct(newIdProduct);
                productLists.get(i).setNameProduct(newNameProduct);
                productLists.get(i).setDateOfManufacture(LocalDate.of(newYearOfManufacture, newMonthOfManufacture, newDayOfManufacture));
                productLists.get(i).setExpirationDate(LocalDate.of(newYearExpiration, newMonthExpiration, newDayExpiration));
                productLists.get(i).setPrice(newPrice);

                ProductNutritiousPorridge pNp = (ProductNutritiousPorridge) productLists.get(i);
                pNp.setQuantityOfNutritiousPorridgeCustomersBuy(newCustomerBuy);
                System.out.println("Sửa thành công.");
            }
        }
    }

    public static void editProductListSoda() {
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

                System.out.println("Nhập số lượng sản phẩm mới khách hàng mua: ");
                int newCustomerBuy = scannerI.nextInt();

                productLists.get(i).setIdProduct(newIdProduct);
                productLists.get(i).setNameProduct(newNameProduct);
                productLists.get(i).setDateOfManufacture(LocalDate.of(newYearOfManufacture, newMonthOfManufacture, newDayOfManufacture));
                productLists.get(i).setExpirationDate(LocalDate.of(newYearExpiration, newMonthExpiration, newDayExpiration));
                productLists.get(i).setPrice(newPrice);

                ProductSoda pS = (ProductSoda) productLists.get(i);
                pS.setQuantityOfSodaCustomersBuy(newCustomerBuy);
                System.out.println("Sửa thành công.");
            }
        }
    }
}
