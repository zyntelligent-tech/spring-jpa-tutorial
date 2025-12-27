package com.zyntelligent.demo.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zyntelligent.demo.model.Pet;
import com.zyntelligent.demo.model.PetOwner;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
	
	List<Pet> findByTypeAndOwner_NameAndBirthDateBetween(String type, String ownerNamw, LocalDate start, LocalDate end);
}
