package com.rosu.flights.controller;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rosu.flights.model.Passenger;
import com.rosu.flights.model.PassengerModel;
import com.rosu.flights.repository.PassengerRepository;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

	private PassengerRepository passengerRepository;


	@Autowired
	protected PassengerController(PassengerRepository passengerRepository) {
		this.passengerRepository = passengerRepository;
	}

	@GetMapping
	public List<Passenger> getAllPassengers() {
		ArrayList<Passenger> passengers = new ArrayList<>();

		this.passengerRepository.findAll().forEach(passenger -> {
			passengers.add(passenger);
			System.out.println(passenger.getFirstName());
		});
		return passengers;

	}
	
	@GetMapping("/{id}")
	public Passenger getPassenger(@PathVariable Long id) {
		Optional<Passenger> passenger = this.passengerRepository.findById(id);
		if(passenger.isPresent()) {
			return passenger.get();
		}
		
		return null;
	}
	
	@PutMapping("/{id}")
	public Passenger updatePassenger(@PathVariable Long id, @RequestBody PassengerModel model) {
		Optional<Passenger> existingPassenger = this.passengerRepository.findById(id);
		if(existingPassenger.isPresent()) {
			Passenger passenger = model.translateModelToPassenger();
			passenger.setId(id);
			return passengerRepository.save(passenger);
		}
		
		return null;
	}
}
