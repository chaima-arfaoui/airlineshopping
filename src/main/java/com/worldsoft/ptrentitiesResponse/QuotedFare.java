package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuotedFare {
	@JsonProperty("PassengerType")
	private String passengerType;
	@JsonProperty("BaseFareDifference")
	private int baseFareDifference;
	@JsonProperty("TaxDifference")
	private int taxDifference;
	@JsonProperty("AdminFee")
	private int adminFee;
	@JsonProperty("GST")
	private int gST;
	@JsonProperty("NoShowPenalty")
	private int noShowPenalty;
	@JsonProperty("Currency")
	private String currency;
	@JsonProperty("Penalty")
	private int penalty;
	@JsonProperty("PassengerCount")
	private int passengerCount;
	@JsonProperty("TotalFareDifference")
	private int totalFareDifference;

	public String getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	public int getBaseFareDifference() {
		return baseFareDifference;
	}

	public void setBaseFareDifference(int baseFareDifference) {
		this.baseFareDifference = baseFareDifference;
	}

	public int getTaxDifference() {
		return taxDifference;
	}

	public void setTaxDifference(int taxDifference) {
		this.taxDifference = taxDifference;
	}

	public int getAdminFee() {
		return adminFee;
	}

	public void setAdminFee(int adminFee) {
		this.adminFee = adminFee;
	}

	public int getgST() {
		return gST;
	}

	public void setgST(int gST) {
		this.gST = gST;
	}

	public int getNoShowPenalty() {
		return noShowPenalty;
	}

	public void setNoShowPenalty(int noShowPenalty) {
		this.noShowPenalty = noShowPenalty;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getPenalty() {
		return penalty;
	}

	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}

	public int getTotalFareDifference() {
		return totalFareDifference;
	}

	public void setTotalFareDifference(int totalFareDifference) {
		this.totalFareDifference = totalFareDifference;
	}

	public QuotedFare(String passengerType, int baseFareDifference, int taxDifference, int adminFee, int gST,
			int noShowPenalty, String currency, int penalty, int passengerCount, int totalFareDifference) {
		super();
		this.passengerType = passengerType;
		this.baseFareDifference = baseFareDifference;
		this.taxDifference = taxDifference;
		this.adminFee = adminFee;
		this.gST = gST;
		this.noShowPenalty = noShowPenalty;
		this.currency = currency;
		this.penalty = penalty;
		this.passengerCount = passengerCount;
		this.totalFareDifference = totalFareDifference;
	}

	public QuotedFare() {
		super();
	}

}
