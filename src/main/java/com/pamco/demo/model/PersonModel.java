package com.pamco.demo.model;

import javax.persistence.*;

@Entity
public class PersonModel {

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "dep_id")
//    private List<DepartmentModel> persons ;
//
//    public List<PersonModel> getPersons() {
//        return persons;
//    }
//
//    public void setAddresses(List<PersonModel> persons) {
//        this.persons = persons;
//    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "perID")
    private int ID;

    @Column(name = "per_name")
    private String name;
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
