package com.worldsoft.multicityResponse;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlightSegment {
	@JsonProperty("FlightNumber")
	private String flightNumber;
	@JsonProperty("ResBookDesigCode")
	private String resBookDesigCode;
	@JsonProperty("DepartureAirportLocationCode")
	private String departureAirportLocationCode;
	@JsonProperty("ArrivalAirportLocationCode")
	private String arrivalAirportLocationCode;
	@JsonProperty("OperatingAirline")
	private OperatingAirline operatingAirline;
	@JsonProperty("MarketingAirlineCode")
	private String marketingAirlineCode;
	@JsonProperty("MarriageGroup")
	private String marriageGroup;
	@JsonProperty("StopQuantityInfo")
	private StopQuantityInfo stopQuantityInfo;
	@JsonProperty("StopQuantityInformations")
	private ArrayList<StopQuantityInformation> stopQuantityInformations;
	@JsonProperty("CabinClassCode")
	private String cabinClassCode;
	@JsonProperty("ResBookDesigText")
	private String resBookDesigText;
	@JsonProperty("CabinClassText")
	private String cabinClassText;
	@JsonProperty("MealCode")
	private String mealCode;
	@JsonProperty("SeatsRemaining")
	private SeatsRemaining seatsRemaining;
	@JsonProperty("AirlinePNR")
	private String airlinePNR;
	@JsonProperty("Baggage")
	private Object baggage;
	@JsonProperty("CabinBaggage")
	private Object cabinBaggage;
	@JsonProperty("FareBasisCodes")
	private Object fareBasisCodes;
	@JsonProperty("LegIndicator")
	private int legIndicator;
	@JsonProperty("DepartureDateTime")
	private String departureDateTime;
	@JsonProperty("ArrivalDateTime")
	private String arrivalDateTime;
	@JsonProperty("StopQuantity")
	private int stopQuantity;
	@JsonProperty("JourneyDuration")
	private int journeyDuration;
	@JsonProperty("Eticket")
	private boolean eticket;
	private boolean isReturn;

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

	public String getDepartureAirportLocationCode() {
		return departureAirportLocationCode;
	}

	public void setDepartureAirportLocationCode(String departureAirportLocationCode) {
		this.departureAirportLocationCode = departureAirportLocationCode;
	}

	public String getArrivalAirportLocationCode() {
		return arrivalAirportLocationCode;
	}

	public void setArrivalAirportLocationCode(String arrivalAirportLocationCode) {
		this.arrivalAirportLocationCode = arrivalAirportLocationCode;
	}

	public OperatingAirline getOperatingAirline() {
		return operatingAirline;
	}

	public void setOperatingAirline(OperatingAirline operatingAirline) {
		this.operatingAirline = operatingAirline;
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

	public StopQuantityInfo getStopQuantityInfo() {
		return stopQuantityInfo;
	}

	public void setStopQuantityInfo(StopQuantityInfo stopQuantityInfo) {
		this.stopQuantityInfo = stopQuantityInfo;
	}

	public ArrayList<StopQuantityInformation> getStopQuantityInformations() {
		return stopQuantityInformations;
	}

	public void setStopQuantityInformations(ArrayList<StopQuantityInformation> stopQuantityInformations) {
		this.stopQuantityInformations = stopQuantityInformations;
	}

	public String getCabinClassCode() {
		return cabinClassCode;
	}

	public void setCabinClassCode(String cabinClassCode) {
		this.cabinClassCode = cabinClassCode;
	}

	public String getResBookDesigText() {
		return resBookDesigText;
	}

	public void setResBookDesigText(String resBookDesigText) {
		this.resBookDesigText = resBookDesigText;
	}

	public String getCabinClassText() {
		return cabinClassText;
	}

	public void setCabinClassText(String cabinClassText) {
		this.cabinClassText = cabinClassText;
	}

	public String getMealCode() {
		return mealCode;
	}

	public void setMealCode(String mealCode) {
		this.mealCode = mealCode;
	}

	public SeatsRemaining getSeatsRemaining() {
		return seatsRemaining;
	}

	public void setSeatsRemaining(SeatsRemaining seatsRemaining) {
		this.seatsRemaining = seatsRemaining;
	}

	public String getAirlinePNR() {
		return airlinePNR;
	}

	public void setAirlinePNR(String airlinePNR) {
		this.airlinePNR = airlinePNR;
	}

	public Object getBaggage() {
		return baggage;
	}

	public void setBaggage(Object baggage) {
		this.baggage = baggage;
	}

	public Object getCabinBaggage() {
		return cabinBaggage;
	}

	public void setCabinBaggage(Object cabinBaggage) {
		this.cabinBaggage = cabinBaggage;
	}

	public Object getFareBasisCodes() {
		return fareBasisCodes;
	}

	public void setFareBasisCodes(Object fareBasisCodes) {
		this.fareBasisCodes = fareBasisCodes;
	}

	public int getLegIndicator() {
		return legIndicator;
	}

	public void setLegIndicator(int legIndicator) {
		this.legIndicator = legIndicator;
	}

	public String getDepartureDateTime() {
		return departureDateTime;
	}

	public void setDepartureDateTime(String departureDateTime) {
		this.departureDateTime = departureDateTime;
	}

	public String getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(String arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public int getStopQuantity() {
		return stopQuantity;
	}

	public void setStopQuantity(int stopQuantity) {
		this.stopQuantity = stopQuantity;
	}

	public int getJourneyDuration() {
		return journeyDuration;
	}

	public void setJourneyDuration(int journeyDuration) {
		this.journeyDuration = journeyDuration;
	}

	public boolean isEticket() {
		return eticket;
	}

	public void setEticket(boolean eticket) {
		this.eticket = eticket;
	}

	public boolean isReturn() {
		return isReturn;
	}

	public void setReturn(boolean isReturn) {
		this.isReturn = isReturn;
	}

	public FlightSegment(String flightNumber, String resBookDesigCode, String departureAirportLocationCode,
			String arrivalAirportLocationCode, OperatingAirline operatingAirline, String marketingAirlineCode,
			String marriageGroup, StopQuantityInfo stopQuantityInfo,
			ArrayList<StopQuantityInformation> stopQuantityInformations, String cabinClassCode, String resBookDesigText,
			String cabinClassText, String mealCode, SeatsRemaining seatsRemaining, String airlinePNR, Object baggage,
			Object cabinBaggage, Object fareBasisCodes, int legIndicator, String departureDateTime,
			String arrivalDateTime, int stopQuantity, int journeyDuration, boolean eticket, boolean isReturn) {
		super();
		this.flightNumber = flightNumber;
		this.resBookDesigCode = resBookDesigCode;
		this.departureAirportLocationCode = departureAirportLocationCode;
		this.arrivalAirportLocationCode = arrivalAirportLocationCode;
		this.operatingAirline = operatingAirline;
		this.marketingAirlineCode = marketingAirlineCode;
		this.marriageGroup = marriageGroup;
		this.stopQuantityInfo = stopQuantityInfo;
		this.stopQuantityInformations = stopQuantityInformations;
		this.cabinClassCode = cabinClassCode;
		this.resBookDesigText = resBookDesigText;
		this.cabinClassText = cabinClassText;
		this.mealCode = mealCode;
		this.seatsRemaining = seatsRemaining;
		this.airlinePNR = airlinePNR;
		this.baggage = baggage;
		this.cabinBaggage = cabinBaggage;
		this.fareBasisCodes = fareBasisCodes;
		this.legIndicator = legIndicator;
		this.departureDateTime = departureDateTime;
		this.arrivalDateTime = arrivalDateTime;
		this.stopQuantity = stopQuantity;
		this.journeyDuration = journeyDuration;
		this.eticket = eticket;
		this.isReturn = isReturn;
	}

	public FlightSegment() {
		super();
	}

}
