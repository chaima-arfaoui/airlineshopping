package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SchacceptResponse {
	@JsonProperty("Success")
	public boolean success;
	@JsonProperty("Data")
	public Datascheduleaccept data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Datascheduleaccept getData() {
		return data;
	}

	public void setData(Datascheduleaccept data) {
		this.data = data;
	}

	public SchacceptResponse(boolean success, Datascheduleaccept data) {
		super();
		this.success = success;
		this.data = data;
	}

	public SchacceptResponse() {
		super();
	}

}
