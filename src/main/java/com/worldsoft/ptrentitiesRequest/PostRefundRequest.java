package com.worldsoft.ptrentitiesRequest;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PostRefundRequest {
	private String ptrType;
	private String mFRef;
	private ArrayList<Passenger> passengers;
	@JsonProperty("PtrId")
	private int ptrId;
	@JsonProperty("PreferenceOption")
	private int preferenceOption;
	@JsonProperty("AcceptQuote")
	private String acceptQuote;
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

	public int getPtrId() {
		return ptrId;
	}

	public void setPtrId(int ptrId) {
		this.ptrId = ptrId;
	}

	public int getPreferenceOption() {
		return preferenceOption;
	}

	public void setPreferenceOption(int preferenceOption) {
		this.preferenceOption = preferenceOption;
	}

	public String getAcceptQuote() {
		return acceptQuote;
	}

	public void setAcceptQuote(String acceptQuote) {
		this.acceptQuote = acceptQuote;
	}

	public String getAdditionalNote() {
		return additionalNote;
	}

	public void setAdditionalNote(String additionalNote) {
		this.additionalNote = additionalNote;
	}

	public PostRefundRequest(String ptrType, String mFRef, ArrayList<Passenger> passengers, int ptrId, int preferenceOption,
			String acceptQuote, String additionalNote) {
		super();
		this.ptrType = ptrType;
		this.mFRef = mFRef;
		this.passengers = passengers;
		this.ptrId = ptrId;
		this.preferenceOption = preferenceOption;
		this.acceptQuote = acceptQuote;
		this.additionalNote = additionalNote;
	}

	public PostRefundRequest() {
		super();
	}

}
