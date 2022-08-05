package com.slow.slowdelivery.shop.application;

import com.slow.slowdelivery.shop.domain.BasicInfo;
import com.slow.slowdelivery.shop.domain.Shop;
import com.slow.slowdelivery.shop.domain.ShopDocument;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ShopResponseDto {
    private Long id;
    private String name;
    private String description;

    public static ShopResponseDto from(ShopDocument shop) {
        return new ShopResponseDto(shop.getId(), shop.getBasicInfo().getName(), shop.getBasicInfo().getDescription());
    }
}
