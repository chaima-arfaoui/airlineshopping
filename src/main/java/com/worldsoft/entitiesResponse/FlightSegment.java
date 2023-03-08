package com.worldsoft.entitiesResponse;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlightSegment {
	 @JsonProperty("ArrivalAirportLocationCode") 
	    private String arrivalAirportLocationCode;
	    @JsonProperty("ArrivalDateTime") 
	    private Date arrivalDateTime;
	    @JsonProperty("CabinClassCode") 
	    private String cabinClassCode;
	    @JsonProperty("CabinClassText") 
	    private String cabinClassText;
	    @JsonProperty("DepartureAirportLocationCode") 
	    private String departureAirportLocationCode;
	    @JsonProperty("DepartureDateTime") 
	    private Date departureDateTime;
	    @JsonProperty("Eticket") 
	    private boolean eticket;
	    @JsonProperty("FlightNumber") 
	    private String flightNumber;
	    @JsonProperty("JourneyDuration") 
	    private int journeyDuration;
	    @JsonProperty("MarketingAirlineCode") 
	    private String marketingAirlineCode;
	    @JsonProperty("MarriageGroup") 
	    private String marriageGroup;
	    @JsonProperty("MealCode") 
	    private String mealCode;
	    @JsonProperty("OperatingAirline") 
	    private OperatingAirline operatingAirline;
	    @JsonProperty("ResBookDesigCode") 
	    private String resBookDesigCode;
	    @JsonProperty("ResBookDesigText") 
	    private String resBookDesigText;
	    @JsonProperty("SeatsRemaining") 
	    private SeatsRemaining seatsRemaining;
	    @JsonProperty("StopQuantity") 
	    private int stopQuantity;
	    @JsonProperty("StopQuantityInfo") 
	    private StopQuantityInfo stopQuantityInfo;
		public String getArrivalAirportLocationCode() {
			return arrivalAirportLocationCode;
		}
		public void setArrivalAirportLocationCode(String arrivalAirportLocationCode) {
			this.arrivalAirportLocationCode = arrivalAirportLocationCode;
		}
		public Date getArrivalDateTime() {
			return arrivalDateTime;
		}
		public void setArrivalDateTime(Date arrivalDateTime) {
			this.arrivalDateTime = arrivalDateTime;
		}
		public String getCabinClassCode() {
			return cabinClassCode;
		}
		public void setCabinClassCode(String cabinClassCode) {
			this.cabinClassCode = cabinClassCode;
		}
		public String getCabinClassText() {
			return cabinClassText;
		}
		public void setCabinClassText(String cabinClassText) {
			this.cabinClassText = cabinClassText;
		}
		public String getDepartureAirportLocationCode() {
			return departureAirportLocationCode;
		}
		public void setDepartureAirportLocationCode(String departureAirportLocationCode) {
			this.departureAirportLocationCode = departureAirportLocationCode;
		}
		public Date getDepartureDateTime() {
			return departureDateTime;
		}
		public void setDepartureDateTime(Date departureDateTime) {
			this.departureDateTime = departureDateTime;
		}
		public boolean isEticket() {
			return eticket;
		}
		public void setEticket(boolean eticket) {
			this.eticket = eticket;
		}
		public String getFlightNumber() {
			return flightNumber;
		}
		public void setFlightNumber(String flightNumber) {
			this.flightNumber = flightNumber;
		}
		public int getJourneyDuration() {
			return journeyDuration;
		}
		public void setJourneyDuration(int journeyDuration) {
			this.journeyDuration = journeyDuration;
		}
		public String getMarketingAirlineCode() {
			return marketingAirlineCode;
		}
		public void setMarketingAirlineCode(String marketingAirlineCode) {
			this.marketingAirlineCode = marketingAirlineCode;
		}
		public String getMarriageGroup() {
			return marriageGroup;
		}
		public void setMarriageGroup(String marriageGroup) {
			this.marriageGroup = marriageGroup;
		}
		public String getMealCode() {
			return mealCode;
		}
		public void setMealCode(String mealCode) {
			this.mealCode = mealCode;
		}
		public OperatingAirline getOperatingAirline() {
			return operatingAirline;
		}
		public void setOperatingAirline(OperatingAirline operatingAirline) {
			this.operatingAirline = operatingAirline;
		}
		public String getResBookDesigCode() {
			return resBookDesigCode;
		}
		public void setResBookDesigCode(String resBookDesigCode) {
			this.resBookDesigCode = resBookDesigCode;
		}
		public String getResBookDesigText() {
			return resBookDesigText;
		}
		public void setResBookDesigText(String resBookDesigText) {
			this.resBookDesigText = resBookDesigText;
		}
		public SeatsRemaining getSeatsRemaining() {
			return seatsRemaining;
		}
		public void setSeatsRemaining(SeatsRemaining seatsRemaining) {
			this.seatsRemaining = seatsRemaining;
		}
		public int getStopQuantity() {
			return stopQuantity;
		}
		public void setStopQuantity(int stopQuantity) {
			this.stopQuantity = stopQuantity;
		}
		public StopQuantityInfo getStopQuantityInfo() {
			return stopQuantityInfo;
		}
		public void setStopQuantityInfo(StopQuantityInfo stopQuantityInfo) {
			this.stopQuantityInfo = stopQuantityInfo;
		}
		public FlightSegment(String arrivalAirportLocationCode, Date arrivalDateTime, String cabinClassCode,
				String cabinClassText, String departureAirportLocationCode, Date departureDateTime, boolean eticket,
				String flightNumber, int journeyDuration, String marketingAirlineCode, String marriageGroup,
				String mealCode, OperatingAirline operatingAirline, String resBookDesigCode, String resBookDesigText,
				SeatsRemaining seatsRemaining, int stopQuantity, StopQuantityInfo stopQuantityInfo) {
			super();
			this.arrivalAirportLocationCode = arrivalAirportLocationCode;
			this.arrivalDateTime = arrivalDateTime;
			this.cabinClassCode = cabinClassCode;
			this.cabinClassText = cabinClassText;
			this.departureAirportLocationCode = departureAirportLocationCode;
			this.departureDateTime = departureDateTime;
			this.eticket = eticket;
			this.flightNumber = flightNumber;
			this.journeyDuration = journeyDuration;
			this.marketingAirlineCode = marketingAirlineCode;
			this.marriageGroup = marriageGroup;
			this.mealCode = mealCode;
			this.operatingAirline = operatingAirline;
			this.resBookDesigCode = resBookDesigCode;
			this.resBookDesigText = resBookDesigText;
			this.seatsRemaining = seatsRemaining;
			this.stopQuantity = stopQuantity;
			this.stopQuantityInfo = stopQuantityInfo;
		}
		public FlightSegment() {
			super();
		}
	    
	}


