package com.example.myapplication.models;

public class SocialMediaModel {
    private int id;
    private int image;
    private String game;
    private String category;
    private float rating;

    public SocialMediaModel(int id, int image, String game, String category, float rating) {
        this.id = id;
        this.image = image;
        this.game = game;
        this.category = category;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
