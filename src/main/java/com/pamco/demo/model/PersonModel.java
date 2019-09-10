package com.pamco.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "TB_PERSONS")
public class PersonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int ID;

    @Column(name = "NAME")
    private String name;
    @Column(name = "DEP_ID")
    private int depID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepID() {
        return depID;
    }

    public void setDepID(int depID) {
        this.depID = depID;
    }
}
