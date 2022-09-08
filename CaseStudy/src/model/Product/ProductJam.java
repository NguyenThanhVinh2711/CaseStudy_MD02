package model.Product;

import model.StockProduct;

import java.time.LocalDate;

public class ProductJam extends ProductList implements StockProduct {
    private int quantityOfJamCustomersBuy;

    public ProductJam() {
    }

    public ProductJam(int quantityOfJamCustomersBuy) {
        this.quantityOfJamCustomersBuy = quantityOfJamCustomersBuy;
    }

    public ProductJam(String idProduct, String name, LocalDate dateOfManufacture, LocalDate expirationDate, int price, int quantityOfJamCustomersBuy) {
        super(idProduct, name, dateOfManufacture, expirationDate, price);
        this.quantityOfJamCustomersBuy = quantityOfJamCustomersBuy;
    }

    public ProductJam(String idProduct, String name, LocalDate dateOfManufacture, LocalDate expirationDate, int price, int numberOfProductsInStock, int quantityOfJamCustomersBuy) {
        super(idProduct, name, dateOfManufacture, expirationDate, price, numberOfProductsInStock);
        this.quantityOfJamCustomersBuy = quantityOfJamCustomersBuy;
    }

    public int getQuantityOfJamCustomersBuy() {
        return quantityOfJamCustomersBuy;
    }

    public void setQuantityOfJamCustomersBuy(int quantityOfJamCustomersBuy) {
        this.quantityOfJamCustomersBuy = quantityOfJamCustomersBuy;
    }

    public int getStock() {
        return  (getNumberOfProductsInStock() - getQuantityOfJamCustomersBuy() ) ;
    }

    @Override
    public String toString() {
        return super.toString() +
                " quantityOfJamCustomersBuy = " + quantityOfJamCustomersBuy +
                ']';
    }
}
