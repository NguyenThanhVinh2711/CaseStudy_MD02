package model;

import java.io.Serializable;

public class ClientList implements Serializable {

    private int idClient;
    private String nameClient;
    private int phoneNumber;
    private ProductList productList;

    public ClientList() {
    }

    public ClientList(int idClient, String nameClient, int phoneNumber) {
        this.idClient = idClient;
        this.nameClient = nameClient;
        this.phoneNumber = phoneNumber;
    }

    public ClientList(int idClient, String nameClient, int phoneNumber, ProductList productList) {
        this.idClient = idClient;
        this.nameClient = nameClient;
        this.phoneNumber = phoneNumber;
        this.productList = productList;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ProductList getProductList() {
        return productList;
    }

    public void setProductList(ProductList productList) {
        this.productList = productList;
    }

    public String toString1() {
        return "ClientList{" +
                "idClient=" + idClient +
                ", nameClient='" + nameClient + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public String toString() {
        return "ClientList{" +
                "idClient=" + idClient +
                ", nameClient='" + nameClient + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", productList=" + productList +
                '}';
    }
}
