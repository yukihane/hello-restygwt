package com.github.yukihane.gwt.hello_restygwt.client;

public class Pizza {

    private String name;

    private int price;

    public Pizza() {
    }

    public Pizza(final String name, final int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(final int price) {
        this.price = price;
    }

}
