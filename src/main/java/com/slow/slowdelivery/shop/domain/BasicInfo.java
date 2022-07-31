package com.slow.slowdelivery.shop.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BasicInfo {
    @Column(nullable = false, unique = true)
    private String name;
    private String description;

    protected BasicInfo() {
    }

    public BasicInfo(String name, String description) {
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
