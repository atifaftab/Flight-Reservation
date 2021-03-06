package com.atif.flightReservation.entities;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Reservation extends AbstractEntity {

	private Boolean checkedIn;
	private int numberOfBags;

	@OneToOne	
	private Passenger passengerId;

	@OneToOne
	private Flight flightId;

}
