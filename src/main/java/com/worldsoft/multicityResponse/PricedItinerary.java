package com.worldsoft.multicityResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PricedItinerary {
	@JsonProperty("FareSourceCode")
	public String fareSourceCode;
	@JsonProperty("ValidatingCarrier")
	public String validatingCarrier;
	@JsonProperty("OriginDestinations")
	public ArrayList<OriginDestination> originDestinations;
	@JsonProperty("FareRef")
	public int fareRef;
	@JsonProperty("PenaltiesInfoRef")
	public int penaltiesInfoRef;
	@JsonProperty("FulfillmentDetailsRef")
	public int fulfillmentDetailsRef;

	public String getFareSourceCode() {
		return fareSourceCode;
	}

	public void setFareSourceCode(String fareSourceCode) {
		this.fareSourceCode = fareSourceCode;
	}

	public String getValidatingCarrier() {
		return validatingCarrier;
	}

	public void setValidatingCarrier(String validatingCarrier) {
		this.validatingCarrier = validatingCarrier;
	}

	public ArrayList<OriginDestination> getOriginDestinations() {
		return originDestinations;
	}

	public void setOriginDestinations(ArrayList<OriginDestination> originDestinations) {
		this.originDestinations = originDestinations;
	}

	public int getFareRef() {
		return fareRef;
	}

	public void setFareRef(int fareRef) {
		this.fareRef = fareRef;
	}

	public int getPenaltiesInfoRef() {
		return penaltiesInfoRef;
	}

	public void setPenaltiesInfoRef(int penaltiesInfoRef) {
		this.penaltiesInfoRef = penaltiesInfoRef;
	}

	public int getFulfillmentDetailsRef() {
		return fulfillmentDetailsRef;
	}

	public void setFulfillmentDetailsRef(int fulfillmentDetailsRef) {
		this.fulfillmentDetailsRef = fulfillmentDetailsRef;
	}

	public PricedItinerary(String fareSourceCode, String validatingCarrier,
			ArrayList<OriginDestination> originDestinations, int fareRef, int penaltiesInfoRef,
			int fulfillmentDetailsRef) {
		super();
		this.fareSourceCode = fareSourceCode;
		this.validatingCarrier = validatingCarrier;
		this.originDestinations = originDestinations;
		this.fareRef = fareRef;
		this.penaltiesInfoRef = penaltiesInfoRef;
		this.fulfillmentDetailsRef = fulfillmentDetailsRef;
	}

	public PricedItinerary() {
		super();
	}

}
