package com.slow.slowdelivery.shop.application;

import com.slow.slowdelivery.shop.domain.BasicInfo;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ShopRequestDto {
    private String name;
    private String description;

    public BasicInfo getBasicInfo(){
        return new BasicInfo(name, description);
    }
}
