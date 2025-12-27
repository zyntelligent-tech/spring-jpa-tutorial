package com.zyntelligent.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zyntelligent.demo.model.Pet;
import com.zyntelligent.demo.service.PetService;

@RestController
@RequestMapping("/pet")
public class PetController {

	@Autowired
	PetService petService;
	
	
	@GetMapping("/")
	public ResponseEntity<List<Pet>> getAllPets() {
		List<Pet> pets = petService.getAllPets();
		return ResponseEntity.ok().body(pets);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Pet> getPetById(@PathVariable Long id) {
		return ResponseEntity.ok().build();
	}
	
	@PostMapping("/")
	public ResponseEntity<Pet> addPet(@RequestBody Pet pet) {
		Pet savedPet = petService.savePet(pet);
		return ResponseEntity.ok().body(savedPet);
	}
	
	@PutMapping("/")
	public ResponseEntity<Pet> updatePet(@RequestBody Pet pet) {
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletePet(@PathVariable Long id) {
		return ResponseEntity.ok().build();
	}
	
	
}
