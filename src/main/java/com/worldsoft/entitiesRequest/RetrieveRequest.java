package com.worldsoft.entitiesRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RetrieveRequest {
	 @JsonProperty("FaresourceCode") 
	    public String faresourceCode;

	public String getFaresourceCode() {
		return faresourceCode;
	}

	public void setFaresourceCode(String faresourceCode) {
		this.faresourceCode = faresourceCode;
	}

	public RetrieveRequest(String faresourceCode) {
		super();
		this.faresourceCode = faresourceCode;
	}

	public RetrieveRequest() {
		super();
	}
	 

}
