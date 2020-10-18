package com.atif.flightReservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atif.flightReservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
