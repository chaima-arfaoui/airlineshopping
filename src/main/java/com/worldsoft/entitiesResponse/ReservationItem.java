package com.worldsoft.entitiesResponse;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReservationItem {
	 @JsonProperty("ItemRPH") 
	    private int itemRPH;
	    @JsonProperty("DepartureDateTime") 
	    private Date departureDateTime;
	    @JsonProperty("ArrivalDateTime") 
	    private Date arrivalDateTime;
	    @JsonProperty("StopQuantity") 
	    private int stopQuantity;
	    @JsonProperty("FlightNumber") 
	    private String flightNumber;
	    @JsonProperty("ResBookDesigCode") 
	    private String resBookDesigCode;
	    @JsonProperty("JourneyDuration") 
	    private String journeyDuration;
	    @JsonProperty("AirlinePNR") 
	    private String airlinePNR;
	    @JsonProperty("NumberInParty") 
	    private int numberInParty;
	    @JsonProperty("DepartureAirportLocationCode") 
	    private String departureAirportLocationCode;
	    @JsonProperty("DepartureTerminal") 
	    private String departureTerminal;
	    @JsonProperty("ArrivalAirportLocationCode") 
	    private String arrivalAirportLocationCode;
	    @JsonProperty("ArrivalTerminal") 
	    private String arrivalTerminal;
	    @JsonProperty("OperatingAirlineCode") 
	    private String operatingAirlineCode;
	    @JsonProperty("AirEquipmentType") 
	    private String airEquipmentType;
	    @JsonProperty("MarketingAirlineCode") 
	    private String marketingAirlineCode;
	    @JsonProperty("Baggage") 
	    private String baggage;
	    @JsonProperty("FlightStatus") 
	    private String flightStatus;
	    @JsonProperty("IsReturn") 
	    private boolean isReturn;
	    @JsonProperty("CabinClass") 
	    private String cabinClass;
	    @JsonProperty("CabinClassType") 
	    private String cabinClassType;
	    @JsonProperty("ATAinfoRef") 
	    private String aTAinfoRef;
	    @JsonProperty("FareFamily") 
	    private String fareFamily;
		public int getItemRPH() {
			return itemRPH;
		}
		public void setItemRPH(int itemRPH) {
			this.itemRPH = itemRPH;
		}
		public Date getDepartureDateTime() {
			return departureDateTime;
		}
		public void setDepartureDateTime(Date departureDateTime) {
			this.departureDateTime = departureDateTime;
		}
		public Date getArrivalDateTime() {
			return arrivalDateTime;
		}
		public void setArrivalDateTime(Date arrivalDateTime) {
			this.arrivalDateTime = arrivalDateTime;
		}
		public int getStopQuantity() {
			return stopQuantity;
		}
		public void setStopQuantity(int stopQuantity) {
			this.stopQuantity = stopQuantity;
		}
		public String getFlightNumber() {
			return flightNumber;
		}
		public void setFlightNumber(String flightNumber) {
			this.flightNumber = flightNumber;
		}
		public String getResBookDesigCode() {
			return resBookDesigCode;
		}
		public void setResBookDesigCode(String resBookDesigCode) {
			this.resBookDesigCode = resBookDesigCode;
		}
		public String getJourneyDuration() {
			return journeyDuration;
		}
		public void setJourneyDuration(String journeyDuration) {
			this.journeyDuration = journeyDuration;
		}
		public String getAirlinePNR() {
			return airlinePNR;
		}
		public void setAirlinePNR(String airlinePNR) {
			this.airlinePNR = airlinePNR;
		}
		public int getNumberInParty() {
			return numberInParty;
		}
		public void setNumberInParty(int numberInParty) {
			this.numberInParty = numberInParty;
		}
		public String getDepartureAirportLocationCode() {
			return departureAirportLocationCode;
		}
		public void setDepartureAirportLocationCode(String departureAirportLocationCode) {
			this.departureAirportLocationCode = departureAirportLocationCode;
		}
		public String getDepartureTerminal() {
			return departureTerminal;
		}
		public void setDepartureTerminal(String departureTerminal) {
			this.departureTerminal = departureTerminal;
		}
		public String getArrivalAirportLocationCode() {
			return arrivalAirportLocationCode;
		}
		public void setArrivalAirportLocationCode(String arrivalAirportLocationCode) {
			this.arrivalAirportLocationCode = arrivalAirportLocationCode;
		}
		public String getArrivalTerminal() {
			return arrivalTerminal;
		}
		public void setArrivalTerminal(String arrivalTerminal) {
			this.arrivalTerminal = arrivalTerminal;
		}
		public String getOperatingAirlineCode() {
			return operatingAirlineCode;
		}
		public void setOperatingAirlineCode(String operatingAirlineCode) {
			this.operatingAirlineCode = operatingAirlineCode;
		}
		public String getAirEquipmentType() {
			return airEquipmentType;
		}
		public void setAirEquipmentType(String airEquipmentType) {
			this.airEquipmentType = airEquipmentType;
		}
		public String getMarketingAirlineCode() {
			return marketingAirlineCode;
		}
		public void setMarketingAirlineCode(String marketingAirlineCode) {
			this.marketingAirlineCode = marketingAirlineCode;
		}
		public String getBaggage() {
			return baggage;
		}
		public void setBaggage(String baggage) {
			this.baggage = baggage;
		}
		public String getFlightStatus() {
			return flightStatus;
		}
		public void setFlightStatus(String flightStatus) {
			this.flightStatus = flightStatus;
		}
		public boolean isReturn() {
			return isReturn;
		}
		public void setReturn(boolean isReturn) {
			this.isReturn = isReturn;
		}
		public String getCabinClass() {
			return cabinClass;
		}
		public void setCabinClass(String cabinClass) {
			this.cabinClass = cabinClass;
		}
		public String getCabinClassType() {
			return cabinClassType;
		}
		public void setCabinClassType(String cabinClassType) {
			this.cabinClassType = cabinClassType;
		}
		public String getaTAinfoRef() {
			return aTAinfoRef;
		}
		public void setaTAinfoRef(String aTAinfoRef) {
			this.aTAinfoRef = aTAinfoRef;
		}
		public String getFareFamily() {
			return fareFamily;
		}
		public void setFareFamily(String fareFamily) {
			this.fareFamily = fareFamily;
		}
		public ReservationItem(int itemRPH, Date departureDateTime, Date arrivalDateTime, int stopQuantity,
				String flightNumber, String resBookDesigCode, String journeyDuration, String airlinePNR,
				int numberInParty, String departureAirportLocationCode, String departureTerminal,
				String arrivalAirportLocationCode, String arrivalTerminal, String operatingAirlineCode,
				String airEquipmentType, String marketingAirlineCode, String baggage, String flightStatus,
				boolean isReturn, String cabinClass, String cabinClassType, String aTAinfoRef, String fareFamily) {
			super();
			this.itemRPH = itemRPH;
			this.departureDateTime = departureDateTime;
			this.arrivalDateTime = arrivalDateTime;
			this.stopQuantity = stopQuantity;
			this.flightNumber = flightNumber;
			this.resBookDesigCode = resBookDesigCode;
			this.journeyDuration = journeyDuration;
			this.airlinePNR = airlinePNR;
			this.numberInParty = numberInParty;
			this.departureAirportLocationCode = departureAirportLocationCode;
			this.departureTerminal = departureTerminal;
			this.arrivalAirportLocationCode = arrivalAirportLocationCode;
			this.arrivalTerminal = arrivalTerminal;
			this.operatingAirlineCode = operatingAirlineCode;
			this.airEquipmentType = airEquipmentType;
			this.marketingAirlineCode = marketingAirlineCode;
			this.baggage = baggage;
			this.flightStatus = flightStatus;
			this.isReturn = isReturn;
			this.cabinClass = cabinClass;
			this.cabinClassType = cabinClassType;
			this.aTAinfoRef = aTAinfoRef;
			this.fareFamily = fareFamily;
		}
		public ReservationItem() {
			super();
		}
	    
}
