package com.rosu.flights.repository;

import org.springframework.data.repository.CrudRepository;

import com.rosu.flights.model.Plane;

public interface PlaneRepository extends CrudRepository<Plane, Long>{

}
