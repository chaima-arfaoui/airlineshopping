package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VoidQuote {
	@JsonProperty("FirstName")
	private String firstName;
	@JsonProperty("LastName")
	private String lastName;
	@JsonProperty("Title")
	private String title;
	@JsonProperty("PassengerType")
	private String passengerType;
	@JsonProperty("ETicket")
	private String eTicket;
	@JsonProperty("AdminCharges")
	private String adminCharges;
	@JsonProperty("GSTCharge")
	private String gSTCharge;
	@JsonProperty("TotalVoidingFee")
	private String totalVoidingFee;
	@JsonProperty("TotalRefundAmount")
	private String totalRefundAmount;
	@JsonProperty("Currency")
	private String currency;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	public String geteTicket() {
		return eTicket;
	}

	public void seteTicket(String eTicket) {
		this.eTicket = eTicket;
	}

	public String getAdminCharges() {
		return adminCharges;
	}

	public void setAdminCharges(String adminCharges) {
		this.adminCharges = adminCharges;
	}

	public String getgSTCharge() {
		return gSTCharge;
	}

	public void setgSTCharge(String gSTCharge) {
		this.gSTCharge = gSTCharge;
	}

	public String getTotalVoidingFee() {
		return totalVoidingFee;
	}

	public void setTotalVoidingFee(String totalVoidingFee) {
		this.totalVoidingFee = totalVoidingFee;
	}

	public String getTotalRefundAmount() {
		return totalRefundAmount;
	}

	public void setTotalRefundAmount(String totalRefundAmount) {
		this.totalRefundAmount = totalRefundAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public VoidQuote(String firstName, String lastName, String title, String passengerType, String eTicket,
			String adminCharges, String gSTCharge, String totalVoidingFee, String totalRefundAmount, String currency) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.passengerType = passengerType;
		this.eTicket = eTicket;
		this.adminCharges = adminCharges;
		this.gSTCharge = gSTCharge;
		this.totalVoidingFee = totalVoidingFee;
		this.totalRefundAmount = totalRefundAmount;
		this.currency = currency;
	}

	public VoidQuote() {
		super();
	}

}
