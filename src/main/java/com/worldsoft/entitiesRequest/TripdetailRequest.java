package com.worldsoft.entitiesRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TripdetailRequest {
	 @JsonProperty("UniqueID") 
	    private String uniqueID;

	public String getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}

	public TripdetailRequest(String uniqueID) {
		super();
		this.uniqueID = uniqueID;
	}

	public TripdetailRequest() {
		super();
	}
	 

}
