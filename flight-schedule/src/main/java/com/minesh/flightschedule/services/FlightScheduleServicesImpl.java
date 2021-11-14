package com.minesh.flightschedule.services;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.minesh.flightschedule.dao.FlightScheduleRepository;
import com.minesh.flightschedule.models.Flight;

@Service("flightScheduledService")
public class FlightScheduleServicesImpl implements FlightScheduleServices {
	
	@Autowired
	private FlightScheduleRepository flightRepository;
	
	@Value("{ariline.disabled}")
	private String airlineDisabled;

	@Override	
	public List<Flight> getFlights( String flightFrom, String flightTo) {
		
		Flight filterParams = new Flight();
		filterParams.setFlightFrom(flightFrom);
		filterParams.setFlightTo(flightTo);
		
		Example<Flight> flightFilter = Example.of(filterParams);

		// TODO Auto-generated method stub
		List<Flight> flightList = flightRepository.findAll(flightFilter);
		
		
		return flightList;
	}

	@Override	
	public List<Flight> getAllFlights() {
		
		// TODO Auto-generated method stub
		List<Flight> flightList = flightRepository.findAll();
		
		
		return flightList;
	}
	
}
