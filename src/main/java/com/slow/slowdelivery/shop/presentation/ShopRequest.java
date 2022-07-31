package com.slow.slowdelivery.shop.presentation;

public class ShopRequest {
    private String name;
    private String description;

    private ShopRequest() {
    }

    public ShopRequest(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
