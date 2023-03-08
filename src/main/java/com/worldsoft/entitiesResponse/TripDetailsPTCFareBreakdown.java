package com.worldsoft.entitiesResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TripDetailsPTCFareBreakdown {
	    @JsonProperty("PassengerTypeQuantity") 
	    private PassengerTypeQuantity passengerTypeQuantity;
	    @JsonProperty("TripDetailsPassengerFare") 
	    private TripDetailsPassengerFare tripDetailsPassengerFare;
	    @JsonProperty("BaggageInfo") 
	    private ArrayList<String> baggageInfo;
	    @JsonProperty("CabinBaggageInfo") 
	    private ArrayList<String> cabinBaggageInfo;
	    @JsonProperty("IsPenaltyDetailsAvailable") 
	    private boolean isPenaltyDetailsAvailable;
	    @JsonProperty("AirVoidCharges") 
	    private AirVoidCharges airVoidCharges;
		public PassengerTypeQuantity getPassengerTypeQuantity() {
			return passengerTypeQuantity;
		}
		public void setPassengerTypeQuantity(PassengerTypeQuantity passengerTypeQuantity) {
			this.passengerTypeQuantity = passengerTypeQuantity;
		}
		public TripDetailsPassengerFare getTripDetailsPassengerFare() {
			return tripDetailsPassengerFare;
		}
		public void setTripDetailsPassengerFare(TripDetailsPassengerFare tripDetailsPassengerFare) {
			this.tripDetailsPassengerFare = tripDetailsPassengerFare;
		}
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
		public boolean isPenaltyDetailsAvailable() {
			return isPenaltyDetailsAvailable;
		}
		public void setPenaltyDetailsAvailable(boolean isPenaltyDetailsAvailable) {
			this.isPenaltyDetailsAvailable = isPenaltyDetailsAvailable;
		}
		public AirVoidCharges getAirVoidCharges() {
			return airVoidCharges;
		}
		public void setAirVoidCharges(AirVoidCharges airVoidCharges) {
			this.airVoidCharges = airVoidCharges;
		}
		public TripDetailsPTCFareBreakdown(PassengerTypeQuantity passengerTypeQuantity,
				TripDetailsPassengerFare tripDetailsPassengerFare, ArrayList<String> baggageInfo,
				ArrayList<String> cabinBaggageInfo, boolean isPenaltyDetailsAvailable, AirVoidCharges airVoidCharges) {
			super();
			this.passengerTypeQuantity = passengerTypeQuantity;
			this.tripDetailsPassengerFare = tripDetailsPassengerFare;
			this.baggageInfo = baggageInfo;
			this.cabinBaggageInfo = cabinBaggageInfo;
			this.isPenaltyDetailsAvailable = isPenaltyDetailsAvailable;
			this.airVoidCharges = airVoidCharges;
		}
		public TripDetailsPTCFareBreakdown() {
			super();
		}
	    

}
