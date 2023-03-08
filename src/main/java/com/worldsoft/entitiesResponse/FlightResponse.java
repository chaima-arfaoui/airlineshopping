package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlightResponse {
	 @JsonProperty("Data") 
	    public DataFlight data;

	public DataFlight getData() {
		return data;
	}

	public void setData(DataFlight data) {
		this.data = data;
	}

	public FlightResponse(DataFlight data) {
		super();
		this.data = data;
	}

	public FlightResponse() {
		super();
	}
	 

}
