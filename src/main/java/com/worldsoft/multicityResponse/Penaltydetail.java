package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Penaltydetail {
	@JsonProperty("PaxType")
	public String paxType;
	@JsonProperty("RefundPenaltyAmount")
	public String refundPenaltyAmount;
	@JsonProperty("RefundAllowed")
	public boolean refundAllowed;
	@JsonProperty("Currency")
	public String currency;
	@JsonProperty("ChangePenaltyAmount")
	public String changePenaltyAmount;
	@JsonProperty("ChangeAllowed")
	public boolean changeAllowed;

	public String getPaxType() {
		return paxType;
	}

	public void setPaxType(String paxType) {
		this.paxType = paxType;
	}

	public String getRefundPenaltyAmount() {
		return refundPenaltyAmount;
	}

	public void setRefundPenaltyAmount(String refundPenaltyAmount) {
		this.refundPenaltyAmount = refundPenaltyAmount;
	}

	public boolean isRefundAllowed() {
		return refundAllowed;
	}

	public void setRefundAllowed(boolean refundAllowed) {
		this.refundAllowed = refundAllowed;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getChangePenaltyAmount() {
		return changePenaltyAmount;
	}

	public void setChangePenaltyAmount(String changePenaltyAmount) {
		this.changePenaltyAmount = changePenaltyAmount;
	}

	public boolean isChangeAllowed() {
		return changeAllowed;
	}

	public void setChangeAllowed(boolean changeAllowed) {
		this.changeAllowed = changeAllowed;
	}

	public Penaltydetail(String paxType, String refundPenaltyAmount, boolean refundAllowed, String currency,
			String changePenaltyAmount, boolean changeAllowed) {
		super();
		this.paxType = paxType;
		this.refundPenaltyAmount = refundPenaltyAmount;
		this.refundAllowed = refundAllowed;
		this.currency = currency;
		this.changePenaltyAmount = changePenaltyAmount;
		this.changeAllowed = changeAllowed;
	}

	public Penaltydetail() {
		super();
	}

}
