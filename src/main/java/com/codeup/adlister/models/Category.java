package com.codeup.adlister.models;

public class Category {
    private long id;

    private String category_name;

    public Category() {
    }

    public Category(long id, String category_name) {
        this.id = id;
        this.category_name = category_name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}
