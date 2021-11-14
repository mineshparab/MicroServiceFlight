package com.minesh.flightschedule.services;

import java.util.List;

import com.minesh.flightschedule.models.Flight;

public interface FlightScheduleServices {
	
	public List<Flight> getFlights(String from, String to);
	public List<Flight> getAllFlights();
}
