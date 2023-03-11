package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VoidQuoteResponse {
	@JsonProperty("Success")
	private boolean success;
	@JsonProperty("Data")
	private DatavoidQuote data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public DatavoidQuote getData() {
		return data;
	}

	public void setData(DatavoidQuote data) {
		this.data = data;
	}

	public VoidQuoteResponse(boolean success, DatavoidQuote data) {
		super();
		this.success = success;
		this.data = data;
	}

	public VoidQuoteResponse() {
		super();
	}

}
