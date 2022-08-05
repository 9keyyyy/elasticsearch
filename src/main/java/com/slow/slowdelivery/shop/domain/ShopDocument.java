package com.slow.slowdelivery.shop.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.Embedded;
import javax.persistence.Id;

@Getter
@Document(indexName = "shops")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ShopDocument {
    @Id
    private Long id;

    @Embedded
    private BasicInfo basicInfo;

    @Builder
    public ShopDocument(Long id, BasicInfo basicInfo){
        this.id = id;
        this.basicInfo = basicInfo;
    }
}
