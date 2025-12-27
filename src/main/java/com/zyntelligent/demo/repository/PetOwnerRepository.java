package com.zyntelligent.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zyntelligent.demo.model.PetOwner;

@Repository
public interface PetOwnerRepository extends JpaRepository<PetOwner, Long> {

}
