package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VoidPostResponse {
	@JsonProperty("Success")
	public boolean success;
	@JsonProperty("Data")
	public DataVoidPost data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public DataVoidPost getData() {
		return data;
	}

	public void setData(DataVoidPost data) {
		this.data = data;
	}

	public VoidPostResponse(boolean success, DataVoidPost data) {
		super();
		this.success = success;
		this.data = data;
	}

	public VoidPostResponse() {
		super();
	}

}
