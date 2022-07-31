package com.slow.slowdelivery.shop.domain;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.*;

@Document(indexName = "shops")
@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private BasicInfo basicInfo;

    protected Shop() {
    }

    public Shop(String name, String description) {
        this(null, new BasicInfo(name, description));
    }

    @PersistenceConstructor
    public Shop(Long id, BasicInfo basicInfo) {
        this.id = id;
        this.basicInfo = basicInfo;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return basicInfo.getName();
    }

    public String getDescription() {
        return basicInfo.getDescription();
    }

}
