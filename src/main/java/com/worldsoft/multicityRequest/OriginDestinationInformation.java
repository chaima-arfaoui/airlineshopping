package com.worldsoft.multicityRequest;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OriginDestinationInformation {
	@JsonProperty("DepartureDateTime")
	private String departureDateTime;
	@JsonProperty("OriginLocationCode")
	private String originLocationCode;
	@JsonProperty("DestinationLocationCode")
	private String destinationLocationCode;

	public String getDepartureDateTime() {
		return departureDateTime;
	}

	public void setDepartureDateTime(String departureDateTime) {
		this.departureDateTime = departureDateTime;
	}

	public String getOriginLocationCode() {
		return originLocationCode;
	}

	public void setOriginLocationCode(String originLocationCode) {
		this.originLocationCode = originLocationCode;
	}

	public String getDestinationLocationCode() {
		return destinationLocationCode;
	}

	public void setDestinationLocationCode(String destinationLocationCode) {
		this.destinationLocationCode = destinationLocationCode;
	}

	public OriginDestinationInformation(String departureDateTime, String originLocationCode,
			String destinationLocationCode) {
		super();
		this.departureDateTime = departureDateTime;
		this.originLocationCode = originLocationCode;
		this.destinationLocationCode = destinationLocationCode;
	}

	public OriginDestinationInformation() {
		super();
	}

}
