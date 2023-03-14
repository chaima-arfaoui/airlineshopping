package com.worldsoft.multicityRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookRequest {
	@JsonProperty("FareSourceCode")
	private String fareSourceCode;
	@JsonProperty("TravelerInfo")
	private TravelerInfo travelerInfo;
	@JsonProperty("Target")
	private String target;
	@JsonProperty("ConversationId")
	private String conversationId;
	@JsonProperty("LccHoldBooking")
	private boolean lccHoldBooking;

	public String getFareSourceCode() {
		return fareSourceCode;
	}

	public void setFareSourceCode(String fareSourceCode) {
		this.fareSourceCode = fareSourceCode;
	}

	public TravelerInfo getTravelerInfo() {
		return travelerInfo;
	}

	public void setTravelerInfo(TravelerInfo travelerInfo) {
		this.travelerInfo = travelerInfo;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public boolean isLccHoldBooking() {
		return lccHoldBooking;
	}

	public void setLccHoldBooking(boolean lccHoldBooking) {
		this.lccHoldBooking = lccHoldBooking;
	}

	public BookRequest(String fareSourceCode, TravelerInfo travelerInfo, String target, String conversationId,
			boolean lccHoldBooking) {
		super();
		this.fareSourceCode = fareSourceCode;
		this.travelerInfo = travelerInfo;
		this.target = target;
		this.conversationId = conversationId;
		this.lccHoldBooking = lccHoldBooking;
	}

	public BookRequest() {
		super();
	}

}
