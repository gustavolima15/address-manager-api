package com.addressmanager.repository;

import com.addressmanager.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
    

}
