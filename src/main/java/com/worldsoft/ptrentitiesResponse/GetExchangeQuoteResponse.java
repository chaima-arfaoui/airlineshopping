package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetExchangeQuoteResponse {
	@JsonProperty("Data")
	private DataGetExchangeQuote data;
	@JsonProperty("Success")
	private boolean success;

	public DataGetExchangeQuote getData() {
		return data;
	}

	public void setData(DataGetExchangeQuote data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public GetExchangeQuoteResponse(DataGetExchangeQuote data, boolean success) {
		super();
		this.data = data;
		this.success = success;
	}

	public GetExchangeQuoteResponse() {
		super();
	}

}
