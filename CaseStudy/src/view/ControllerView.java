package view;

import model.*;

import java.time.LocalDate;
import java.util.Scanner;

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
        return new ClientList(idClient, nameClient, phoneNumber);
    }

    public static ProductJam addProductJam(){
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

        return new ProductJam(idProduct,nameProduct, LocalDate.of(yearOfManufacture,monthOfManufacture,dayOfManufacture),LocalDate.of(yearExpiration,monthExpiration,dayExpiration),price,quantityOfJamCustomersBuy);
    }
    public static ProductMilk addProductMilk(){
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

        return new ProductMilk (idProduct,nameProduct, LocalDate.of(yearOfManufacture,monthOfManufacture,dayOfManufacture),LocalDate.of(yearExpiration,monthExpiration,dayExpiration),price,quantityOfJamCustomersBuy);
    }

    public static ProductNoodles addProductNoodles(){
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

        return new ProductNoodles(idProduct,nameProduct, LocalDate.of(yearOfManufacture,monthOfManufacture,dayOfManufacture),LocalDate.of(yearExpiration,monthExpiration,dayExpiration),price,quantityOfJamCustomersBuy);
    }

    public static ProductNutritiousPorridge addProductNutritiousPorridge(){
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

        return new ProductNutritiousPorridge (idProduct,nameProduct, LocalDate.of(yearOfManufacture,monthOfManufacture,dayOfManufacture),LocalDate.of(yearExpiration,monthExpiration,dayExpiration),price,quantityOfJamCustomersBuy);
    }

    public static ProductSoda addProductSoda(){
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

        return new ProductSoda(idProduct,nameProduct, LocalDate.of(yearOfManufacture,monthOfManufacture,dayOfManufacture),LocalDate.of(yearExpiration,monthExpiration,dayExpiration),price,quantityOfJamCustomersBuy);
    }


}
