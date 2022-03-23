package com.example.model;

import javax.persistence.*;

@Entity
@Table(name="t_Books")
public class Books {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name="bookname")
    private String name;
    @Column(name="bookyear")
    private int year;
    @Column(name="bookwriter")
    private String writer;
    @Column(name="bookprice")
    private int price;

    public Books() {
        
    }
    
    public Books(String name, int year, String writer, int price) {
        this.name = name;
        this.year = year;
        this.writer = writer;
        this.price = price;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer= writer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
