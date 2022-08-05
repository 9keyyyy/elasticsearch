package com.slow.slowdelivery.shop.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BasicInfo {
    @Column(nullable = false, unique = true)
    private String name;
    private String description;

    public BasicInfo(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
