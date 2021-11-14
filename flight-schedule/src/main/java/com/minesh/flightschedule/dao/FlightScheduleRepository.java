package com.minesh.flightschedule.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minesh.flightschedule.models.Flight;

public interface FlightScheduleRepository extends JpaRepository<Flight, Long> {


}
