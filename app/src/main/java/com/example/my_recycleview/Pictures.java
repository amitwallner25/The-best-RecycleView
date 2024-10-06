package com.example.my_recycleview;

public class Pictures {
    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    String name;
    int image;

    public Pictures(String name, int image) {
        this.name = name;
        this.image = image;
    }
}
