package com.worldsoft.ptrentitiesRequest;

public class OriginDestination {
	public String originLocationCode;
	public String destinationLocationCode;
	public String cabinPreference;
	public String departureDateTime;
	public int flightNumber;
	public String airlineCode;

	public String getOriginLocationCode() {
		return originLocationCode;
	}

	public void setOriginLocationCode(String originLocationCode) {
		this.originLocationCode = originLocationCode;
	}

	public String getDestinationLocationCode() {
		return destinationLocationCode;
	}

	public void setDestinationLocationCode(String destinationLocationCode) {
		this.destinationLocationCode = destinationLocationCode;
	}

	public String getCabinPreference() {
		return cabinPreference;
	}

	public void setCabinPreference(String cabinPreference) {
		this.cabinPreference = cabinPreference;
	}

	public String getDepartureDateTime() {
		return departureDateTime;
	}

	public void setDepartureDateTime(String departureDateTime) {
		this.departureDateTime = departureDateTime;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirlineCode() {
		return airlineCode;
	}

	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	public OriginDestination(String originLocationCode, String destinationLocationCode, String cabinPreference,
			String departureDateTime, int flightNumber, String airlineCode) {
		super();
		this.originLocationCode = originLocationCode;
		this.destinationLocationCode = destinationLocationCode;
		this.cabinPreference = cabinPreference;
		this.departureDateTime = departureDateTime;
		this.flightNumber = flightNumber;
		this.airlineCode = airlineCode;
	}

	public OriginDestination() {
		super();
	}

}
