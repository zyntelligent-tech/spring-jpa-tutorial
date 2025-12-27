package com.zyntelligent.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zyntelligent.demo.model.Pet;

@RestController
@RequestMapping("/")
public class DemoController {
	
	@GetMapping
	public String home() {
		return "Hello, Mahasarakham!";
	}
	
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "Hello! " + name;
	}
	
	@PostMapping("/insertPet")
	public String insertPet(@RequestBody Pet pet) {
		
		System.out.println("pet id: " + pet.getId());
		System.out.println("pet name: " + pet.getName());
		System.out.println("pet type: " + pet.getType());
		System.out.println("pet birth date: " + pet.getBirthDate());
		System.out.println("pet owner name: " + pet.getOwner().getName());
		
		
		return "OK!";
	}

}
