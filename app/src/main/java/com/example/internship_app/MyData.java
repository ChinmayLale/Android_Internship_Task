package com.example.internship_app;

public class MyData {
    private String name;
    private String location;
    private String price;
    private String description;
    private String imageUrl;

    public MyData(String name, String location, String price, String description, String imageUrl) {
        this.name = name;
        this.location = location;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    // Add getter methods for each field
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
