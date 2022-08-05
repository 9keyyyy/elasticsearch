package com.slow.slowdelivery.shop.presentation;

import com.slow.slowdelivery.shop.application.ShopResponseDto;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ShopResponse {

    private Long id;
    private String name;
    private String description;

    public ShopResponse(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public static ShopResponse from(ShopResponseDto shopResponseDto) {
        return new ShopResponse(
                shopResponseDto.getId(),
                shopResponseDto.getBasicInfo().getName(),
                shopResponseDto.getBasicInfo().getDescription()
        );
    }
}
