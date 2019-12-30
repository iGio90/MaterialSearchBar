package com.mancj.example.custom;

/**
 * Created by mancj on 27.01.17.
 */

public class Product {
    private String title;
    private int price;

    Product(String title, int price) {
        this.title = title;
        this.price = price;
    }

    String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
