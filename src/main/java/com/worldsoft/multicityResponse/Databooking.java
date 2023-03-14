package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Databooking {
	@JsonProperty("Success")
	private boolean success;
	@JsonProperty("UniqueID")
	private String uniqueID;
	@JsonProperty("Status")
	private String status;
	@JsonProperty("Errors")
	private Object errors;
	@JsonProperty("Target")
	private String target;
	@JsonProperty("ConversationId")
	private String conversationId;
	@JsonProperty("ClientUTCOffset")
	private double clientUTCOffset;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(String uniqueID) {
		this.uniqueID = uniqueID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getErrors() {
		return errors;
	}

	public void setErrors(Object errors) {
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

	public Databooking(boolean success, String uniqueID, String status, Object errors, String target,
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
