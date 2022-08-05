package com.slow.slowdelivery.shop.application;

import com.slow.slowdelivery.shop.domain.Shop;
import com.slow.slowdelivery.shop.domain.ShopDocument;
import com.slow.slowdelivery.shop.domain.ShopRepository;
import com.slow.slowdelivery.shop.domain.search.ShopSearchRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ShopService {

    private final ShopRepository shopRepository;
    private final ShopSearchRepository shopSearchRepository;

    @Transactional
    public Long save(ShopRequestDto shopRequestDto) {
        Shop shop = new Shop(shopRequestDto.getBasicInfo());
        Shop savedShop = shopRepository.save(shop);
        ShopDocument savedShopDocument = ShopDocument.builder()
                .id(savedShop.getId())
                .basicInfo(savedShop.getBasicInfo())
                .build();
        shopSearchRepository.save(savedShopDocument);
        return savedShop.getId();
    }

    public List<ShopResponseDto> searchByName(String name, Pageable pageable) {
        // shopSearchRepository.findByBasicProfile_NameContains(name)
        return shopSearchRepository.searchByName(name, pageable)
                .stream()
                .map(ShopResponseDto::from)
                .collect(Collectors.toList());
    }
}



