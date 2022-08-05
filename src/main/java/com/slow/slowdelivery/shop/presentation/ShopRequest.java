package com.slow.slowdelivery.shop.presentation;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ShopRequest {
    private String name;
    private String description;

    public ShopRequest(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
