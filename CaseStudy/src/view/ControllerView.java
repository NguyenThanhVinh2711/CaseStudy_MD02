package view;

import model.client.ClientList;
import model.product.*;

import java.time.LocalDate;
import java.util.Scanner;

import static controller.ManagerProduct.productLists;

public class ControllerView {
    public static void showMenu() {
        System.out.println("-----MENU-----");
        System.out.println("1.Thêm khách hàng");
        System.out.println("2.Thêm sản phẩm Jam ");
        System.out.println("3.Thêm sản phẩm Milk ");
        System.out.println("4.Thêm sản phẩm Noodles ");
        System.out.println("5.Thêm sản phẩm Cháo dinh dưỡng ");
        System.out.println("6.Thêm sản phẩm Soda ");
        System.out.println("7.Xoá Khách hàng");
        System.out.println("8.Xoá sản phẩm");
        System.out.println("9.Sửa thông tin khách hàng");
        System.out.println("10.Sửa thông tin sản phẩm Jam ");
        System.out.println("11.Sửa thông tin sản phẩm Milk ");
        System.out.println("12.Sửa thông tin sản phẩm Noodles ");
        System.out.println("13.Sửa thông tin sản phẩm Cháo dinh dưỡng ");
        System.out.println("14.Sửa thông tin sản phẩm Soda ");
        System.out.println("15.Tìm kiếm thông tin khách hàng");
        System.out.println("16.Tìm kiếm thông tin sản phẩm");
        System.out.println("17.Hiển thị thông tin khách hàng");
        System.out.println("18.Hiển thị thông tin sản phẩm");
        System.out.println("19.Hiển thị thông tin sản phẩm khách hàng đã mua");
        System.out.println("20.Tính tiền cho khách");
        System.out.println("21.Sản phẩm còn lại trong kho");
        System.out.println("0.Dừng Menu");
        System.out.println("-----END-----");
    }

    public static ClientList addClientList() {
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id khách hàng");
        int idClient = scannerI.nextInt();
        System.out.println("Nhập tên khách hàng");
        String nameClient = scannerS.nextLine();
        System.out.println("Nhập số điện thoại khách hàng");
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
        return client;
    }

    public static ProductJam addProductJam() {

        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm");
        String idProduct = scannerS.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String nameProduct = scannerS.nextLine();
        System.out.println(" Nhập ngày sản xuất");
        int dayOfManufacture = scannerI.nextInt();
        System.out.println(" Nhập tháng sản xuất");
        int monthOfManufacture = scannerI.nextInt();
        System.out.println(" Nhập năm sản xuất");
        int yearOfManufacture = scannerI.nextInt();
        System.out.println("Nhập ngày hết hạn");
        int dayExpiration = scannerI.nextInt();
        System.out.println("Nhập tháng hết hạn");
        int monthExpiration = scannerI.nextInt();
        System.out.println("Nhập năm hết hạn");
        int yearExpiration = scannerI.nextInt();
        System.out.println("Nhập giá sản phẩm");
        int price = scannerI.nextInt();
        System.out.println("Nhập tồn kho");
        int stock = scannerI.nextInt();
        System.out.println("Nhập số lượng sản phẩm khách hàng mua: ");
        int quantityOfJamCustomersBuy = scannerI.nextInt();

        return new ProductJam(idProduct, nameProduct, LocalDate.of(yearOfManufacture, monthOfManufacture, dayOfManufacture), LocalDate.of(yearExpiration, monthExpiration, dayExpiration), price, stock, quantityOfJamCustomersBuy);
    }

    public static ProductMilk addProductMilk() {
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm");
        String idProduct = scannerS.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String nameProduct = scannerS.nextLine();
        System.out.println(" Nhập ngày sản xuất");
        int dayOfManufacture = scannerI.nextInt();
        System.out.println(" Nhập tháng sản xuất");
        int monthOfManufacture = scannerI.nextInt();
        System.out.println(" Nhập năm sản xuất");
        int yearOfManufacture = scannerI.nextInt();
        System.out.println("Nhập ngày hết hạn");
        int dayExpiration = scannerI.nextInt();
        System.out.println("Nhập tháng hết hạn");
        int monthExpiration = scannerI.nextInt();
        System.out.println("Nhập năm hết hạn");
        int yearExpiration = scannerI.nextInt();
        System.out.println("Nhập giá sản phẩm");
        int price = scannerI.nextInt();
        System.out.println("Nhập tồn kho");
        int stock = scannerI.nextInt();
        System.out.println("Nhập số lượng sản phẩm khách hàng mua: ");
        int quantityOfJamCustomersBuy = scannerI.nextInt();

        return new ProductMilk(idProduct, nameProduct, LocalDate.of(yearOfManufacture, monthOfManufacture, dayOfManufacture), LocalDate.of(yearExpiration, monthExpiration, dayExpiration), price, quantityOfJamCustomersBuy);
    }

