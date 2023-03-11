package com.worldsoft.ptrentitiesRequest;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VoidQuoteRequest {
	private String ptrType;
	private String mFRef;
	@JsonProperty("AllowChildPassenger")
	private boolean allowChildPassenger;
	private ArrayList<Passenger> passengers;

	public String getPtrType() {
		return ptrType;
	}

	public void setPtrType(String ptrType) {
		this.ptrType = ptrType;
	}

	public String getmFRef() {
		return mFRef;
	}

	public void setmFRef(String mFRef) {
		this.mFRef = mFRef;
	}

	public boolean isAllowChildPassenger() {
		return allowChildPassenger;
	}

	public void setAllowChildPassenger(boolean allowChildPassenger) {
		this.allowChildPassenger = allowChildPassenger;
	}

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
	}

	public VoidQuoteRequest(String ptrType, String mFRef, boolean allowChildPassenger,
			ArrayList<Passenger> passengers) {
		super();
		this.ptrType = ptrType;
		this.mFRef = mFRef;
		this.allowChildPassenger = allowChildPassenger;
		this.passengers = passengers;
	}

	public VoidQuoteRequest() {
		super();
	}

}
