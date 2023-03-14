package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseFare {
	@JsonProperty("Amount")
	private String amount;
	@JsonProperty("CurrencyCode")
	private String currencyCode;
	@JsonProperty("DecimalPlaces")
	private int decimalPlaces;

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

	public int getDecimalPlaces() {
		return decimalPlaces;
	}

	public void setDecimalPlaces(int decimalPlaces) {
		this.decimalPlaces = decimalPlaces;
	}

	public BaseFare(String amount, String currencyCode, int decimalPlaces) {
		super();
		this.amount = amount;
		this.currencyCode = currencyCode;
		this.decimalPlaces = decimalPlaces;
	}

	public BaseFare() {
		super();
	}

}
