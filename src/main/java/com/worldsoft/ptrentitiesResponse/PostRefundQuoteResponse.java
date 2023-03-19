package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRefundQuoteResponse {
	@JsonProperty("Success")
	private boolean success;
	@JsonProperty("Data")
	private DataRefundQuote data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public DataRefundQuote getData() {
		return data;
	}

	public void setData(DataRefundQuote data) {
		this.data = data;
	}

	public PostRefundQuoteResponse(boolean success, DataRefundQuote data) {
		super();
		this.success = success;
		this.data = data;
	}

	public PostRefundQuoteResponse() {
		super();
	}

}
