package model;

import java.time.LocalDate;

public class ProductSoda extends ProductList {
    private int quantityOfSodaCustomersBuy;

    public ProductSoda() {
    }
    public ProductSoda(int quantityOfSodaCustomersBuy) {
        this.quantityOfSodaCustomersBuy = quantityOfSodaCustomersBuy;
    }

    public ProductSoda(String idProduct, String nameProduct, LocalDate dateOfManufacture, LocalDate expirationDate, int price, int quantityOfSodaCustomersBuy) {
        super(idProduct, nameProduct, dateOfManufacture, expirationDate, price);
        this.quantityOfSodaCustomersBuy = quantityOfSodaCustomersBuy;
    }

    public ProductSoda(String idProduct, String name, LocalDate dateOfManufacture, LocalDate expirationDate, int price, int numberOfProductsInStock, int quantityOfSodaCustomersBuy) {
        super(idProduct, name, dateOfManufacture, expirationDate, price, numberOfProductsInStock);
        this.quantityOfSodaCustomersBuy = quantityOfSodaCustomersBuy;
    }

    public int getQuantityOfSodaCustomersBuy() {
        return quantityOfSodaCustomersBuy;
    }

    public void setQuantityOfSodaCustomersBuy(int quantityOfSodaCustomersBuy) {
        this.quantityOfSodaCustomersBuy = quantityOfSodaCustomersBuy;
    }

    @Override
    public String toString() {
        return "ProductSoda{" +
                "quantityOfSodaCustomersBuy=" + quantityOfSodaCustomersBuy +
                '}';
    }
}
