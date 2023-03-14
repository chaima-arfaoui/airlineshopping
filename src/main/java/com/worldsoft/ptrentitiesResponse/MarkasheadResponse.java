package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarkasheadResponse {
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

	public MarkasheadResponse(DataMarkashead data, boolean success) {
		super();
		this.data = data;
		this.success = success;
	}

	public MarkasheadResponse() {
		super();
	}

}
