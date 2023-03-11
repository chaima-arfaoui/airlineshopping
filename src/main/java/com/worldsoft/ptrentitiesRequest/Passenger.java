package com.worldsoft.ptrentitiesRequest;

public class Passenger {
	private String firstName;
	private String lastName;
	private String title;
	private String eTicket;
	private String passengerType;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

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

	public Passenger(String firstName, String lastName, String title, String eTicket, String passengerType) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.eTicket = eTicket;
		this.passengerType = passengerType;
	}

	public Passenger() {
		super();
	}

}
