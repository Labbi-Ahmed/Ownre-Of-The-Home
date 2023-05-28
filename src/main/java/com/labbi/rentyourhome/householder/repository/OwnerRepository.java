package com.labbi.rentyourhome.householder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labbi.rentyourhome.householder.model.entity.Owner;

public interface OwnerRepository extends JpaRepository<Owner, String> {
	Owner findByEmail(String email);
	Owner findByPhone(String phone);
	
}
