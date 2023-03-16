package com.worldsoft.multicityResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlightSegmentList {
	@JsonProperty("DepartureAirportLocationCode")
	public String departureAirportLocationCode;
	@JsonProperty("ArrivalAirportLocationCode")
	public String arrivalAirportLocationCode;
	@JsonProperty("DepartureDateTime")
	public String departureDateTime;
	@JsonProperty("ArrivalDateTime")
	public String arrivalDateTime;
	public int stops;
	@JsonProperty("JourneyDuration")
	public int journeyDuration;
	@JsonProperty("Equipment")
	public String equipment;
	@JsonProperty("OperatingCarrierCode")
	public String operatingCarrierCode;
	@JsonProperty("OperatingFlightNumber")
	public String operatingFlightNumber;
	@JsonProperty("MarketingCarriercode")
	public String marketingCarriercode;
	@JsonProperty("MarketingFlightNumber")
	public String marketingFlightNumber;
	@JsonProperty("StopQuantityInfos")
	public ArrayList<StopQuantityInfo> stopQuantityInfos;
	@JsonProperty("ATAinfoRef")
	public String aTAinfoRef;
	@JsonProperty("SegmentRef")
	public int segmentRef;

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

	public int getStops() {
		return stops;
	}

	public void setStops(int stops) {
		this.stops = stops;
	}

	public int getJourneyDuration() {
		return journeyDuration;
	}

	public void setJourneyDuration(int journeyDuration) {
		this.journeyDuration = journeyDuration;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getOperatingCarrierCode() {
		return operatingCarrierCode;
	}

	public void setOperatingCarrierCode(String operatingCarrierCode) {
		this.operatingCarrierCode = operatingCarrierCode;
	}

	public String getOperatingFlightNumber() {
		return operatingFlightNumber;
	}

	public void setOperatingFlightNumber(String operatingFlightNumber) {
		this.operatingFlightNumber = operatingFlightNumber;
	}

	public String getMarketingCarriercode() {
		return marketingCarriercode;
	}

	public void setMarketingCarriercode(String marketingCarriercode) {
		this.marketingCarriercode = marketingCarriercode;
	}

	public String getMarketingFlightNumber() {
		return marketingFlightNumber;
	}

	public void setMarketingFlightNumber(String marketingFlightNumber) {
		this.marketingFlightNumber = marketingFlightNumber;
	}

	public ArrayList<StopQuantityInfo> getStopQuantityInfos() {
		return stopQuantityInfos;
	}

	public void setStopQuantityInfos(ArrayList<StopQuantityInfo> stopQuantityInfos) {
		this.stopQuantityInfos = stopQuantityInfos;
	}

	public String getaTAinfoRef() {
		return aTAinfoRef;
	}

	public void setaTAinfoRef(String aTAinfoRef) {
		this.aTAinfoRef = aTAinfoRef;
	}

	public int getSegmentRef() {
		return segmentRef;
	}

	public void setSegmentRef(int segmentRef) {
		this.segmentRef = segmentRef;
	}

	public FlightSegmentList(String departureAirportLocationCode, String arrivalAirportLocationCode,
			String departureDateTime, String arrivalDateTime, int stops, int journeyDuration, String equipment,
			String operatingCarrierCode, String operatingFlightNumber, String marketingCarriercode,
			String marketingFlightNumber, ArrayList<StopQuantityInfo> stopQuantityInfos, String aTAinfoRef,
			int segmentRef) {
		super();
		this.departureAirportLocationCode = departureAirportLocationCode;
		this.arrivalAirportLocationCode = arrivalAirportLocationCode;
		this.departureDateTime = departureDateTime;
		this.arrivalDateTime = arrivalDateTime;
		this.stops = stops;
		this.journeyDuration = journeyDuration;
		this.equipment = equipment;
		this.operatingCarrierCode = operatingCarrierCode;
		this.operatingFlightNumber = operatingFlightNumber;
		this.marketingCarriercode = marketingCarriercode;
		this.marketingFlightNumber = marketingFlightNumber;
		this.stopQuantityInfos = stopQuantityInfos;
		this.aTAinfoRef = aTAinfoRef;
		this.segmentRef = segmentRef;
	}

	public FlightSegmentList() {
		super();
	}

}
