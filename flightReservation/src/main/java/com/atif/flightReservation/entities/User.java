package com.atif.flightReservation.entities;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User extends AbstractEntity {

	private String firstName;
	private String lastName;
	private String email;
	private String password;

}
