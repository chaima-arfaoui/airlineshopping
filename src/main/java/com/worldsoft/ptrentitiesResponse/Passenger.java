package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Passenger {
	@JsonProperty("ETicket")
	private String eTicket;
	@JsonProperty("PassengerType")
	private String passengerType;
	@JsonProperty("Tittle")
	private String tittle;
	@JsonProperty("FirstName")
	private String firstName;
	@JsonProperty("LastName")
	private String lastName;

	public String geteTicket() {
		return eTicket;
	}

	public void seteTicket(String eTicket) {
		this.eTicket = eTicket;
	}

	public String getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Passenger(String eTicket, String passengerType, String tittle, String firstName, String lastName) {
		super();
		this.eTicket = eTicket;
		this.passengerType = passengerType;
		this.tittle = tittle;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Passenger() {
		super();
	}

}
