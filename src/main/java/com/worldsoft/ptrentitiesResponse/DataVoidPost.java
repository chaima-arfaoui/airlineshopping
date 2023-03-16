package com.worldsoft.ptrentitiesResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataVoidPost {
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
	@JsonProperty("VoidQuotes")
	public ArrayList<VoidQuote> voidQuotes;

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

	public ArrayList<VoidQuote> getVoidQuotes() {
		return voidQuotes;
	}

	public void setVoidQuotes(ArrayList<VoidQuote> voidQuotes) {
		this.voidQuotes = voidQuotes;
	}

	public DataVoidPost(int pTRId, String pTRType, String mFRef, int sLAInMinutes, String pTRStatus,
			ArrayList<VoidQuote> voidQuotes) {
		super();
		this.pTRId = pTRId;
		this.pTRType = pTRType;
		this.mFRef = mFRef;
		this.sLAInMinutes = sLAInMinutes;
		this.pTRStatus = pTRStatus;
		this.voidQuotes = voidQuotes;
	}

	public DataVoidPost() {
		super();
	}

}
