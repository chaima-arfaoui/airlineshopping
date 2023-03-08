package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CancelbookingResponse {
	@JsonProperty("Data") 
    private DataCancelbooking data;
    @JsonProperty("Success") 
    private boolean success;
	public DataCancelbooking getData() {
		return data;
	}
	public void setData(DataCancelbooking data) {
		this.data = data;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public CancelbookingResponse(DataCancelbooking data, boolean success) {
		super();
		this.data = data;
		this.success = success;
	}
	public CancelbookingResponse() {
		super();
	}
    

}
