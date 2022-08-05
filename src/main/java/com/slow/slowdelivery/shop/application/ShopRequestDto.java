package com.slow.slowdelivery.shop.application;

import com.slow.slowdelivery.shop.domain.BasicInfo;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ShopRequestDto {

    private BasicInfo basicInfo;

    public ShopRequestDto(String name, String description) {
        this.basicInfo = new BasicInfo(name, description);
    }
}
