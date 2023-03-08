package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SessionResponse {
	@JsonProperty("Success")
	private boolean success;
	@JsonProperty("Data")
	private Data data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public SessionResponse(boolean success, Data data) {
		super();
		this.success = success;
		this.data = data;
	}

	public SessionResponse() {
		// TODO Auto-generated constructor stub
	}

}
