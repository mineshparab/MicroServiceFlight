package com.minesh.flightschedule.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minesh.flightschedule.models.Flight;
import com.minesh.flightschedule.services.FlightScheduleServices;

@RestController
@RequestMapping(value="/api/v1/flight/schedule")
public class FlightScheduleController {

	@Resource(name="flightScheduledService")
	private FlightScheduleServices flightScheduledService;
	
	@GetMapping(value="/from/{from}/to/{to}")
	public List<Flight> getFlights(@PathVariable String from, @PathVariable String to) {
		//List<Flight> flightList = new ArrayList<Flight>();
		List<Flight> flightList = flightScheduledService.getFlights(from, to);
		/*Flight flight1 = new Flight(1L,"IN");
		#Flight flight2 = new Flight(2L,"US");
		flightList.add(flight1);
		flightList.add(flight2);
		*/
		return flightList;
	}
	
	@GetMapping(value="/all")
	public List<Flight> getAllFlights() {

		List<Flight> flightList = flightScheduledService.getAllFlights();
		
		return flightList;
	}
	
}
