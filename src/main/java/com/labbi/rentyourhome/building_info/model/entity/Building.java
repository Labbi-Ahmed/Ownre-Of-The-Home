package com.labbi.rentyourhome.building_info.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name="building")
public class Building {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	private String name;
	
	private String division;
	private String district;
	private String thana;
	private String postCode;
	private String areaName;
	private String road;
	private String houseNumber;
	private String phone;	
	private String buildingType;
	private String numberOfLevel;
	
	// location
	private float latitude;
	private float longitude;
	
	private boolean haveGarage;
	private boolean haveSecurityGard;
	
	
	
	
	
	
	
	
	
	
	
}
