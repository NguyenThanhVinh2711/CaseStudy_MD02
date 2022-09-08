package model;

import java.time.LocalDate;

public class ProductNoodles extends ProductList {
    private int quantityOfNoodlesCustomersBuy;

    public ProductNoodles() {
    }

    public ProductNoodles(int quantityOfNoodlesCustomersBuy) {
        this.quantityOfNoodlesCustomersBuy = quantityOfNoodlesCustomersBuy;
    }

    public ProductNoodles(String idProduct, String nameProduct, LocalDate dateOfManufacture, LocalDate expirationDate, int price, int quantityOfNoodlesCustomersBuy) {
        super(idProduct, nameProduct, dateOfManufacture, expirationDate, price);
        this.quantityOfNoodlesCustomersBuy = quantityOfNoodlesCustomersBuy;
    }

    public ProductNoodles(String idProduct, String name, LocalDate dateOfManufacture, LocalDate expirationDate, int price, int numberOfProductsInStock, int quantityOfNoodlesCustomersBuy) {
        super(idProduct, name, dateOfManufacture, expirationDate, price, numberOfProductsInStock);
        this.quantityOfNoodlesCustomersBuy = quantityOfNoodlesCustomersBuy;
    }

    public int getQuantityOfNoodlesCustomersBuy() {
        return quantityOfNoodlesCustomersBuy;
    }

    public void setQuantityOfNoodlesCustomersBuy(int quantityOfNoodlesCustomersBuy) {
        this.quantityOfNoodlesCustomersBuy = quantityOfNoodlesCustomersBuy;
    }

    @Override
    public String toString() {
        return "ProductNoodles{" +
                "quantityOfNoodlesCustomersBuy=" + quantityOfNoodlesCustomersBuy +
                '}';
    }
}
