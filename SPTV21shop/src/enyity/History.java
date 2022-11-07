/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enyity;

import java.util.Date;

/**
 *
 * @author NikitaSkr
 */
public class History {
    private Product product;
    private Client client;
    private Date takeOnProduct;
    private Date returnProduct;

    public History() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getTakeOnProduct() {
        return takeOnProduct;
    }

    public void setTakeOnProduct(Date takeOnProduct) {
        this.takeOnProduct = takeOnProduct;
    }

    public Date getReturnProduct() {
        return returnProduct;
    }

    public void setReturnProduct(Date returnProduct) {
        this.returnProduct = returnProduct;
    }

    @Override
    public String toString() {
        return "History{" + "product=" + product + ", client=" + client + ", takeOnProduct=" + takeOnProduct + ", returnProduct=" + returnProduct + '}';
    }

}
