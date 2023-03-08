package com.worldsoft.entitiesResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataCancelbooking {
	@JsonProperty("ConversationId") 
	private String conversationId;
    @JsonProperty("Errors") 
    private ArrayList<Object> errors;
    @JsonProperty("Success") 
    private boolean success;
    @JsonProperty("Target") 
    private String target;
    @JsonProperty("UniqueID") 
    private String uniqueID;
	public String getConversationId() {
		return conversationId;
	}
	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}
	public ArrayList<Object> getErrors() {
		return errors;
	}
	public void setErrors(ArrayList<Object> errors) {
		this.errors = errors;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	public DataCancelbooking(String conversationId, ArrayList<Object> errors, boolean success, String target,
			String uniqueID) {
		super();
		this.conversationId = conversationId;
		this.errors = errors;
		this.success = success;
		this.target = target;
		this.uniqueID = uniqueID;
	}
	public DataCancelbooking() {
		super();
	}
    

}
