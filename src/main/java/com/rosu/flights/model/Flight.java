package com.rosu.flights.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FLIGHT")
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FLIGHT_ID")
	private long id;
	
	@Column(name = "DEPARTURE")
	private String departure;
	
	@Column(name = "DESTINATION")
	private String destination;
	
	@Column(name = "DATE")
	private Date date;
	
	@Column(name = "HOUR")
	private String hour;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getHour() {
		return hour;
	}

	public void setHour(String hour) {
		this.hour = hour;
	}
	
	
}
