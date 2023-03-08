package com.worldsoft.entitiesResponse;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StopQuantityInfo {
	@JsonProperty("ArrivalDateTime")
	private Date arrivalDateTime;
	@JsonProperty("DepartureDateTime")
	private Date departureDateTime;
	@JsonProperty("Duration")
	private int duration;
	@JsonProperty("LocationCode")
	private String locationCode;

	public Date getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(Date arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public Date getDepartureDateTime() {
		return departureDateTime;
	}

	public void setDepartureDateTime(Date departureDateTime) {
		this.departureDateTime = departureDateTime;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public StopQuantityInfo(Date arrivalDateTime, Date departureDateTime, int duration, String locationCode) {
		super();
		this.arrivalDateTime = arrivalDateTime;
		this.departureDateTime = departureDateTime;
		this.duration = duration;
		this.locationCode = locationCode;
	}

	public StopQuantityInfo() {
		super();
	}

}
