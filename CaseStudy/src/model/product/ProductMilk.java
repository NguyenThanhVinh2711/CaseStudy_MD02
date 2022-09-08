package model.product;

import model.StockProduct;

import java.time.LocalDate;

public class ProductMilk extends ProductList implements StockProduct {
    private int quantityOfMilkCustomersBuy;

    public ProductMilk() {
    }

    public ProductMilk(int quantityOfMilkCustomersBuy) {
        this.quantityOfMilkCustomersBuy = quantityOfMilkCustomersBuy;
    }

    public ProductMilk(String idProduct, String nameProduct, LocalDate dateOfManufacture, LocalDate expirationDate, int price, int quantityOfMilkCustomersBuy) {
        super(idProduct, nameProduct, dateOfManufacture, expirationDate, price);
        this.quantityOfMilkCustomersBuy = quantityOfMilkCustomersBuy;
    }

    public ProductMilk(String idProduct, String name, LocalDate dateOfManufacture, LocalDate expirationDate, int price, int numberOfProductsInStock, int quantityOfMilkCustomersBuy) {
        super(idProduct, name, dateOfManufacture, expirationDate, price, numberOfProductsInStock);
        this.quantityOfMilkCustomersBuy = quantityOfMilkCustomersBuy;
    }

    public int getQuantityOfMilkCustomersBuy() {
        return quantityOfMilkCustomersBuy;
    }

    public void setQuantityOfMilkCustomersBuy(int quantityOfMilkCustomersBuy) {
        this.quantityOfMilkCustomersBuy = quantityOfMilkCustomersBuy;
    }

    @Override
    public int getStock() {
        return (getNumberOfProductsInStock() - getQuantityOfMilkCustomersBuy());
    }

    @Override
    public String toString() {
        return super.toString() +
                " quantityOfMilkCustomersBuy = " + quantityOfMilkCustomersBuy +
                ']';
    }
}
