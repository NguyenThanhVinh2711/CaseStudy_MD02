package model;

import java.time.LocalDate;

public class ProductNutritiousPorridge extends ProductList {

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
        super(idProduct, name, dateOfManufacture, expirationDate, price, numberOfProductsInStock);
        this.quantityOfNutritiousPorridgeCustomersBuy = quantityOfNutritiousPorridgeCustomersBuy;
    }

    public int getQuantityOfNutritiousPorridgeCustomersBuy() {
        return quantityOfNutritiousPorridgeCustomersBuy;
    }

    public void setQuantityOfNutritiousPorridgeCustomersBuy(int quantityOfNutritiousPorridgeCustomersBuy) {
        this.quantityOfNutritiousPorridgeCustomersBuy = quantityOfNutritiousPorridgeCustomersBuy;
    }

    @Override
    public String toString() {
        return "ProductNutritiousPorridge{" +
                "quantityOfNutritiousPorridgeCustomersBuy=" + quantityOfNutritiousPorridgeCustomersBuy +
                '}';
    }
}
