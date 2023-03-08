package com.worldsoft.entitiesResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItineraryInfo {
	 @JsonProperty("ReservationItems") 
	    public ArrayList<ReservationItem> reservationItems;

	public ArrayList<ReservationItem> getReservationItems() {
		return reservationItems;
	}

	public void setReservationItems(ArrayList<ReservationItem> reservationItems) {
		this.reservationItems = reservationItems;
	}

	public ItineraryInfo(ArrayList<ReservationItem> reservationItems) {
		super();
		this.reservationItems = reservationItems;
	}

	public ItineraryInfo() {
		super();
	}
	 
	}
