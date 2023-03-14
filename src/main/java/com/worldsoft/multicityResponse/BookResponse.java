package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookResponse {
	@JsonProperty("Data")
	private Databooking data;
	private boolean Success;

	public Databooking getData() {
		return data;
	}

	public void setData(Databooking data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return Success;
	}

	public void setSuccess(boolean success) {
		Success = success;
	}

	public BookResponse(Databooking data, boolean success) {
		super();
		this.data = data;
		Success = success;
	}

	public BookResponse() {
		super();
	}

}