    public static ProductNoodles addProductNoodles() {
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm");
        String idProduct = scannerS.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String nameProduct = scannerS.nextLine();
        System.out.println(" Nhập ngày sản xuất");
        int dayOfManufacture = scannerI.nextInt();
        System.out.println(" Nhập tháng sản xuất");
        int monthOfManufacture = scannerI.nextInt();
        System.out.println(" Nhập năm sản xuất");
        int yearOfManufacture = scannerI.nextInt();
        System.out.println("Nhập ngày hết hạn");
        int dayExpiration = scannerI.nextInt();
        System.out.println("Nhập tháng hết hạn");
        int monthExpiration = scannerI.nextInt();
        System.out.println("Nhập năm hết hạn");
        int yearExpiration = scannerI.nextInt();
        System.out.println("Nhập giá sản phẩm");
        int price = scannerI.nextInt();
        System.out.println("Nhập tồn kho");
        int stock = scannerI.nextInt();
        System.out.println("Nhập số lượng sản phẩm khách hàng mua: ");
        int quantityOfJamCustomersBuy = scannerI.nextInt();

        return new ProductNoodles(idProduct, nameProduct, LocalDate.of(yearOfManufacture, monthOfManufacture, dayOfManufacture), LocalDate.of(yearExpiration, monthExpiration, dayExpiration), price, quantityOfJamCustomersBuy);
    }

    public static ProductNutritiousPorridge addProductNutritiousPorridge() {
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm");
        String idProduct = scannerS.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String nameProduct = scannerS.nextLine();
        System.out.println(" Nhập ngày sản xuất");
        int dayOfManufacture = scannerI.nextInt();
        System.out.println(" Nhập tháng sản xuất");
        int monthOfManufacture = scannerI.nextInt();
        System.out.println(" Nhập năm sản xuất");
        int yearOfManufacture = scannerI.nextInt();
        System.out.println("Nhập ngày hết hạn");
        int dayExpiration = scannerI.nextInt();
        System.out.println("Nhập tháng hết hạn");
        int monthExpiration = scannerI.nextInt();
        System.out.println("Nhập năm hết hạn");
        int yearExpiration = scannerI.nextInt();
        System.out.println("Nhập giá sản phẩm");
        int price = scannerI.nextInt();
        System.out.println("Nhập tồn kho");
        int stock = scannerI.nextInt();
        System.out.println("Nhập số lượng sản phẩm khách hàng mua: ");
        int quantityOfJamCustomersBuy = scannerI.nextInt();

        return new ProductNutritiousPorridge(idProduct, nameProduct, LocalDate.of(yearOfManufacture, monthOfManufacture, dayOfManufacture), LocalDate.of(yearExpiration, monthExpiration, dayExpiration), price, quantityOfJamCustomersBuy);
    }

    public static ProductSoda addProductSoda() {
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm");
        String idProduct = scannerS.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String nameProduct = scannerS.nextLine();
        System.out.println(" Nhập ngày sản xuất");
        int dayOfManufacture = scannerI.nextInt();
        System.out.println(" Nhập tháng sản xuất");
        int monthOfManufacture = scannerI.nextInt();
        System.out.println(" Nhập năm sản xuất");
        int yearOfManufacture = scannerI.nextInt();
        System.out.println("Nhập ngày hết hạn");
        int dayExpiration = scannerI.nextInt();
        System.out.println("Nhập tháng hết hạn");
        int monthExpiration = scannerI.nextInt();
        System.out.println("Nhập năm hết hạn");
        int yearExpiration = scannerI.nextInt();
        System.out.println("Nhập giá sản phẩm");
        int price = scannerI.nextInt();
        System.out.println("Nhập tồn kho");
        int stock = scannerI.nextInt();
        System.out.println("Nhập số lượng sản phẩm khách hàng mua: ");
        int quantityOfJamCustomersBuy = scannerI.nextInt();

        return new ProductSoda(idProduct, nameProduct, LocalDate.of(yearOfManufacture, monthOfManufacture, dayOfManufacture), LocalDate.of(yearExpiration, monthExpiration, dayExpiration), price, quantityOfJamCustomersBuy);
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
