package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookingResponse {
	@JsonProperty("Data")
	public DataBooking data;
	@JsonProperty("Success")
	public boolean success;

	public DataBooking getData() {
		return data;
	}

	public void setData(DataBooking data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public BookingResponse(DataBooking data, boolean success) {
		super();
		this.data = data;
		this.success = success;
	}

	public BookingResponse() {
		super();
	}

}
