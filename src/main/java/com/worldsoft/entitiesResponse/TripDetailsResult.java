package com.worldsoft.entitiesResponse;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TripDetailsResult {
	@JsonProperty("Provider") 
    private String provider;
    @JsonProperty("Success") 
    private boolean success;
    @JsonProperty("TravelItinerary") 
    private TravelItinerary travelItinerary;
    @JsonProperty("BookingCreatedOn") 
    private Date bookingCreatedOn;
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public TravelItinerary getTravelItinerary() {
		return travelItinerary;
	}
	public void setTravelItinerary(TravelItinerary travelItinerary) {
		this.travelItinerary = travelItinerary;
	}
	public Date getBookingCreatedOn() {
		return bookingCreatedOn;
	}
	public void setBookingCreatedOn(Date bookingCreatedOn) {
		this.bookingCreatedOn = bookingCreatedOn;
	}
	public TripDetailsResult(String provider, boolean success, TravelItinerary travelItinerary,
			Date bookingCreatedOn) {
		super();
		this.provider = provider;
		this.success = success;
		this.travelItinerary = travelItinerary;
		this.bookingCreatedOn = bookingCreatedOn;
	}
	public TripDetailsResult() {
		super();
	}
    

}
