package com.slow.slowdelivery.shop.application;

public class ShopRequestDto {

    private String name;
    private String description;

    private ShopRequestDto() {
    }

    public ShopRequestDto(String name, String description) {
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
