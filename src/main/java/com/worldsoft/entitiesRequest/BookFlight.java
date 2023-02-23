package com.worldsoft.entitiesRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookFlight {
	 @JsonProperty("FareSourceCode") 
	 private String fareSourceCode;
	    @JsonProperty("TravelerInfo") 
	    private TravelerInfo travelerInfo;
	    @JsonProperty("Target") 
	    private String target;
		public String getFareSourceCode() {
			return fareSourceCode;
		}
		public void setFareSourceCode(String fareSourceCode) {
			this.fareSourceCode = fareSourceCode;
		}
		public TravelerInfo getTravelerInfo() {
			return travelerInfo;
		}
		public void setTravelerInfo(TravelerInfo travelerInfo) {
			this.travelerInfo = travelerInfo;
		}
		public String getTarget() {
			return target;
		}
		public void setTarget(String target) {
			this.target = target;
		}
		public BookFlight(String fareSourceCode, TravelerInfo travelerInfo, String target) {
			super();
			this.fareSourceCode = fareSourceCode;
			this.travelerInfo = travelerInfo;
			this.target = target;
		}
		public BookFlight() {
			
		}
	    

}
