package com.worldsoft.ptrentitiesResponse;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuotedSegment {
	@JsonProperty("Origin")
	private String origin;
	@JsonProperty("Destination")
	private String destination;
	@JsonProperty("CabinClass")
	private String cabinClass;
	@JsonProperty("DepartureDatetime")
	private Date departureDatetime;
	@JsonProperty("ArrivalDateTime")
	private Date arrivalDateTime;
	@JsonProperty("AirlineCode")
	private String airlineCode;
	@JsonProperty("FlightNumber")
	private int flightNumber;
	@JsonProperty("Duration")
	private String duration;
	@JsonProperty("Stops")
	private int stops;
	@JsonProperty("BookingClass")
	private String bookingClass;
	private boolean isReturn;

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getCabinClass() {
		return cabinClass;
	}

	public void setCabinClass(String cabinClass) {
		this.cabinClass = cabinClass;
	}

	public Date getDepartureDatetime() {
		return departureDatetime;
	}

	public void setDepartureDatetime(Date departureDatetime) {
		this.departureDatetime = departureDatetime;
	}

	public Date getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(Date arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public String getAirlineCode() {
		return airlineCode;
	}

	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getStops() {
		return stops;
	}

	public void setStops(int stops) {
		this.stops = stops;
	}

	public String getBookingClass() {
		return bookingClass;
	}

	public void setBookingClass(String bookingClass) {
		this.bookingClass = bookingClass;
	}

	public boolean isReturn() {
		return isReturn;
	}

	public void setReturn(boolean isReturn) {
		this.isReturn = isReturn;
	}

	public QuotedSegment(String origin, String destination, String cabinClass, Date departureDatetime,
			Date arrivalDateTime, String airlineCode, int flightNumber, String duration, int stops, String bookingClass,
			boolean isReturn) {
		super();
		this.origin = origin;
		this.destination = destination;
		this.cabinClass = cabinClass;
		this.departureDatetime = departureDatetime;
		this.arrivalDateTime = arrivalDateTime;
		this.airlineCode = airlineCode;
		this.flightNumber = flightNumber;
		this.duration = duration;
		this.stops = stops;
		this.bookingClass = bookingClass;
		this.isReturn = isReturn;
	}

	public QuotedSegment() {
		super();
	}

}
