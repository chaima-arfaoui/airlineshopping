package com.worldsoft.multicityResponse;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StopQuantityInformation {
	@JsonProperty("LocationCode")
	private String locationCode;
	@JsonProperty("StopOverEquipment")
	private Object stopOverEquipment;
	@JsonProperty("ArrivalDateTime")
	private Date arrivalDateTime;
	@JsonProperty("DepartureDateTime")
	private Date departureDateTime;
	@JsonProperty("Duration")
	private int duration;

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public Object getStopOverEquipment() {
		return stopOverEquipment;
	}

	public void setStopOverEquipment(Object stopOverEquipment) {
		this.stopOverEquipment = stopOverEquipment;
	}

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

	public StopQuantityInformation(String locationCode, Object stopOverEquipment, Date arrivalDateTime,
			Date departureDateTime, int duration) {
		super();
		this.locationCode = locationCode;
		this.stopOverEquipment = stopOverEquipment;
		this.arrivalDateTime = arrivalDateTime;
		this.departureDateTime = departureDateTime;
		this.duration = duration;
	}

	public StopQuantityInformation() {
		super();
	}

}
