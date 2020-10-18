package com.atif.flightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atif.flightReservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
