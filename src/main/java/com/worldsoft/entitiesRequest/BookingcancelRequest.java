package com.worldsoft.entitiesRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookingcancelRequest {
	@JsonProperty("UniqueID") 
    private String uniqueID;
    @JsonProperty("Target") 
    private String target;
	public String getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public BookingcancelRequest(String uniqueID, String target) {
		super();
		this.uniqueID = uniqueID;
		this.target = target;
	}
	public BookingcancelRequest() {
		super();
	}
    
    

}
