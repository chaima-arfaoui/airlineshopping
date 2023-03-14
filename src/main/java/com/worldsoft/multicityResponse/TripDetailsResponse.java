package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TripDetailsResponse {
	@JsonProperty("Data")
	private DataTrip data;
	@JsonProperty("Success")
	private boolean success;

	public DataTrip getData() {
		return data;
	}

	public void setData(DataTrip data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public TripDetailsResponse(DataTrip data, boolean success) {
		super();
		this.data = data;
		this.success = success;
	}

	public TripDetailsResponse() {
		super();
	}

}
