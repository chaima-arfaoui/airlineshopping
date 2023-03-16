package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRefundResponse {
	@JsonProperty("Success")
	private boolean success;
	@JsonProperty("Data")
	private DataPostrefund data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public DataPostrefund getData() {
		return data;
	}

	public void setData(DataPostrefund data) {
		this.data = data;
	}

	public PostRefundResponse(boolean success, DataPostrefund data) {
		super();
		this.success = success;
		this.data = data;
	}

	public PostRefundResponse() {
		super();
	}

}
