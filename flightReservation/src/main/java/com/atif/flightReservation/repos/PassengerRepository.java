package com.atif.flightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atif.flightReservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
