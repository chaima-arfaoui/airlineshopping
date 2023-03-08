package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Itinerary { 
	@JsonProperty("ItineraryInfo") 
    private ItineraryInfo itineraryInfo;
    @JsonProperty("Type") 
    private String type;
	public ItineraryInfo getItineraryInfo() {
		return itineraryInfo;
	}
	public void setItineraryInfo(ItineraryInfo itineraryInfo) {
		this.itineraryInfo = itineraryInfo;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Itinerary(ItineraryInfo itineraryInfo, String type) {
		super();
		this.itineraryInfo = itineraryInfo;
		this.type = type;
	}
	public Itinerary() {
		super();
	}
    

}
