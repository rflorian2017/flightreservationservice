package com.rosu.flights.repository;

import org.springframework.data.repository.CrudRepository;

import com.rosu.flights.model.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Long>{
	
}
