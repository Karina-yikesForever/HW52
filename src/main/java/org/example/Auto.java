package org.example;

import java.util.ArrayList;

public class Auto {
    private int id;
    private int createdYear;
    private String name;
    private int price;
    private String color;


    public Auto(int id, String createdYear, String name, int price, String color) {
        this.id = id;
        this.createdYear = getCreatedYear();
        this.name = name;
        this.price = price;
        this.color = color;
    }


    public Auto() {
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCreatedYear() {
        return createdYear;
    }

    public void setCreatedYear(int createdYear) {
        this.createdYear = createdYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "id=" + id +
                ", createdYear='" + createdYear + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
