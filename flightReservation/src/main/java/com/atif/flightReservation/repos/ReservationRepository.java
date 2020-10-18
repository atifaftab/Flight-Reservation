package com.atif.flightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atif.flightReservation.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
