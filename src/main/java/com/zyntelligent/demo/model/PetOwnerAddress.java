package com.zyntelligent.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class PetOwnerAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String houseNumber;
	String street;
	String tambon;
	String amphur;
	String province;
	String postCode;
	
	@ManyToOne(cascade = CascadeType.ALL)
	PetOwner owner;
}
