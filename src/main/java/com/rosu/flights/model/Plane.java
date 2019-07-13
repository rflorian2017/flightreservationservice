package com.rosu.flights.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PLANE")
public class Plane {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PLANE_ID")
	private long id;
	
	@Column(name = "AIRCRAFT_MODEL")
	private String aircraftModel;
	
	@Column(name = "SEAT_NO")
	private int seatNo;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAircraftModel() {
		return aircraftModel;
	}

	public void setAircraftModel(String aircraftModel) {
		this.aircraftModel = aircraftModel;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	
	
}
