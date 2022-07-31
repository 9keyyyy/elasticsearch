package com.slow.slowdelivery.shop.domain.search;

import com.slow.slowdelivery.shop.domain.Shop;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.Criteria;
import org.springframework.data.elasticsearch.core.query.CriteriaQuery;
import org.springframework.data.elasticsearch.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Repository
public class CustomShopSearchRepositoryImpl implements CustomShopSearchRepository{

    private final ElasticsearchOperations elasticsearchOperations;

    @Override
    public List<Shop> searchByName(String name, Pageable pageable) {
        Criteria criteria = Criteria.where("basicInfo.name").contains(name);
        Query query = new CriteriaQuery(criteria).setPageable(pageable);
        SearchHits<Shop> search = elasticsearchOperations.search(query, Shop.class);
        return search.stream()
                .map(SearchHit::getContent)
                .collect(Collectors.toList());
    }
}
