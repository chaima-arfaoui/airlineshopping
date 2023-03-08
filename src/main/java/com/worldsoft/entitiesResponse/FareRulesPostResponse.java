package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FareRulesPostResponse {
	@JsonProperty("Data") 
    private DatafarerulesPost data;
    @JsonProperty("Success") 
    private boolean success;
	public DatafarerulesPost getData() {
		return data;
	}
	public void setData(DatafarerulesPost data) {
		this.data = data;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public FareRulesPostResponse(DatafarerulesPost data, boolean success) {
		super();
		this.data = data;
		this.success = success;
	}
	public FareRulesPostResponse() {
		super();
	}
    

}
