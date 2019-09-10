package com.pamco.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "TB_SALES")
public class SalesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int saleID;

    @Column(name = "QTY")
    private int qty;
    @Column(name = "PER_ID")
    private int personID;
    @Column(name = "PRO_ID")
    private int productID;

    public int getSaleID() {
        return saleID;
    }

    public void setSaleID(int saleID) {
        this.saleID = saleID;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }
}
