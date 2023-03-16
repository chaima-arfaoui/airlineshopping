package com.worldsoft.multicityResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItineraryReferenceList {
	@JsonProperty("CabinClassCode")
	public String cabinClassCode;
	@JsonProperty("CabinClassType")
	public Object cabinClassType;
	@JsonProperty("RBD")
	public String rBD;
	@JsonProperty("FareFamily")
	public String fareFamily;
	@JsonProperty("SeatsRemaining")
	public int seatsRemaining;
	@JsonProperty("CheckinBaggage")
	public ArrayList<CheckinBaggage> checkinBaggage;
	@JsonProperty("CabinBaggage")
	public ArrayList<CabinBaggage> cabinBaggage;
	@JsonProperty("FareBasisCodes")
	public ArrayList<Object> fareBasisCodes;
	@JsonProperty("ItineraryRef")
	public int itineraryRef;

	public String getCabinClassCode() {
		return cabinClassCode;
	}

	public void setCabinClassCode(String cabinClassCode) {
		this.cabinClassCode = cabinClassCode;
	}

	public Object getCabinClassType() {
		return cabinClassType;
	}

	public void setCabinClassType(Object cabinClassType) {
		this.cabinClassType = cabinClassType;
	}

	public String getrBD() {
		return rBD;
	}

	public void setrBD(String rBD) {
		this.rBD = rBD;
	}

	public String getFareFamily() {
		return fareFamily;
	}

	public void setFareFamily(String fareFamily) {
		this.fareFamily = fareFamily;
	}

	public int getSeatsRemaining() {
		return seatsRemaining;
	}

	public void setSeatsRemaining(int seatsRemaining) {
		this.seatsRemaining = seatsRemaining;
	}

	public ArrayList<CheckinBaggage> getCheckinBaggage() {
		return checkinBaggage;
	}

	public void setCheckinBaggage(ArrayList<CheckinBaggage> checkinBaggage) {
		this.checkinBaggage = checkinBaggage;
	}

	public ArrayList<CabinBaggage> getCabinBaggage() {
		return cabinBaggage;
	}

	public void setCabinBaggage(ArrayList<CabinBaggage> cabinBaggage) {
		this.cabinBaggage = cabinBaggage;
	}

	public ArrayList<Object> getFareBasisCodes() {
		return fareBasisCodes;
	}

	public void setFareBasisCodes(ArrayList<Object> fareBasisCodes) {
		this.fareBasisCodes = fareBasisCodes;
	}

	public int getItineraryRef() {
		return itineraryRef;
	}

	public void setItineraryRef(int itineraryRef) {
		this.itineraryRef = itineraryRef;
	}

	public ItineraryReferenceList(String cabinClassCode, Object cabinClassType, String rBD, String fareFamily,
			int seatsRemaining, ArrayList<CheckinBaggage> checkinBaggage, ArrayList<CabinBaggage> cabinBaggage,
			ArrayList<Object> fareBasisCodes, int itineraryRef) {
		super();
		this.cabinClassCode = cabinClassCode;
		this.cabinClassType = cabinClassType;
		this.rBD = rBD;
		this.fareFamily = fareFamily;
		this.seatsRemaining = seatsRemaining;
		this.checkinBaggage = checkinBaggage;
		this.cabinBaggage = cabinBaggage;
		this.fareBasisCodes = fareBasisCodes;
		this.itineraryRef = itineraryRef;
	}

	public ItineraryReferenceList() {
		super();
	}

}
