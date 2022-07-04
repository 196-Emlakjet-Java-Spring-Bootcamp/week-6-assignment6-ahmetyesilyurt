package com.emlakjet.emlakjetbannerservice.dao;


import com.emlakjet.emlakjetbannerservice.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
