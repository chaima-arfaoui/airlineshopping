package com.worldsoft.multicityResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
	@JsonProperty("Success")
	private boolean success;
	@JsonProperty("ConversationId")
	private String conversationId;
	private ArrayList<MultiCityFare> multiCityFares;
	@JsonProperty("Target")
	private String target;
	@JsonProperty("Errors")
	private Object errors;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public ArrayList<MultiCityFare> getMultiCityFares() {
		return multiCityFares;
	}

	public void setMultiCityFares(ArrayList<MultiCityFare> multiCityFares) {
		this.multiCityFares = multiCityFares;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Object getErrors() {
		return errors;
	}

	public void setErrors(Object errors) {
		this.errors = errors;
	}

	public Data(boolean success, String conversationId, ArrayList<MultiCityFare> multiCityFares, String target,
			Object errors) {
		super();
		this.success = success;
		this.conversationId = conversationId;
		this.multiCityFares = multiCityFares;
		this.target = target;
		this.errors = errors;
	}

	public Data() {
		super();
	}

}
