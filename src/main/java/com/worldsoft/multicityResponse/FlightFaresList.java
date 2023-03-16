package com.worldsoft.multicityResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlightFaresList {
	@JsonProperty("FareType")
	public String fareType;
	@JsonProperty("Currency")
	public String currency;
	@JsonProperty("PassengerFare")
	public ArrayList<PassengerFare> passengerFare;
	@JsonProperty("FareRef")
	public int fareRef;

	public String getFareType() {
		return fareType;
	}

	public void setFareType(String fareType) {
		this.fareType = fareType;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public ArrayList<PassengerFare> getPassengerFare() {
		return passengerFare;
	}

	public void setPassengerFare(ArrayList<PassengerFare> passengerFare) {
		this.passengerFare = passengerFare;
	}

	public int getFareRef() {
		return fareRef;
	}

	public void setFareRef(int fareRef) {
		this.fareRef = fareRef;
	}

	public FlightFaresList(String fareType, String currency, ArrayList<PassengerFare> passengerFare, int fareRef) {
		super();
		this.fareType = fareType;
		this.currency = currency;
		this.passengerFare = passengerFare;
		this.fareRef = fareRef;
	}

	public FlightFaresList() {
		super();
	}

}
