package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResponse {
	@JsonProperty("Data")
	private Data data;
	@JsonProperty("Success")
	private boolean success;

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public SearchResponse(Data data, boolean success) {
		super();
		this.data = data;
		this.success = success;
	}

	public SearchResponse() {
		super();
	}

}
