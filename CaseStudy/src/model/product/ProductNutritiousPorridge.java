package model.product;

import model.Receipt;

import java.io.Serializable;
import java.time.LocalDate;

public class ProductNutritiousPorridge extends ProductList implements Serializable, Receipt {

    private int quantityOfNutritiousPorridgeCustomersBuy;

    public ProductNutritiousPorridge() {
    }

    public ProductNutritiousPorridge(int quantityOfNutritiousPorridgeCustomersBuy) {
        this.quantityOfNutritiousPorridgeCustomersBuy = quantityOfNutritiousPorridgeCustomersBuy;
    }

    public ProductNutritiousPorridge(String idProduct, String nameProduct, LocalDate dateOfManufacture, LocalDate expirationDate, int price, int quantityOfNutritiousPorridgeCustomersBuy) {
        super(idProduct, nameProduct, dateOfManufacture, expirationDate, price);
        this.quantityOfNutritiousPorridgeCustomersBuy = quantityOfNutritiousPorridgeCustomersBuy;
    }

    public ProductNutritiousPorridge(String idProduct, String name, LocalDate dateOfManufacture, LocalDate expirationDate, int price, int numberOfProductsInStock, int quantityOfNutritiousPorridgeCustomersBuy) {
        super(idProduct, name, dateOfManufacture, expirationDate, price);
        this.quantityOfNutritiousPorridgeCustomersBuy = quantityOfNutritiousPorridgeCustomersBuy;
    }

    public int getQuantityOfNutritiousPorridgeCustomersBuy() {
        return quantityOfNutritiousPorridgeCustomersBuy;
    }

    public void setQuantityOfNutritiousPorridgeCustomersBuy(int quantityOfNutritiousPorridgeCustomersBuy) {
        this.quantityOfNutritiousPorridgeCustomersBuy = quantityOfNutritiousPorridgeCustomersBuy;
    }

    @Override
    public double getReceipt() {
        return getQuantityOfNutritiousPorridgeCustomersBuy()*getPrice();
    }

    @Override
    public String toString() {
        return  super.toString() +
                " quantityOfNutritiousPorridgeCustomersBuy = " + quantityOfNutritiousPorridgeCustomersBuy +
                ']';
    }
}
