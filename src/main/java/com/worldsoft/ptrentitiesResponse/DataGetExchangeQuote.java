package com.worldsoft.ptrentitiesResponse;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataGetExchangeQuote {
	@JsonProperty("PTRId")
	private int pTRId;
	@JsonProperty("PTRType")
	private String pTRType;
	@JsonProperty("Status")
	private String status;
	@JsonProperty("MFRef")
	private String mFRef;
	@JsonProperty("CreatedOn")
	private Date createdOn;
	@JsonProperty("RequestCompletionTime")
	private Date requestCompletionTime;
	@JsonProperty("CreatedByName")
	private String createdByName;
	@JsonProperty("Resolution")
	private String resolution;
	@JsonProperty("Passengers")
	private ArrayList<Passenger> passengers;
	@JsonProperty("RequestedPreferences")
	private ArrayList<RequestedPreference> requestedPreferences;

	public int getpTRId() {
		return pTRId;
	}

	public void setpTRId(int pTRId) {
		this.pTRId = pTRId;
	}

	public String getpTRType() {
		return pTRType;
	}

	public void setpTRType(String pTRType) {
		this.pTRType = pTRType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getmFRef() {
		return mFRef;
	}

	public void setmFRef(String mFRef) {
		this.mFRef = mFRef;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getRequestCompletionTime() {
		return requestCompletionTime;
	}

	public void setRequestCompletionTime(Date requestCompletionTime) {
		this.requestCompletionTime = requestCompletionTime;
	}

	public String getCreatedByName() {
		return createdByName;
	}

	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(ArrayList<Passenger> passengers) {
		this.passengers = passengers;
	}

	public ArrayList<RequestedPreference> getRequestedPreferences() {
		return requestedPreferences;
	}

	public void setRequestedPreferences(ArrayList<RequestedPreference> requestedPreferences) {
		this.requestedPreferences = requestedPreferences;
	}

	public DataGetExchangeQuote(int pTRId, String pTRType, String status, String mFRef, Date createdOn,
			Date requestCompletionTime, String createdByName, String resolution, ArrayList<Passenger> passengers,
			ArrayList<RequestedPreference> requestedPreferences) {
		super();
		this.pTRId = pTRId;
		this.pTRType = pTRType;
		this.status = status;
		this.mFRef = mFRef;
		this.createdOn = createdOn;
		this.requestCompletionTime = requestCompletionTime;
		this.createdByName = createdByName;
		this.resolution = resolution;
		this.passengers = passengers;
		this.requestedPreferences = requestedPreferences;
	}

	public DataGetExchangeQuote() {
		super();
	}

}
