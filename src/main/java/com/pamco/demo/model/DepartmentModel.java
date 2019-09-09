package com.pamco.demo.model;

import javax.persistence.*;

@Entity
public class DepartmentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int depID;

    private String depName;

    public int getDepID() {
        return depID;
    }

    public void setDepID(int depID) {
        this.depID = depID;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
}
