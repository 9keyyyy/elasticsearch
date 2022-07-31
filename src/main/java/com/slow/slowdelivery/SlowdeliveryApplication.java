package com.slow.slowdelivery;

import com.slow.slowdelivery.shop.domain.search.ShopSearchRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// JPA 관련 Repository 클래스만 스캐닝하도록 -> OCP 위반이므로 entity/document 나눠야 .Todo
@EnableJpaRepositories(excludeFilters = @ComponentScan.Filter(
        type = FilterType.ASSIGNABLE_TYPE,
        classes = ShopSearchRepository.class))
@SpringBootApplication
public class SlowdeliveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SlowdeliveryApplication.class, args);
    }

}
