package com.worldsoft.ptrentitiesRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VoidSearchRequest {
	public String ptrType;
	@JsonProperty("MFRef")
	public String mFRef;
	@JsonProperty("PTRId")
	public int pTRId;
	@JsonProperty("Page")
	public int page;

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

	public VoidSearchRequest(String ptrType, String mFRef, int pTRId, int page) {
		super();
		this.ptrType = ptrType;
		this.mFRef = mFRef;
		this.pTRId = pTRId;
		this.page = page;
	}

	public VoidSearchRequest() {
		super();
	}

}
