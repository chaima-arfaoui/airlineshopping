package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AcceptReissueQuoteResponse {
	@JsonProperty("Success")
	private boolean success;
	@JsonProperty("Data")
	private DataAccept data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public DataAccept getData() {
		return data;
	}

	public void setData(DataAccept data) {
		this.data = data;
	}

	public AcceptReissueQuoteResponse(boolean success, DataAccept data) {
		super();
		this.success = success;
		this.data = data;
	}

	public AcceptReissueQuoteResponse() {
		super();
	}

}
