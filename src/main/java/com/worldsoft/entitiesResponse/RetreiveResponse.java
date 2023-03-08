package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RetreiveResponse {

	@JsonProperty("Data")
	public DataRetreive data;
	@JsonProperty("Success")
	public boolean success;

	public DataRetreive getData() {
		return data;
	}

	public void setData(DataRetreive data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public RetreiveResponse(DataRetreive data, boolean success) {
		super();
		this.data = data;
		this.success = success;
	}

	public RetreiveResponse() {
		super();
	}

}
