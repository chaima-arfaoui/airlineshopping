package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OriginDestination {
	@JsonProperty("SegmentRef")
	public int segmentRef;
	@JsonProperty("ItineraryRef")
	public int itineraryRef;
	@JsonProperty("LegIndicator")
	public String legIndicator;

	public int getSegmentRef() {
		return segmentRef;
	}

	public void setSegmentRef(int segmentRef) {
		this.segmentRef = segmentRef;
	}

	public int getItineraryRef() {
		return itineraryRef;
	}

	public void setItineraryRef(int itineraryRef) {
		this.itineraryRef = itineraryRef;
	}

	public String getLegIndicator() {
		return legIndicator;
	}

	public void setLegIndicator(String legIndicator) {
		this.legIndicator = legIndicator;
	}

	public OriginDestination(int segmentRef, int itineraryRef, String legIndicator) {
		super();
		this.segmentRef = segmentRef;
		this.itineraryRef = itineraryRef;
		this.legIndicator = legIndicator;
	}

	public OriginDestination() {
		super();
	}

}
