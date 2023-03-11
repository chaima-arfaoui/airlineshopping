package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataTripdetail {
	@JsonProperty("TripDetailsResult")
	public TripDetailsResult tripDetailsResult;

	public TripDetailsResult getTripDetailsResult() {
		return tripDetailsResult;
	}

	public void setTripDetailsResult(TripDetailsResult tripDetailsResult) {
		this.tripDetailsResult = tripDetailsResult;
	}

	public DataTripdetail(TripDetailsResult tripDetailsResult) {
		super();
		this.tripDetailsResult = tripDetailsResult;
	}

	public DataTripdetail() {
		super();
	}
	

	}