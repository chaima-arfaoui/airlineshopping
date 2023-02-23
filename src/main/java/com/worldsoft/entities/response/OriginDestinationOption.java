package com.worldsoft.entities.response;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OriginDestinationOption {
	  @JsonProperty("FlightSegments") 
	  private ArrayList<FlightSegment> flightSegments;

	public ArrayList<FlightSegment> getFlightSegments() {
		return flightSegments;
	}

	public void setFlightSegments(ArrayList<FlightSegment> flightSegments) {
		this.flightSegments = flightSegments;
	}

	public OriginDestinationOption(ArrayList<FlightSegment> flightSegments) {
		super();
		this.flightSegments = flightSegments;
	}

	public OriginDestinationOption() {
		super();
	}
	  
	}

