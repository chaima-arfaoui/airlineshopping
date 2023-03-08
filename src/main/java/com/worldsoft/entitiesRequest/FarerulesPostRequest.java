package com.worldsoft.entitiesRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FarerulesPostRequest {
	@JsonProperty("uniqueId")
	private String uniqueId;
	@JsonProperty("Target") 
	private String target;
	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public FarerulesPostRequest(String uniqueId, String target) {
		super();
		this.uniqueId = uniqueId;
		this.target = target;
	}
	public FarerulesPostRequest() {
		super();
	}
	

}
