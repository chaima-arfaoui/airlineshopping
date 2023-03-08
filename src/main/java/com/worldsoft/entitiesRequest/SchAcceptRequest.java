package com.worldsoft.entitiesRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SchAcceptRequest {
	@JsonProperty("ActionType")
	private String actionType;
	@JsonProperty("MFRef")
	private String mFRef;

	public String getActionType() {
		return actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getmFRef() {
		return mFRef;
	}

	public void setmFRef(String mFRef) {
		this.mFRef = mFRef;
	}

	public SchAcceptRequest(String actionType, String mFRef) {
		super();
		this.actionType = actionType;
		this.mFRef = mFRef;
	}

	public SchAcceptRequest() {
		super();
	}

}
