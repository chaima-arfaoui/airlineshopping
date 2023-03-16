package com.worldsoft.ptrentitiesRequest;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ReissueQuoteRequest {
	public String ptrType;
	public String mFRef;
	@JsonProperty("AllowChildPassenger")
	public boolean allowChildPassenger;
	public String reissueQuoteRequestType;
	public ArrayList<Passenger> passengers;
	public ArrayList<OriginDestination> originDestinations;

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

	public String getReissueQuoteRequestType() {
		return reissueQuoteRequestType;
	}

	public void setReissueQuoteRequestType(String reissueQuoteRequestType) {
		this.reissueQuoteRequestType = reissueQuoteRequestType;
	}

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
	}

	public ArrayList<OriginDestination> getOriginDestinations() {
		return originDestinations;
	}

	public void setOriginDestinations(ArrayList<OriginDestination> originDestinations) {
		this.originDestinations = originDestinations;
	}

	public ReissueQuoteRequest(String ptrType, String mFRef, boolean allowChildPassenger,
			String reissueQuoteRequestType, ArrayList<Passenger> passengers,
			ArrayList<OriginDestination> originDestinations) {
		super();
		this.ptrType = ptrType;
		this.mFRef = mFRef;
		this.allowChildPassenger = allowChildPassenger;
		this.reissueQuoteRequestType = reissueQuoteRequestType;
		this.passengers = passengers;
		this.originDestinations = originDestinations;
	}

	public ReissueQuoteRequest() {
		super();
	}

}
