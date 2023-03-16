package com.worldsoft.ptrentitiesRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarkasreadRequest {
	private String id;
	private String requestType;
	@JsonProperty("MFRef")
	private String mFRef;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getmFRef() {
		return mFRef;
	}

	public void setmFRef(String mFRef) {
		this.mFRef = mFRef;
	}

	public MarkasreadRequest(String id, String requestType, String mFRef) {
		super();
		this.id = id;
		this.requestType = requestType;
		this.mFRef = mFRef;
	}

	public MarkasreadRequest() {
		super();
	}

}
