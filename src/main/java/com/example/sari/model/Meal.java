package com.example.sari.model;

public class Meal {
    private String ingredients;
    private String image;
    private String name;

    public Meal() {
    }

    public Meal(String ingredients, String image, String name) {
        this.ingredients = ingredients;
        this.image = image;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
