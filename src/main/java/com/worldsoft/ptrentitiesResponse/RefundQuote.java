package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RefundQuote {
	@JsonProperty("FirstName")
	private String firstName;
	@JsonProperty("LastName")
	private String lastName;
	@JsonProperty("Title")
	private String title;
	@JsonProperty("PassengerType")
	private String passengerType;
	@JsonProperty("Eticket")
	private String eticket;
	@JsonProperty("TotalFare")
	private double totalFare;
	@JsonProperty("UnusedFare")
	private double unusedFare;
	@JsonProperty("CancellationCharge")
	private int cancellationCharge;
	@JsonProperty("NoShowCharge")
	private int noShowCharge;
	@JsonProperty("Tax")
	private int tax;
	@JsonProperty("AdminCharges")
	private int adminCharges;
	@JsonProperty("GSTCharge")
	private int gSTCharge;
	@JsonProperty("TotalRefundCharges")
	private int totalRefundCharges;
	@JsonProperty("TotalRefundAmount")
	private double totalRefundAmount;
	@JsonProperty("Currency")
	private String currency;
	@JsonProperty("YQ_Tax")
	private int yQ_Tax;
	@JsonProperty("YR_Tax")
	private int yR_Tax;
	@JsonProperty("OtherTaxesK3")
	private int otherTaxesK3;

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

	public String getEticket() {
		return eticket;
	}

	public void setEticket(String eticket) {
		this.eticket = eticket;
	}

	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public double getUnusedFare() {
		return unusedFare;
	}

	public void setUnusedFare(double unusedFare) {
		this.unusedFare = unusedFare;
	}

	public int getCancellationCharge() {
		return cancellationCharge;
	}

	public void setCancellationCharge(int cancellationCharge) {
		this.cancellationCharge = cancellationCharge;
	}

	public int getNoShowCharge() {
		return noShowCharge;
	}

	public void setNoShowCharge(int noShowCharge) {
		this.noShowCharge = noShowCharge;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getAdminCharges() {
		return adminCharges;
	}

	public void setAdminCharges(int adminCharges) {
		this.adminCharges = adminCharges;
	}

	public int getgSTCharge() {
		return gSTCharge;
	}

	public void setgSTCharge(int gSTCharge) {
		this.gSTCharge = gSTCharge;
	}

	public int getTotalRefundCharges() {
		return totalRefundCharges;
	}

	public void setTotalRefundCharges(int totalRefundCharges) {
		this.totalRefundCharges = totalRefundCharges;
	}

	public double getTotalRefundAmount() {
		return totalRefundAmount;
	}

	public void setTotalRefundAmount(double totalRefundAmount) {
		this.totalRefundAmount = totalRefundAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getyQ_Tax() {
		return yQ_Tax;
	}

	public void setyQ_Tax(int yQ_Tax) {
		this.yQ_Tax = yQ_Tax;
	}

	public int getyR_Tax() {
		return yR_Tax;
	}

	public void setyR_Tax(int yR_Tax) {
		this.yR_Tax = yR_Tax;
	}

	public int getOtherTaxesK3() {
		return otherTaxesK3;
	}

	public void setOtherTaxesK3(int otherTaxesK3) {
		this.otherTaxesK3 = otherTaxesK3;
	}

	public RefundQuote(String firstName, String lastName, String title, String passengerType, String eticket,
			double totalFare, double unusedFare, int cancellationCharge, int noShowCharge, int tax, int adminCharges,
			int gSTCharge, int totalRefundCharges, double totalRefundAmount, String currency, int yQ_Tax, int yR_Tax,
			int otherTaxesK3) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.passengerType = passengerType;
		this.eticket = eticket;
		this.totalFare = totalFare;
		this.unusedFare = unusedFare;
		this.cancellationCharge = cancellationCharge;
		this.noShowCharge = noShowCharge;
		this.tax = tax;
		this.adminCharges = adminCharges;
		this.gSTCharge = gSTCharge;
		this.totalRefundCharges = totalRefundCharges;
		this.totalRefundAmount = totalRefundAmount;
		this.currency = currency;
		this.yQ_Tax = yQ_Tax;
		this.yR_Tax = yR_Tax;
		this.otherTaxesK3 = otherTaxesK3;
	}

	public RefundQuote() {
		super();
	}

}
