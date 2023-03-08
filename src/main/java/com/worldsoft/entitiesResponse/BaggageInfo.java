package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaggageInfo {
	 @JsonProperty("Arrival") 
	    private String arrival;
	    @JsonProperty("Baggage") 
	    private String baggage;
	    @JsonProperty("Departure") 
	    private String departure;
	    @JsonProperty("FlightNo") 
	    private String flightNo;
		public String getArrival() {
			return arrival;
		}
		public void setArrival(String arrival) {
			this.arrival = arrival;
		}
		public String getBaggage() {
			return baggage;
		}
		public void setBaggage(String baggage) {
			this.baggage = baggage;
		}
		public String getDeparture() {
			return departure;
		}
		public void setDeparture(String departure) {
			this.departure = departure;
		}
		public String getFlightNo() {
			return flightNo;
		}
		public void setFlightNo(String flightNo) {
			this.flightNo = flightNo;
		}
		public BaggageInfo(String arrival, String baggage, String departure, String flightNo) {
			super();
			this.arrival = arrival;
			this.baggage = baggage;
			this.departure = departure;
			this.flightNo = flightNo;
		}
		public BaggageInfo() {
			super();
		}
	    

}
