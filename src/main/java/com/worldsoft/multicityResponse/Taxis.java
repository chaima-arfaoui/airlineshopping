package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Taxis {
	@JsonProperty("Amount")
	private String amount;
	@JsonProperty("CurrencyCode")
	private String currencyCode;
	@JsonProperty("TaxCode")
	private Object taxCode;
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

	public Object getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(Object taxCode) {
		this.taxCode = taxCode;
	}

	public int getDecimalPlaces() {
		return decimalPlaces;
	}

	public void setDecimalPlaces(int decimalPlaces) {
		this.decimalPlaces = decimalPlaces;
	}

	public Taxis(String amount, String currencyCode, Object taxCode, int decimalPlaces) {
		super();
		this.amount = amount;
		this.currencyCode = currencyCode;
		this.taxCode = taxCode;
		this.decimalPlaces = decimalPlaces;
	}

	public Taxis() {
		super();
	}

}
