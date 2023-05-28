package com.labbi.rentyourhome.floor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labbi.rentyourhome.floor.model.entity.Floor;

public interface FloorRepository extends JpaRepository<Floor, String>{

}
