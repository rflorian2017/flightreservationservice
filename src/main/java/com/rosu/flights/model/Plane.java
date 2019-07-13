package com.rosu.flights.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Plane {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PLANE_ID")
	private long id;
	
	@Column(name = "AIRCRAFT_MODEL")
	private String aircraftModel;
	
	private int seatNo;
}
