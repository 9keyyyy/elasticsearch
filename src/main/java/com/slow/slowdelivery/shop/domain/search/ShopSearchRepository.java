package com.slow.slowdelivery.shop.domain.search;

import com.slow.slowdelivery.shop.domain.Shop;
import com.slow.slowdelivery.shop.domain.ShopDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ShopSearchRepository extends ElasticsearchRepository<ShopDocument, Long>, CustomShopSearchRepository {
    List<ShopDocument> findByBasicInfo_NameContains(String name);
}
