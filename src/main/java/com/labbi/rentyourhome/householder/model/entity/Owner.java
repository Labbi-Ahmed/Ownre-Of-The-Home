package com.labbi.rentyourhome.householder.model.entity;

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
@Entity(name="houseowner")
public class Owner {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	private String name;
	
	private String email;
	
	private String phone;
	
	private String password;
	
	private String virtualAccountName;
	
	private String virtualContactNumber;
	
	
}
