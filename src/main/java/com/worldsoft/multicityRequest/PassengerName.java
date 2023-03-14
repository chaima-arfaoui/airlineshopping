package com.worldsoft.multicityRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PassengerName {
	@JsonProperty("PassengerTitle")
	private String passengerTitle;
	@JsonProperty("PassengerFirstName")
	private String passengerFirstName;
	@JsonProperty("PassengerLastName")
	private String passengerLastName;

	public String getPassengerTitle() {
		return passengerTitle;
	}

	public void setPassengerTitle(String passengerTitle) {
		this.passengerTitle = passengerTitle;
	}

	public String getPassengerFirstName() {
		return passengerFirstName;
	}

	public void setPassengerFirstName(String passengerFirstName) {
		this.passengerFirstName = passengerFirstName;
	}

	public String getPassengerLastName() {
		return passengerLastName;
	}

	public void setPassengerLastName(String passengerLastName) {
		this.passengerLastName = passengerLastName;
	}

	public PassengerName(String passengerTitle, String passengerFirstName, String passengerLastName) {
		super();
		this.passengerTitle = passengerTitle;
		this.passengerFirstName = passengerFirstName;
		this.passengerLastName = passengerLastName;
	}

	public PassengerName() {
		super();
	}

}
