package com.worldsoft.entitiesResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataRevalidation {
	@JsonProperty("ConversationId") 
    private String conversationId;
    @JsonProperty("Errors") 
    private ArrayList<Object> errors;
    @JsonProperty("IsValid") 
    private boolean isValid;
    @JsonProperty("PricedItineraries") 
    private ArrayList<PricedItinerary> pricedItineraries;
    @JsonProperty("Success") 
    private boolean success;
    @JsonProperty("Target") 
    private String target;
    @JsonProperty("ExtraServices") 
    private ExtraServices extraServices;
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
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	public ArrayList<PricedItinerary> getPricedItineraries() {
		return pricedItineraries;
	}
	public void setPricedItineraries(ArrayList<PricedItinerary> pricedItineraries) {
		this.pricedItineraries = pricedItineraries;
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
	public ExtraServices getExtraServices() {
		return extraServices;
	}
	public void setExtraServices(ExtraServices extraServices) {
		this.extraServices = extraServices;
	}
	public DataRevalidation(String conversationId, ArrayList<Object> errors, boolean isValid,
			ArrayList<PricedItinerary> pricedItineraries, boolean success, String target, ExtraServices extraServices) {
		super();
		this.conversationId = conversationId;
		this.errors = errors;
		this.isValid = isValid;
		this.pricedItineraries = pricedItineraries;
		this.success = success;
		this.target = target;
		this.extraServices = extraServices;
	}
	public DataRevalidation() {
		super();
	}
    

}
