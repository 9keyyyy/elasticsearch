package com.slow.slowdelivery.shop.domain.search;

import com.slow.slowdelivery.shop.domain.Shop;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomShopSearchRepository {
    List<Shop> searchByName(String name, Pageable pageable);
}
