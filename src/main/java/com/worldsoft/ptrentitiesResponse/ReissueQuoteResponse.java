package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReissueQuoteResponse {
	@JsonProperty("Success")
	public boolean success;
	@JsonProperty("Data")
	public DataReissueQuote data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public DataReissueQuote getData() {
		return data;
	}

	public void setData(DataReissueQuote data) {
		this.data = data;
	}

	public ReissueQuoteResponse(boolean success, DataReissueQuote data) {
		super();
		this.success = success;
		this.data = data;
	}

	public ReissueQuoteResponse() {
		super();
	}

}
