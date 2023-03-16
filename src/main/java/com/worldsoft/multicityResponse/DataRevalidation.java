package com.worldsoft.multicityResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataRevalidation {
	@JsonProperty("Success")
	public boolean success;
	@JsonProperty("IsValid")
	public boolean isValid;
	@JsonProperty("FareSourceCode")
	public String fareSourceCode;
	@JsonProperty("ConversationId")
	public String conversationId;
	@JsonProperty("PricedItineraries")
	public Object pricedItineraries;
	@JsonProperty("Target")
	public String target;
	@JsonProperty("Errors")
	public ArrayList<Error> errors;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public String getFareSourceCode() {
		return fareSourceCode;
	}

	public void setFareSourceCode(String fareSourceCode) {
		this.fareSourceCode = fareSourceCode;
	}

	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public Object getPricedItineraries() {
		return pricedItineraries;
	}

	public void setPricedItineraries(Object pricedItineraries) {
		this.pricedItineraries = pricedItineraries;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public ArrayList<Error> getErrors() {
		return errors;
	}

	public void setErrors(ArrayList<Error> errors) {
		this.errors = errors;
	}

	public DataRevalidation(boolean success, boolean isValid, String fareSourceCode, String conversationId,
			Object pricedItineraries, String target, ArrayList<Error> errors) {
		super();
		this.success = success;
		this.isValid = isValid;
		this.fareSourceCode = fareSourceCode;
		this.conversationId = conversationId;
		this.pricedItineraries = pricedItineraries;
		this.target = target;
		this.errors = errors;
	}

	public DataRevalidation() {
		super();
	}

}
