package com.example.my_recycleview;

public class Pictures {
    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }
    public String getLatter(){return  latter;}

    String name;
    String latter;
    int image;

    public Pictures(String name, int image,String latter) {
        this.name = name;
        this.image = image;
        this.latter = latter;
    }
}
