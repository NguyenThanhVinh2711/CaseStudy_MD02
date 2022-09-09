package model.product;

import model.Receipt;

import java.io.Serializable;
import java.time.LocalDate;

public class ProductJam extends ProductList implements Serializable, Receipt {
    private int quantityOfJamCustomersBuy;

    public ProductJam() {
    }

    public ProductJam(int quantityOfJamCustomersBuy) {
        this.quantityOfJamCustomersBuy = quantityOfJamCustomersBuy;
    }


    public ProductJam(String idProduct, String name, LocalDate dateOfManufacture, LocalDate expirationDate, double price, int quantityOfJamCustomersBuy) {
        super(idProduct, name, dateOfManufacture, expirationDate, price);
        this.quantityOfJamCustomersBuy = quantityOfJamCustomersBuy;
    }

    public int getQuantityOfJamCustomersBuy() {
        return quantityOfJamCustomersBuy;
    }

    public void setQuantityOfJamCustomersBuy(int quantityOfJamCustomersBuy) {
        this.quantityOfJamCustomersBuy = quantityOfJamCustomersBuy;
    }

    @Override
    public double getReceipt() {
        return getQuantityOfJamCustomersBuy()*getPrice();
    }

    @Override
    public String toString() {
        return super.toString() +
                " quantityOfJamCustomersBuy = " + quantityOfJamCustomersBuy +
                ']';
    }
}
