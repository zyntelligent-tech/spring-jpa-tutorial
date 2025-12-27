package com.zyntelligent.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zyntelligent.demo.model.Pet;
import com.zyntelligent.demo.repository.PetRepository;

@Service
public class PetService {
	
	@Autowired
	PetRepository petRepository;
	
	public List<Pet> getAllPets() {
		return petRepository.findAll();
	}
	
	public Pet savePet(Pet pet) {
		return petRepository.save(pet);
	}
	
	public Pet getPetById(Long id) {
		return petRepository.findById(id).orElse(null);

	}
	
}
