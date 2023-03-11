package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TripDetailsResponse {
	@JsonProperty("Success")
	private boolean success;
	@JsonProperty("Data")
	private DataTripdetail data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public DataTripdetail getData() {
		return data;
	}

	public void setData(DataTripdetail data) {
		this.data = data;
	}

	public TripDetailsResponse(boolean success, DataTripdetail data) {
		super();
		this.success = success;
		this.data = data;
	}

	public TripDetailsResponse() {
		super();
	}

}
