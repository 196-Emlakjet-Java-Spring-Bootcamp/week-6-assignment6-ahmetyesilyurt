package com.emlakjet.emlakjetbannerservice.controller;

import com.emlakjet.emlakjetbannerservice.dto.BannerDTO;
import com.emlakjet.emlakjetbannerservice.service.BannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/banners")
@RequiredArgsConstructor
public class BannerController {
    private final BannerService bannerService;

    @GetMapping
    ResponseEntity<List<BannerDTO>> getAllList() {
        return ResponseEntity.ok(bannerService.getAll());
    }

    @PostMapping
    ResponseEntity<BannerDTO> create(@RequestBody BannerDTO bannerDTO) {
        return ResponseEntity.ok(bannerService.addBanner(bannerDTO));
    }

    @GetMapping("/{id}")
    ResponseEntity<BannerDTO> getById(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(bannerService.getBannerById(id));
    }

    @PutMapping
    ResponseEntity<BannerDTO> update(@RequestBody BannerDTO bannerDTO) throws Exception {
        return ResponseEntity.ok(bannerService.updateBanner(bannerDTO));
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) throws Exception {
        bannerService.deleteById(id);
    }

}
