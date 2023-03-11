package com.worldsoft.ptrentitiesResponse;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DatavoidQuote {
	@JsonProperty("PTRId")
	private int pTRId;
	@JsonProperty("PTRType")
	private String pTRType;
	@JsonProperty("MFRef")
	private String mFRef;
	@JsonProperty("SLAInMinutes")
	private int sLAInMinutes;
	@JsonProperty("PTRStatus")
	private String pTRStatus;
	@JsonProperty("VoidingWindow")
	private Date voidingWindow;
	@JsonProperty("VoidQuotes")
	private ArrayList<VoidQuote> voidQuotes;

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

	public Date getVoidingWindow() {
		return voidingWindow;
	}

	public void setVoidingWindow(Date voidingWindow) {
		this.voidingWindow = voidingWindow;
	}

	public ArrayList<VoidQuote> getVoidQuotes() {
		return voidQuotes;
	}

	public void setVoidQuotes(ArrayList<VoidQuote> voidQuotes) {
		this.voidQuotes = voidQuotes;
	}

	public DatavoidQuote(int pTRId, String pTRType, String mFRef, int sLAInMinutes, String pTRStatus,
			Date voidingWindow, ArrayList<VoidQuote> voidQuotes) {
		super();
		this.pTRId = pTRId;
		this.pTRType = pTRType;
		this.mFRef = mFRef;
		this.sLAInMinutes = sLAInMinutes;
		this.pTRStatus = pTRStatus;
		this.voidingWindow = voidingWindow;
		this.voidQuotes = voidQuotes;
	}

	public DatavoidQuote() {
		super();
	}

}
