package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaxName {
	@JsonProperty("PassengerTitle")
	public String passengerTitle;
	@JsonProperty("PassengerFirstName")
	public String passengerFirstName;
	@JsonProperty("PassengerLastName")
	public String passengerLastName;

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

	public PaxName(String passengerTitle, String passengerFirstName, String passengerLastName) {
		super();
		this.passengerTitle = passengerTitle;
		this.passengerFirstName = passengerFirstName;
		this.passengerLastName = passengerLastName;
	}

	public PaxName() {
		super();
	}

}
