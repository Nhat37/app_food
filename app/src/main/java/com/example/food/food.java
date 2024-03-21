package com.example.food;

public class food {
    private int resourceImage;
    private String name;
    private String price;

    public food(int resourceImage, String name, String price) {
        this.resourceImage = resourceImage;
        this.name = name;
        this.price = price;
    }

    public int getResourceImage() {
        return resourceImage;
    }

    public void setResourceImage(int resourceImage) {
        this.resourceImage = resourceImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
