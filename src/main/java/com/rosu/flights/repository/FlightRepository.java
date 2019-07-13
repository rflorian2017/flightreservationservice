package com.rosu.flights.repository;

import org.springframework.data.repository.CrudRepository;

import com.rosu.flights.model.Flight;

public interface FlightRepository extends CrudRepository<Flight, Long>{

}
