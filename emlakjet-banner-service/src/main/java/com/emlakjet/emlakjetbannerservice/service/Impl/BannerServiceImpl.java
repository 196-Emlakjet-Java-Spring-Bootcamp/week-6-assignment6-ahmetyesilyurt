package com.emlakjet.emlakjetbannerservice.service.Impl;

import com.emlakjet.emlakjetbannerservice.dao.BannerRepository;
import com.emlakjet.emlakjetbannerservice.dto.BannerDTO;
import com.emlakjet.emlakjetbannerservice.mapper.BannerMapper;
import com.emlakjet.emlakjetbannerservice.model.Banner;
import com.emlakjet.emlakjetbannerservice.service.BannerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BannerServiceImpl implements BannerService {
    private final BannerRepository bannerRepository;
    private final BannerMapper bannerMapper;


    @Override
    public List<BannerDTO> getAll() {
        return bannerMapper.toDTOList(bannerRepository.findAll());
    }
    @Transactional
    @Override
    public BannerDTO getBannerById(Long id) throws Exception {
        return bannerMapper.toDTO(bannerRepository.findById(id).orElseThrow(() -> new Exception("Banner not found")));
    }
    @Transactional
    @Override
    public BannerDTO addBanner(BannerDTO bannerDTO) {
        return bannerMapper.toDTO(bannerRepository.save(bannerMapper.toEntity(bannerDTO)));
    }

    @Override
    public BannerDTO updateBanner(BannerDTO bannerDTO) throws Exception {

        getBannerById(bannerDTO.getId());
        return bannerMapper.toDTO(bannerRepository.save(bannerMapper.toEntity(bannerDTO)));
    }

    @Override
    public void deleteById(Long id) throws Exception {
        bannerMapper.toDTO(bannerRepository.findById(id).orElseThrow(() -> new Exception("Banner not found")));
        bannerRepository.deleteById(id);
    }
}
