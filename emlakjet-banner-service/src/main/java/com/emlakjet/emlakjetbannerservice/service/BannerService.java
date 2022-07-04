package com.emlakjet.emlakjetbannerservice.service;

import com.emlakjet.emlakjetbannerservice.dto.BannerDTO;

import java.util.List;

public interface BannerService {
    List<BannerDTO> getAll();
    BannerDTO getBannerById(Long id) throws Exception;
    BannerDTO addBanner(BannerDTO bannerRequest);
    BannerDTO updateBanner(BannerDTO bannerRequest) throws Exception;
    void deleteById(Long id) throws Exception;
}
