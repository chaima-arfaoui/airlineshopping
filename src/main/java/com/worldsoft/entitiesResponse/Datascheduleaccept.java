package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Datascheduleaccept {
	@JsonProperty("PTRId")
	public int pTRId;
	@JsonProperty("PTRType")
	public String pTRType;
	@JsonProperty("MFRef")
	public String mFRef;
	@JsonProperty("PTRStatus")
	public String pTRStatus;

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

	public String getmFRef() {
		return mFRef;
	}

	public void setmFRef(String mFRef) {
		this.mFRef = mFRef;
	}

	public String getpTRStatus() {
		return pTRStatus;
	}

	public void setpTRStatus(String pTRStatus) {
		this.pTRStatus = pTRStatus;
	}

	public Datascheduleaccept(int pTRId, String pTRType, String mFRef, String pTRStatus) {
		super();
		this.pTRId = pTRId;
		this.pTRType = pTRType;
		this.mFRef = mFRef;
		this.pTRStatus = pTRStatus;
	}

	public Datascheduleaccept() {
		super();
	}

}
