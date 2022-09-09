package model.product;

import model.Receipt;

import java.io.Serializable;
import java.time.LocalDate;

public class ProductMilk extends ProductList  implements Serializable , Receipt {
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
        super(idProduct, name, dateOfManufacture, expirationDate, price);
        this.quantityOfMilkCustomersBuy = quantityOfMilkCustomersBuy;
    }

    public int getQuantityOfMilkCustomersBuy() {
        return quantityOfMilkCustomersBuy;
    }

    public void setQuantityOfMilkCustomersBuy(int quantityOfMilkCustomersBuy) {
        this.quantityOfMilkCustomersBuy = quantityOfMilkCustomersBuy;
    }

    @Override
    public double getReceipt() {
        return getQuantityOfMilkCustomersBuy()*getPrice();
    }

    @Override
    public String toString() {
        return super.toString() +
                " quantityOfMilkCustomersBuy = " + quantityOfMilkCustomersBuy +
                ']';
    }
}
