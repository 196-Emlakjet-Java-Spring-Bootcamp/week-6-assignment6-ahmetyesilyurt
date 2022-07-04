package com.emlakjet.emlakjetbannerservice.dao;


import com.emlakjet.emlakjetbannerservice.model.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerRepository extends JpaRepository<Banner, Long> {

}
