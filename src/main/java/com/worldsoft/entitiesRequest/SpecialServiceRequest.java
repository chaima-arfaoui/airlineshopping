package com.worldsoft.entitiesRequest;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SpecialServiceRequest {
	  @JsonProperty("SeatPreference") 
	    private String seatPreference;
	    @JsonProperty("MealPreference") 
	    private String mealPreference;
	    @JsonProperty("RequestedSegments") 
	    private ArrayList<RequestedSegment> requestedSegments;
		public String getSeatPreference() {
			return seatPreference;
		}
		public void setSeatPreference(String seatPreference) {
			this.seatPreference = seatPreference;
		}
		public String getMealPreference() {
			return mealPreference;
		}
		public void setMealPreference(String mealPreference) {
			this.mealPreference = mealPreference;
		}
		public ArrayList<RequestedSegment> getRequestedSegments() {
			return requestedSegments;
		}
		public void setRequestedSegments(ArrayList<RequestedSegment> requestedSegments) {
			this.requestedSegments = requestedSegments;
		}
		public SpecialServiceRequest(String seatPreference, String mealPreference,
				ArrayList<RequestedSegment> requestedSegments) {
			super();
			this.seatPreference = seatPreference;
			this.mealPreference = mealPreference;
			this.requestedSegments = requestedSegments;
		}
		public SpecialServiceRequest() {
			super();
		}
	    

}
