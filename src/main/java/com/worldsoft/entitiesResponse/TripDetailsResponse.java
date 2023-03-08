package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TripDetailsResponse {
	@JsonProperty("Success") 
    private boolean success;
    @JsonProperty("Data") 
    private Data data;
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public TripDetailsResponse(boolean success, Data data) {
		super();
		this.success = success;
		this.data = data;
	}
	public TripDetailsResponse() {
		super();
	}

}
