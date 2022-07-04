package com.emlakjet.emlakjetbannerservice.mapper;

import com.emlakjet.emlakjetbannerservice.dto.AddressDTO;
import com.emlakjet.emlakjetbannerservice.model.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper extends BaseMapper<Address, AddressDTO>{
}
