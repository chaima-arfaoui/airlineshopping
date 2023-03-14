package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PenaltiesInfo {
	@JsonProperty("Amount")
	private String amount;
	@JsonProperty("CurrencyCode")
	private String currencyCode;
	@JsonProperty("Allowed")
	private boolean allowed;
	@JsonProperty("PenaltyType")
	private String penaltyType;

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

	public boolean isAllowed() {
		return allowed;
	}

	public void setAllowed(boolean allowed) {
		this.allowed = allowed;
	}

	public String getPenaltyType() {
		return penaltyType;
	}

	public void setPenaltyType(String penaltyType) {
		this.penaltyType = penaltyType;
	}

	public PenaltiesInfo(String amount, String currencyCode, boolean allowed, String penaltyType) {
		super();
		this.amount = amount;
		this.currencyCode = currencyCode;
		this.allowed = allowed;
		this.penaltyType = penaltyType;
	}

	public PenaltiesInfo() {
		super();
	}

}
