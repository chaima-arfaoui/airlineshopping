package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Taxis {
	 @JsonProperty("Amount") 
	    private String amount;
	    @JsonProperty("CurrencyCode") 
	    private String currencyCode;
	    @JsonProperty("DecimalPlaces") 
	    private int decimalPlaces;
	    @JsonProperty("TaxCode") 
	    private String taxCode;
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
		public String getTaxCode() {
			return taxCode;
		}
		public void setTaxCode(String taxCode) {
			this.taxCode = taxCode;
		}
		public Taxis(String amount, String currencyCode, int decimalPlaces, String taxCode) {
			super();
			this.amount = amount;
			this.currencyCode = currencyCode;
			this.decimalPlaces = decimalPlaces;
			this.taxCode = taxCode;
		}
		public Taxis() {
			super();
		}
	    
}
