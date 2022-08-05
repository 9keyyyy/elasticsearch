package com.slow.slowdelivery.shop.application;

import com.slow.slowdelivery.shop.domain.BasicInfo;
import com.slow.slowdelivery.shop.domain.Shop;
import com.slow.slowdelivery.shop.domain.ShopDocument;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ShopResponseDto {

    private Long id;
    private BasicInfo basicInfo;

    public ShopResponseDto(Long id, BasicInfo basicInfo) {
        this.id = id;
        this.basicInfo = basicInfo;
    }

    public static ShopResponseDto from(ShopDocument shop) {
        return new ShopResponseDto(shop.getId(), shop.getBasicInfo());
    }
}
