package com.example.model;

import javax.persistence.*;

@Entity
@Table(name="t_libraries")
public class Libraries {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="libraryname")
    private String name;
    @Column(name="librarylocation")
    private String location;

    public Libraries(){

    }

    public Libraries(String name,String location) {
        this.name = name;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
