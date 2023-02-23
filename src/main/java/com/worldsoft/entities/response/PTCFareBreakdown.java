package com.worldsoft.entities.response;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.worldsoft.entitiesRequest.PassengerTypeQuantity;

public class PTCFareBreakdown {
	@JsonProperty("BaggageInfo") 
    private ArrayList<String> baggageInfo;
    @JsonProperty("CabinBaggageInfo") 
    private ArrayList<String> cabinBaggageInfo;
    @JsonProperty("FareBasisCodes") 
    private ArrayList<String> fareBasisCodes;
    @JsonProperty("PassengerFare") 
    private PassengerFare passengerFare;
    @JsonProperty("PassengerTypeQuantity") 
    private PassengerTypeQuantity passengerTypeQuantity;
    @JsonProperty("PenaltiesInfo") 
    private ArrayList<PenaltiesInfo> penaltiesInfo;
	public ArrayList<String> getBaggageInfo() {
		return baggageInfo;
	}
	public void setBaggageInfo(ArrayList<String> baggageInfo) {
		this.baggageInfo = baggageInfo;
	}
	public ArrayList<String> getCabinBaggageInfo() {
		return cabinBaggageInfo;
	}
	public void setCabinBaggageInfo(ArrayList<String> cabinBaggageInfo) {
		this.cabinBaggageInfo = cabinBaggageInfo;
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
	public PassengerTypeQuantity getPassengerTypeQuantity() {
		return passengerTypeQuantity;
	}
	public void setPassengerTypeQuantity(PassengerTypeQuantity passengerTypeQuantity) {
		this.passengerTypeQuantity = passengerTypeQuantity;
	}
	public ArrayList<PenaltiesInfo> getPenaltiesInfo() {
		return penaltiesInfo;
	}
	public void setPenaltiesInfo(ArrayList<PenaltiesInfo> penaltiesInfo) {
		this.penaltiesInfo = penaltiesInfo;
	}
	public PTCFareBreakdown(ArrayList<String> baggageInfo, ArrayList<String> cabinBaggageInfo,
			ArrayList<String> fareBasisCodes, PassengerFare passengerFare, PassengerTypeQuantity passengerTypeQuantity,
			ArrayList<PenaltiesInfo> penaltiesInfo) {
		super();
		this.baggageInfo = baggageInfo;
		this.cabinBaggageInfo = cabinBaggageInfo;
		this.fareBasisCodes = fareBasisCodes;
		this.passengerFare = passengerFare;
		this.passengerTypeQuantity = passengerTypeQuantity;
		this.penaltiesInfo = penaltiesInfo;
	}
	public PTCFareBreakdown() {
		super();
	}
    
}


