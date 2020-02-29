package com.example.sari.model;

import java.io.Serializable;

public class Product {
    private String aisle_number;
    private String brand;
    private String image;
    private Double price;
    private String type;

    public Product() {

    }
    public Product(String aisle_number, String brand, String image, Double price, String type) {
        this.aisle_number = aisle_number;
        this.brand = brand;
        this.image = image;
        this.price = price;
        this.type = type;
    }


    public String getAisle_number() { return aisle_number; }

    public void setAisle_number(String aisle_number) { this.aisle_number = aisle_number;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


}
