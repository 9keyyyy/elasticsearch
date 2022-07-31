package com.slow.slowdelivery.shop.presentation;

import com.slow.slowdelivery.shop.application.ShopRequestDto;
import com.slow.slowdelivery.shop.application.ShopService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class ShopController {
    private final ShopService shopService;

    @PostMapping("/shops")
    public ResponseEntity<Void> save(@RequestBody ShopRequest shopRequest) {
        ShopRequestDto shopRequestDto = new ShopRequestDto(
                shopRequest.getName(),
                shopRequest.getDescription()
        );
        Long id = shopService.save(shopRequestDto);
        URI uri = URI.create(String.valueOf(id));
        return ResponseEntity.created(uri)
                .build();
    }

    @GetMapping("/shops/{name}")
    public ResponseEntity<List<ShopResponse>> search(@PathVariable String name, Pageable pageable) {
        List<ShopResponse> shopResponses = shopService.searchByName(name, pageable)
                .stream()
                .map(ShopResponse::from)
                .collect(Collectors.toList());
        return ResponseEntity.ok(shopResponses);
    }
}
