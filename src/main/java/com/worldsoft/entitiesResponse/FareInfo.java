package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FareInfo {
	 @JsonProperty("FareReference") 
	    private String fareReference;

	public String getFareReference() {
		return fareReference;
	}

	public void setFareReference(String fareReference) {
		this.fareReference = fareReference;
	}

	public FareInfo(String fareReference) {
		super();
		this.fareReference = fareReference;
	}

	public FareInfo() {
		super();
	}
	 
}
