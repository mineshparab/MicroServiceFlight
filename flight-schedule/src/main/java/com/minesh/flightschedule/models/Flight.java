package com.minesh.flightschedule.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String flightCode;
	private String flightFrom;
	private String flightTo;
	
	
	
	
	public Flight(Long id, String flightCode, String flightFrom, String flightTo) {
		super();
		this.id = id;
		this.flightCode = flightCode;
		this.flightFrom = flightFrom;
		this.flightTo = flightTo;
	}


	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFlightCode() {
		return flightCode;
	}
	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public String getFlightFrom() {
		return flightFrom;
	}

	public void setFlightFrom(String flightFrom) {
		this.flightFrom = flightFrom;
	}

	public String getFlightTo() {
		return flightTo;
	}

	public void setFlightTo(String flightTo) {
		this.flightTo = flightTo;
	}

}
