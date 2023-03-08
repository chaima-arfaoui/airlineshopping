package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PenaltiesInfo {
	@JsonProperty("Allowed")
	private boolean allowed;
	@JsonProperty("Amount")
	private String amount;
	@JsonProperty("CurrencyCode")
	private String currencyCode;
	@JsonProperty("PenaltyType")
	private String penaltyType;

	public boolean isAllowed() {
		return allowed;
	}

	public void setAllowed(boolean allowed) {
		this.allowed = allowed;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getPenaltyType() {
		return penaltyType;
	}

	public void setPenaltyType(String penaltyType) {
		this.penaltyType = penaltyType;
	}

	public PenaltiesInfo(boolean allowed, String amount, String currencyCode, String penaltyType) {
		super();
		this.allowed = allowed;
		this.amount = amount;
		this.currencyCode = currencyCode;
		this.penaltyType = penaltyType;
	}

	public PenaltiesInfo() {
		super();
	}

}
