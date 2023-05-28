package com.labbi.rentyourhome.building_info.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labbi.rentyourhome.building_info.model.entity.Building;

public interface BuildingRepository extends JpaRepository<Building, String> {
	
}
