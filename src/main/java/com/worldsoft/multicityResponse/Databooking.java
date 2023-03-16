package com.worldsoft.multicityResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Databooking {
	@JsonProperty("Success")
	public boolean success;
	@JsonProperty("UniqueID")
	public Object uniqueID;
	@JsonProperty("Status")
	public Object status;
	@JsonProperty("Errors")
	public ArrayList<Error> errors;
	@JsonProperty("Target")
	public String target;
	@JsonProperty("ConversationId")
	public String conversationId;
	@JsonProperty("ClientUTCOffset")
	public double clientUTCOffset;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(Object uniqueID) {
		this.uniqueID = uniqueID;
	}

	public Object getStatus() {
		return status;
	}

	public void setStatus(Object status) {
		this.status = status;
	}

	public ArrayList<Error> getErrors() {
		return errors;
	}

	public void setErrors(ArrayList<Error> errors) {
		this.errors = errors;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public double getClientUTCOffset() {
		return clientUTCOffset;
	}

	public void setClientUTCOffset(double clientUTCOffset) {
		this.clientUTCOffset = clientUTCOffset;
	}

	public Databooking(boolean success, Object uniqueID, Object status, ArrayList<Error> errors, String target,
			String conversationId, double clientUTCOffset) {
		super();
		this.success = success;
		this.uniqueID = uniqueID;
		this.status = status;
		this.errors = errors;
		this.target = target;
		this.conversationId = conversationId;
		this.clientUTCOffset = clientUTCOffset;
	}

	public Databooking() {
		super();
	}

}