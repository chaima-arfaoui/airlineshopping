package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataReissueQuote {
	@JsonProperty("PTRId")
	public int pTRId;
	@JsonProperty("PTRType")
	public String pTRType;
	@JsonProperty("MFRef")
	public String mFRef;
	@JsonProperty("SLAInMinutes")
	public int sLAInMinutes;
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

	public int getsLAInMinutes() {
		return sLAInMinutes;
	}

	public void setsLAInMinutes(int sLAInMinutes) {
		this.sLAInMinutes = sLAInMinutes;
	}

	public String getpTRStatus() {
		return pTRStatus;
	}

	public void setpTRStatus(String pTRStatus) {
		this.pTRStatus = pTRStatus;
	}

	public DataReissueQuote(int pTRId, String pTRType, String mFRef, int sLAInMinutes, String pTRStatus) {
		super();
		this.pTRId = pTRId;
		this.pTRType = pTRType;
		this.mFRef = mFRef;
		this.sLAInMinutes = sLAInMinutes;
		this.pTRStatus = pTRStatus;
	}

	public DataReissueQuote() {
		super();
	}

}
