package com.worldsoft.multicityRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TripDetailsRequest {
	  @JsonProperty("BookingRef") 
	    private String bookingRef;

	public String getBookingRef() {
		return bookingRef;
	}

	public void setBookingRef(String bookingRef) {
		this.bookingRef = bookingRef;
	}

	public TripDetailsRequest(String bookingRef) {
		super();
		this.bookingRef = bookingRef;
	}

	public TripDetailsRequest() {
		super();
	}
	  

}
