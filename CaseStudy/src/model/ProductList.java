package model;

import java.io.Serializable;
import java.time.LocalDate;

public class ProductList implements Serializable {
    private String idProduct;
    private String nameProduct;
    private LocalDate dateOfManufacture;
    private LocalDate expirationDate;
    private int price;
    private int numberOfProductsInStock;

    public ProductList() {
    }

    public ProductList(String idProduct, String nameProduct, LocalDate dateOfManufacture, LocalDate expirationDate, int price) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.dateOfManufacture = dateOfManufacture;
        this.expirationDate = expirationDate;
        this.price = price;
    }

    public ProductList(String idProduct, String name, LocalDate dateOfManufacture, LocalDate expirationDate, int price, int numberOfProductsInStock) {
        this.idProduct = idProduct;
        this.nameProduct = name;
        this.dateOfManufacture = dateOfManufacture;
        this.expirationDate = expirationDate;
        this.price = price;
        this.numberOfProductsInStock = numberOfProductsInStock;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfProductsInStock() {
        return numberOfProductsInStock;
    }

    public void setNumberOfProductsInStock(int numberOfProductsInStock) {
        this.numberOfProductsInStock = numberOfProductsInStock;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "idProduct='" + idProduct + '\'' +
                ", nameProduct='" + nameProduct + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", expirationDate=" + expirationDate +
                ", price=" + price +
                ", numberOfProductsInStock=" + numberOfProductsInStock +
                '}';
    }
}
