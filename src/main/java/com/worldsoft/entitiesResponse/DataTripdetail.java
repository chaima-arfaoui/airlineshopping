package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataTripdetail {
	 @JsonProperty("TripDetailsResult") 
	    public TripDetailsResponse tripDetailsResult;

	public TripDetailsResponse getTripDetailsResult() {
		return tripDetailsResult;
	}

	public void setTripDetailsResult(TripDetailsResponse tripDetailsResult) {
		this.tripDetailsResult = tripDetailsResult;
	}

	public DataTripdetail(TripDetailsResponse tripDetailsResult) {
		super();
		this.tripDetailsResult = tripDetailsResult;
	}

	public DataTripdetail() {
		super();
	}
	 
	}


