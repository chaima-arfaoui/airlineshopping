package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VoidSearchResponse {
	@JsonProperty("Data")
	public DataVoidSearch data;
	@JsonProperty("Success")
	public boolean success;

	public DataVoidSearch getData() {
		return data;
	}

	public void setData(DataVoidSearch data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public VoidSearchResponse(DataVoidSearch data, boolean success) {
		super();
		this.data = data;
		this.success = success;
	}

	public VoidSearchResponse() {
		super();
	}

}
