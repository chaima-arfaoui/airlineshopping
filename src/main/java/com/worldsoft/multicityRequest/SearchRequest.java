package com.worldsoft.multicityRequest;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SearchRequest {
	@JsonProperty("OriginDestinationInformations")
	private ArrayList<OriginDestinationInformation> originDestinationInformations;
	@JsonProperty("TravelPreferences")
	private TravelPreferencesM travelPreferences;
	@JsonProperty("PricingSourceType")
	private String pricingSourceType;
	@JsonProperty("IsRefundable")
	private boolean isRefundable;
	@JsonProperty("PassengerTypeQuantities")
	private ArrayList<PassengerTypeQuantity> passengerTypeQuantities;
	@JsonProperty("RequestOptions")
	private String requestOptions;
	@JsonProperty("Target")
	private String target;

	public ArrayList<OriginDestinationInformation> getOriginDestinationInformations() {
		return originDestinationInformations;
	}

	public void setOriginDestinationInformations(
			ArrayList<OriginDestinationInformation> originDestinationInformations) {
		this.originDestinationInformations = originDestinationInformations;
	}

	public TravelPreferencesM getTravelPreferences() {
		return travelPreferences;
	}

	public void setTravelPreferences(TravelPreferencesM travelPreferences) {
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

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public SearchRequest(ArrayList<OriginDestinationInformation> originDestinationInformations,
			TravelPreferencesM travelPreferences, String pricingSourceType, boolean isRefundable,
			ArrayList<PassengerTypeQuantity> passengerTypeQuantities, String requestOptions, String target) {
		super();
		this.originDestinationInformations = originDestinationInformations;
		this.travelPreferences = travelPreferences;
		this.pricingSourceType = pricingSourceType;
		this.isRefundable = isRefundable;
		this.passengerTypeQuantities = passengerTypeQuantities;
		this.requestOptions = requestOptions;
		this.target = target;
	}

	public SearchRequest() {
		super();
	}

}
