package com.slow.slowdelivery.shop.presentation;

import com.slow.slowdelivery.shop.application.ShopResponseDto;

public class ShopResponse {

    private Long id;
    private String name;
    private String description;

    private ShopResponse() {
    }

    public ShopResponse(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public static ShopResponse from(ShopResponseDto shopResponseDto) {
        return new ShopResponse(
                shopResponseDto.getId(),
                shopResponseDto.getName(),
                shopResponseDto.getDescription()
        );
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
