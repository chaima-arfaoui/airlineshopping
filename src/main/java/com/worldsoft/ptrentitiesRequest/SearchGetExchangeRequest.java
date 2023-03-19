package com.worldsoft.ptrentitiesRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchGetExchangeRequest {
	private String ptrType;
	@JsonProperty("MFRef")
	private String mFRef;
	@JsonProperty("PTRId")
	private int pTRId;
	@JsonProperty("Page")
	private int page;

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

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public SearchGetExchangeRequest(String ptrType, String mFRef, int pTRId, int page) {
		super();
		this.ptrType = ptrType;
		this.mFRef = mFRef;
		this.pTRId = pTRId;
		this.page = page;
	}

	public SearchGetExchangeRequest() {
		super();
	}

}
