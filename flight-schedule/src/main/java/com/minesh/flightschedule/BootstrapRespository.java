package com.minesh.flightschedule;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.minesh.flightschedule.dao.FlightScheduleRepository;
import com.minesh.flightschedule.models.Flight;


/*
 * This class has been added to add temporary data when we start the application.
 */

@Component
public class BootstrapRespository implements CommandLineRunner{

	
	private final FlightScheduleRepository flightScheduleRepository;
	
	
	
	public BootstrapRespository(FlightScheduleRepository flightScheduleRepository) {
		super();
		this.flightScheduleRepository = flightScheduleRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Flight flight1 = new Flight(1L, "AI-500","DEL","BOM");
		Flight flight2 = new Flight(2L, "AI-100","CHE","BOM");
		Flight flight3 = new Flight(3L, "AI-200","BNA","BOM");
		Flight flight4 = new Flight(4L, "AI-300","FLO","BOM");
		
		flightScheduleRepository.save(flight1);
		flightScheduleRepository.save(flight2);
		flightScheduleRepository.save(flight3);
		flightScheduleRepository.save(flight4);
	}

	
	
}
