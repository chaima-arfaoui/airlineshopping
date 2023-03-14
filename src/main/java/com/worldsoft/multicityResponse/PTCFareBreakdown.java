package com.worldsoft.multicityResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PTCFareBreakdown {
	@JsonProperty("PassengerTypeQuantity")
	private PassengerTypeQuantity passengerTypeQuantity;
	@JsonProperty("FareBasisCodes")
	private ArrayList<String> fareBasisCodes;
	@JsonProperty("PassengerFare")
	private PassengerFare passengerFare;
	@JsonProperty("PenaltiesInfo")
	private ArrayList<PenaltiesInfo> penaltiesInfo;
	@JsonProperty("BaggageInfo")
	private ArrayList<String> baggageInfo;
	@JsonProperty("CabinBaggageInfo")
	private Object cabinBaggageInfo;

	public PassengerTypeQuantity getPassengerTypeQuantity() {
		return passengerTypeQuantity;
	}

	public void setPassengerTypeQuantity(PassengerTypeQuantity passengerTypeQuantity) {
		this.passengerTypeQuantity = passengerTypeQuantity;
	}

	public ArrayList<String> getFareBasisCodes() {
		return fareBasisCodes;
	}

	public void setFareBasisCodes(ArrayList<String> fareBasisCodes) {
		this.fareBasisCodes = fareBasisCodes;
	}

	public PassengerFare getPassengerFare() {
		return passengerFare;
	}

	public void setPassengerFare(PassengerFare passengerFare) {
		this.passengerFare = passengerFare;
	}

	public ArrayList<PenaltiesInfo> getPenaltiesInfo() {
		return penaltiesInfo;
	}

	public void setPenaltiesInfo(ArrayList<PenaltiesInfo> penaltiesInfo) {
		this.penaltiesInfo = penaltiesInfo;
	}

	public ArrayList<String> getBaggageInfo() {
		return baggageInfo;
	}

	public void setBaggageInfo(ArrayList<String> baggageInfo) {
		this.baggageInfo = baggageInfo;
	}

	public Object getCabinBaggageInfo() {
		return cabinBaggageInfo;
	}

	public void setCabinBaggageInfo(Object cabinBaggageInfo) {
		this.cabinBaggageInfo = cabinBaggageInfo;
	}

	public PTCFareBreakdown(PassengerTypeQuantity passengerTypeQuantity, ArrayList<String> fareBasisCodes,
			PassengerFare passengerFare, ArrayList<PenaltiesInfo> penaltiesInfo, ArrayList<String> baggageInfo,
			Object cabinBaggageInfo) {
		super();
		this.passengerTypeQuantity = passengerTypeQuantity;
		this.fareBasisCodes = fareBasisCodes;
		this.passengerFare = passengerFare;
		this.penaltiesInfo = penaltiesInfo;
		this.baggageInfo = baggageInfo;
		this.cabinBaggageInfo = cabinBaggageInfo;
	}

	public PTCFareBreakdown() {
		super();
	}

}
