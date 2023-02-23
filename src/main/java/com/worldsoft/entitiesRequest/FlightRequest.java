package com.worldsoft.entitiesRequest;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlightRequest {
	 @JsonProperty("OriginDestinationInformations") 
	 private ArrayList<OriginDestinationInformation> originDestinationInformations;
	    @JsonProperty("TravelPreferences") 
	    private TravelPreferences travelPreferences;
	    @JsonProperty("PricingSourceType") 
	    private String pricingSourceType;
	    @JsonProperty("IsRefundable") 
	    private boolean isRefundable;
	    @JsonProperty("PassengerTypeQuantities") 
	    private ArrayList<PassengerTypeQuantity> passengerTypeQuantities;
	    @JsonProperty("RequestOptions") 
	    private String requestOptions;
	    @JsonProperty("NearByAirports") 
	    private boolean nearByAirports;
	    @JsonProperty("Target") 
	    private String target;
	    @JsonProperty("ConversationId") 
	    private String conversationId;
		public ArrayList<OriginDestinationInformation> getOriginDestinationInformations() {
			return originDestinationInformations;
		}
		public void setOriginDestinationInformations(ArrayList<OriginDestinationInformation> originDestinationInformations) {
			this.originDestinationInformations = originDestinationInformations;
		}
		public TravelPreferences getTravelPreferences() {
			return travelPreferences;
		}
		public void setTravelPreferences(TravelPreferences travelPreferences) {
			this.travelPreferences = travelPreferences;
		}
		public String getPricingSourceType() {
			return pricingSourceType;
		}
		public void setPricingSourceType(String pricingSourceType) {
			this.pricingSourceType = pricingSourceType;
		}
		public boolean isRefundable() {
			return isRefundable;
		}
		public void setRefundable(boolean isRefundable) {
			this.isRefundable = isRefundable;
		}
		public ArrayList<PassengerTypeQuantity> getPassengerTypeQuantities() {
			return passengerTypeQuantities;
		}
		public void setPassengerTypeQuantities(ArrayList<PassengerTypeQuantity> passengerTypeQuantities) {
			this.passengerTypeQuantities = passengerTypeQuantities;
		}
		public String getRequestOptions() {
			return requestOptions;
		}
		public void setRequestOptions(String requestOptions) {
			this.requestOptions = requestOptions;
		}
		public boolean isNearByAirports() {
			return nearByAirports;
		}
		public void setNearByAirports(boolean nearByAirports) {
			this.nearByAirports = nearByAirports;
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
		public FlightRequest(ArrayList<OriginDestinationInformation> originDestinationInformations,
				TravelPreferences travelPreferences, String pricingSourceType, boolean isRefundable,
				ArrayList<PassengerTypeQuantity> passengerTypeQuantities, String requestOptions, boolean nearByAirports,
				String target, String conversationId) {
			super();
			this.originDestinationInformations = originDestinationInformations;
			this.travelPreferences = travelPreferences;
			this.pricingSourceType = pricingSourceType;
			this.isRefundable = isRefundable;
			this.passengerTypeQuantities = passengerTypeQuantities;
			this.requestOptions = requestOptions;
			this.nearByAirports = nearByAirports;
			this.target = target;
			this.conversationId = conversationId;
		}
		public FlightRequest() {
			super();
		}
		
	    

}
