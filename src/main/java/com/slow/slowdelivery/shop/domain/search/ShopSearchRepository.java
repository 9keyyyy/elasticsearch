package com.slow.slowdelivery.shop.domain.search;

import com.slow.slowdelivery.shop.domain.Shop;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ShopSearchRepository extends ElasticsearchRepository<Shop, Long>, CustomShopSearchRepository {
    List<Shop> findByBasicInfo_NameContains(String name);
}
