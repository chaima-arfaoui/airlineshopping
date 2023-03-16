package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReissueconfirmationResponse {
	@JsonProperty("Data")
	private DataConfirmation data;
	@JsonProperty("Success")
	private boolean success;

	public DataConfirmation getData() {
		return data;
	}

	public void setData(DataConfirmation data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public ReissueconfirmationResponse(DataConfirmation data, boolean success) {
		super();
		this.data = data;
		this.success = success;
	}

	public ReissueconfirmationResponse() {
		super();
	}

}
