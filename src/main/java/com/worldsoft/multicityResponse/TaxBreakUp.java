package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TaxBreakUp {
	@JsonProperty("Amount")
	public String amount;
	@JsonProperty("TaxCode")
	public String taxCode;

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public TaxBreakUp(String amount, String taxCode) {
		super();
		this.amount = amount;
		this.taxCode = taxCode;
	}

	public TaxBreakUp() {
		super();
	}

}
