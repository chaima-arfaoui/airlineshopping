package com.worldsoft.entitiesRequest;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestedSegment {
	 @JsonProperty("Origin") 
	 private String origin;
	    @JsonProperty("Destination") 
	    private String destination;
	    @JsonProperty("FlightNumber") 
	    private String flightNumber;
	    @JsonProperty("DepartureDateTime") 
	    private String departureDateTime;
	    @JsonProperty("RequestSSRs") 
	    private ArrayList<RequestSSR> requestSSRs;
		public String getOrigin() {
			return origin;
		}
		public void setOrigin(String origin) {
			this.origin = origin;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public String getFlightNumber() {
			return flightNumber;
		}
		public void setFlightNumber(String flightNumber) {
			this.flightNumber = flightNumber;
		}
		public String getDepartureDateTime() {
			return departureDateTime;
		}
		public void setDepartureDateTime(String departureDateTime) {
			this.departureDateTime = departureDateTime;
		}
		public ArrayList<RequestSSR> getRequestSSRs() {
			return requestSSRs;
		}
		public void setRequestSSRs(ArrayList<RequestSSR> requestSSRs) {
			this.requestSSRs = requestSSRs;
		}
		public RequestedSegment(String origin, String destination, String flightNumber, String departureDateTime,
				ArrayList<RequestSSR> requestSSRs) {
			super();
			this.origin = origin;
			this.destination = destination;
			this.flightNumber = flightNumber;
			this.departureDateTime = departureDateTime;
			this.requestSSRs = requestSSRs;
		}
		public RequestedSegment() {
			super();
		}
	    

}
