package com.worldsoft.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OperatingAirline {
	 @JsonProperty("Code") 
	    private String code;
	    @JsonProperty("Equipment") 
	    private String equipment;
	    @JsonProperty("FlightNumber") 
	    private String flightNumber;
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getEquipment() {
			return equipment;
		}
		public void setEquipment(String equipment) {
			this.equipment = equipment;
		}
		public String getFlightNumber() {
			return flightNumber;
		}
		public void setFlightNumber(String flightNumber) {
			this.flightNumber = flightNumber;
		}
		public OperatingAirline(String code, String equipment, String flightNumber) {
			super();
			this.code = code;
			this.equipment = equipment;
			this.flightNumber = flightNumber;
		}
		public OperatingAirline() {
			super();
		}
	    

}
