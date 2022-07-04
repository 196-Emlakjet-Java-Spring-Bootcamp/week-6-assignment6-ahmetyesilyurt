package com.emlakjet.emlakjetbannerservice.mapper;




import com.emlakjet.emlakjetbannerservice.dto.BannerDTO;
import com.emlakjet.emlakjetbannerservice.model.Banner;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring" , uses = {AddressMapper.class})
public interface BannerMapper extends BaseMapper<Banner, BannerDTO>{
}
