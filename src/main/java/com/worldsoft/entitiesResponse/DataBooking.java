package com.worldsoft.entitiesResponse;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataBooking {
	@JsonProperty("ClientUTCOffset") 
    private double clientUTCOffset;
    @JsonProperty("ConversationId") 
    private String conversationId;
    @JsonProperty("Errors") 
    private ArrayList<Object> errors;
    @JsonProperty("IsPriceChange") 
    private String isPriceChange;
    @JsonProperty("IsScheduleChange") 
    private String isScheduleChange;
    @JsonProperty("Status") 
    private String status;
    @JsonProperty("Success") 
    private boolean success;
    @JsonProperty("Target") 
    private String target;
    @JsonProperty("TktTimeLimit") 
    private String tktTimeLimit;
    @JsonProperty("UniqueID") 
    private String uniqueID;
	public double getClientUTCOffset() {
		return clientUTCOffset;
	}
	public void setClientUTCOffset(double clientUTCOffset) {
		this.clientUTCOffset = clientUTCOffset;
	}
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
	public String getIsPriceChange() {
		return isPriceChange;
	}
	public void setIsPriceChange(String isPriceChange) {
		this.isPriceChange = isPriceChange;
	}
	public String getIsScheduleChange() {
		return isScheduleChange;
	}
	public void setIsScheduleChange(String isScheduleChange) {
		this.isScheduleChange = isScheduleChange;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public String getTktTimeLimit() {
		return tktTimeLimit;
	}
	public void setTktTimeLimit(String tktTimeLimit) {
		this.tktTimeLimit = tktTimeLimit;
	}
	public String getUniqueID() {
		return uniqueID;
	}
	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}
	public DataBooking(double clientUTCOffset, String conversationId, ArrayList<Object> errors, String isPriceChange,
			String isScheduleChange, String status, boolean success, String target, String tktTimeLimit,
			String uniqueID) {
		super();
		this.clientUTCOffset = clientUTCOffset;
		this.conversationId = conversationId;
		this.errors = errors;
		this.isPriceChange = isPriceChange;
		this.isScheduleChange = isScheduleChange;
		this.status = status;
		this.success = success;
		this.target = target;
		this.tktTimeLimit = tktTimeLimit;
		this.uniqueID = uniqueID;
	}
	public DataBooking() {
		super();
	}
    

}
