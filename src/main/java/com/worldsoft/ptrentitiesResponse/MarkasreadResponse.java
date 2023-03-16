package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarkasreadResponse {
	@JsonProperty("Data")
	private DataMarkashead data;
	@JsonProperty("Success")
	private boolean success;

	public DataMarkashead getData() {
		return data;
	}

	public void setData(DataMarkashead data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public MarkasreadResponse(DataMarkashead data, boolean success) {
		super();
		this.data = data;
		this.success = success;
	}

	public MarkasreadResponse() {
		super();
	}

}
