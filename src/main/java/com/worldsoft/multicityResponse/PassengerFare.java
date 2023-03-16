package com.worldsoft.multicityResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PassengerFare {
	@JsonProperty("PaxType")
	public String paxType;
	@JsonProperty("Quantity")
	public int quantity;
	@JsonProperty("BaseFare")
	public String baseFare;
	@JsonProperty("TaxBreakUp")
	public ArrayList<TaxBreakUp> taxBreakUp;
	@JsonProperty("TotalFare")
	public String totalFare;

	public String getPaxType() {
		return paxType;
	}

	public void setPaxType(String paxType) {
		this.paxType = paxType;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(String baseFare) {
		this.baseFare = baseFare;
	}

	public ArrayList<TaxBreakUp> getTaxBreakUp() {
		return taxBreakUp;
	}

	public void setTaxBreakUp(ArrayList<TaxBreakUp> taxBreakUp) {
		this.taxBreakUp = taxBreakUp;
	}

	public String getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(String totalFare) {
		this.totalFare = totalFare;
	}

	public PassengerFare(String paxType, int quantity, String baseFare, ArrayList<TaxBreakUp> taxBreakUp,
			String totalFare) {
		super();
		this.paxType = paxType;
		this.quantity = quantity;
		this.baseFare = baseFare;
		this.taxBreakUp = taxBreakUp;
		this.totalFare = totalFare;
	}

	public PassengerFare() {
		super();
	}

}
