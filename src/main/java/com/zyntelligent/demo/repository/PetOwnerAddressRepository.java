package com.zyntelligent.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zyntelligent.demo.model.PetOwnerAddress;

@Repository
public interface PetOwnerAddressRepository extends JpaRepository<PetOwnerAddress, Long>{

}
