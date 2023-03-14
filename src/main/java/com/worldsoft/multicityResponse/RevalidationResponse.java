package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RevalidationResponse {
	@JsonProperty("Data")
	private DataRevalidation data;
	@JsonProperty("Success")
	private boolean success;

	public DataRevalidation getData() {
		return data;
	}

	public void setData(DataRevalidation data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public RevalidationResponse(DataRevalidation data, boolean success) {
		super();
		this.data = data;
		this.success = success;
	}

	public RevalidationResponse() {
		super();
	}

}
