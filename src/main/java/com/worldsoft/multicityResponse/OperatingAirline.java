package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OperatingAirline {
	@JsonProperty("Code")
	private String code;
	@JsonProperty("FlightNumber")
	private String flightNumber;
	@JsonProperty("Equipment")
	private String equipment;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public OperatingAirline(String code, String flightNumber, String equipment) {
		super();
		this.code = code;
		this.flightNumber = flightNumber;
		this.equipment = equipment;
	}

	public OperatingAirline() {
		super();
	}

}
