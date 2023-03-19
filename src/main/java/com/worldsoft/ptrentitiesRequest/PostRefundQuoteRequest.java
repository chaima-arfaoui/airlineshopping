package com.worldsoft.ptrentitiesRequest;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRefundQuoteRequest {
	private String ptrType;
	private String mFRef;
	private ArrayList<Passenger> passengers;
	@JsonProperty("AdditionalNote")
	private String additionalNote;

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

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
	}

	public String getAdditionalNote() {
		return additionalNote;
	}

	public void setAdditionalNote(String additionalNote) {
		this.additionalNote = additionalNote;
	}

	public PostRefundQuoteRequest(String ptrType, String mFRef, ArrayList<Passenger> passengers, String additionalNote) {
		super();
		this.ptrType = ptrType;
		this.mFRef = mFRef;
		this.passengers = passengers;
		this.additionalNote = additionalNote;
	}

	public PostRefundQuoteRequest() {
		super();
	}

}
