package com.worldsoft.multicityResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MultiCityFare {
	@JsonProperty("PricedItineraries")
	private ArrayList<PricedItinerary> pricedItineraries;

	public ArrayList<PricedItinerary> getPricedItineraries() {
		return pricedItineraries;
	}

	public void setPricedItineraries(ArrayList<PricedItinerary> pricedItineraries) {
		this.pricedItineraries = pricedItineraries;
	}

	public MultiCityFare(ArrayList<PricedItinerary> pricedItineraries) {
		super();
		this.pricedItineraries = pricedItineraries;
	}

	public MultiCityFare() {
		super();
	}

}
