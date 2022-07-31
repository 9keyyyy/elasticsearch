package com.slow.slowdelivery.shop.application;

import com.slow.slowdelivery.shop.domain.Shop;

public class ShopResponseDto {

    private Long id;
    private String name;
    private String description;

    private ShopResponseDto() {
    }

    public ShopResponseDto(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public static ShopResponseDto from(Shop shop) {
        return new ShopResponseDto(shop.getId(), shop.getName(), shop.getDescription());
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
