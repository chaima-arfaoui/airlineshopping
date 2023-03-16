package com.worldsoft.ptrentitiesRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AcceptReissueQuoteRequest {
	private String ptrType;
	private String mFRef;
	@JsonProperty("PTRId")
	private int pTRId;
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

	public int getpTRId() {
		return pTRId;
	}

	public void setpTRId(int pTRId) {
		this.pTRId = pTRId;
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

	public AcceptReissueQuoteRequest(String ptrType, String mFRef, int pTRId, int preferenceOption, String acceptQuote,
			String additionalNote) {
		super();
		this.ptrType = ptrType;
		this.mFRef = mFRef;
		this.pTRId = pTRId;
		this.preferenceOption = preferenceOption;
		this.acceptQuote = acceptQuote;
		this.additionalNote = additionalNote;
	}

	public AcceptReissueQuoteRequest() {
		super();
	}

}
