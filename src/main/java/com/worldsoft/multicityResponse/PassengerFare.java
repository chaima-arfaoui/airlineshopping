package com.worldsoft.multicityResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PassengerFare {
	@JsonProperty("BaseFare")
	private BaseFare baseFare;
	@JsonProperty("EquivFare")
	private EquivFare equivFare;
	@JsonProperty("Taxes")
	private ArrayList<Taxis> taxes;
	@JsonProperty("ServiceTax")
	private Object serviceTax;
	@JsonProperty("TotalFare")
	private TotalFare totalFare;
	@JsonProperty("ActualFare")
	private ActualFare actualFare;
	@JsonProperty("Surcharges")
	private ArrayList<Object> surcharges;

	public BaseFare getBaseFare() {
		return baseFare;
	}

	public void setBaseFare(BaseFare baseFare) {
		this.baseFare = baseFare;
	}

	public EquivFare getEquivFare() {
		return equivFare;
	}

	public void setEquivFare(EquivFare equivFare) {
		this.equivFare = equivFare;
	}

	public ArrayList<Taxis> getTaxes() {
		return taxes;
	}

	public void setTaxes(ArrayList<Taxis> taxes) {
		this.taxes = taxes;
	}

	public Object getServiceTax() {
		return serviceTax;
	}

	public void setServiceTax(Object serviceTax) {
		this.serviceTax = serviceTax;
	}

	public TotalFare getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(TotalFare totalFare) {
		this.totalFare = totalFare;
	}

	public ActualFare getActualFare() {
		return actualFare;
	}

	public void setActualFare(ActualFare actualFare) {
		this.actualFare = actualFare;
	}

	public ArrayList<Object> getSurcharges() {
		return surcharges;
	}

	public void setSurcharges(ArrayList<Object> surcharges) {
		this.surcharges = surcharges;
	}

	public PassengerFare(BaseFare baseFare, EquivFare equivFare, ArrayList<Taxis> taxes, Object serviceTax,
			TotalFare totalFare, ActualFare actualFare, ArrayList<Object> surcharges) {
		super();
		this.baseFare = baseFare;
		this.equivFare = equivFare;
		this.taxes = taxes;
		this.serviceTax = serviceTax;
		this.totalFare = totalFare;
		this.actualFare = actualFare;
		this.surcharges = surcharges;
	}

	public PassengerFare() {
		super();
	}

}
