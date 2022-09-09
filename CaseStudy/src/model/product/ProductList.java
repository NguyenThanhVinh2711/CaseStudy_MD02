package model.product;

import java.io.Serializable;
import java.time.LocalDate;

public class ProductList implements Serializable {
    private String idProduct;
    private String nameProduct;
    private LocalDate dateOfManufacture;
    private LocalDate expirationDate;
    private double price;

    public ProductList() {
    }

    public ProductList(String idProduct, String name, LocalDate dateOfManufacture, LocalDate expirationDate, double price) {
        this.idProduct = idProduct;
        this.nameProduct = name;
        this.dateOfManufacture = dateOfManufacture;
        this.expirationDate = expirationDate;
        this.price = price;

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

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "[" + "idProduct = '" + idProduct + '\'' +
                ", nameProduct = '" + nameProduct + '\'' +
                ", dateOfManufacture = " + dateOfManufacture +
                ", expirationDate = " + expirationDate +
                ", price = " + price
                ;
    }
}
