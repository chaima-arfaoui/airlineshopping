package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchRefundResponse {
	@JsonProperty("Data")
	private DataSearchRefund data;
	@JsonProperty("Success")
	private boolean success;

	public DataSearchRefund getData() {
		return data;
	}

	public void setData(DataSearchRefund data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public SearchRefundResponse(DataSearchRefund data, boolean success) {
		super();
		this.data = data;
		this.success = success;
	}

	public SearchRefundResponse() {
		super();
	}

}
