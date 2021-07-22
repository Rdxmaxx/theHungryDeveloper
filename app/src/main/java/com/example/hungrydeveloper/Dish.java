package com.example.hungrydeveloper;

import androidx.annotation.NonNull;

public class Dish {
    String title;
    String description;
    int price;

    Dish(String title, String description, int price) {
        this.title = title;
        this.description = description;
        this.price = price;
    }

    @Override
    @NonNull
    public String toString() {
        return title;
    }
}
