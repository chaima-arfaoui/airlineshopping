package com.worldsoft.entitiesResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataFlight {
	    @JsonProperty("ConversationId") 
	    private String conversationId;
	    @JsonProperty("Errors") 
	    private ArrayList<Object> errors;
	    @JsonProperty("PricedItineraries") 
	    private ArrayList<PricedItinerary> pricedItineraries;
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
		public ArrayList<PricedItinerary> getPricedItineraries() {
			return pricedItineraries;
		}
		public void setPricedItineraries(ArrayList<PricedItinerary> pricedItineraries) {
			this.pricedItineraries = pricedItineraries;
		}
		public DataFlight(String conversationId, ArrayList<Object> errors,
				ArrayList<PricedItinerary> pricedItineraries) {
			super();
			this.conversationId = conversationId;
			this.errors = errors;
			this.pricedItineraries = pricedItineraries;
		}
		public DataFlight() {
			super();
		}
	    
	}


