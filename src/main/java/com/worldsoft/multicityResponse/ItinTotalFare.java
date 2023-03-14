package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItinTotalFare {
	@JsonProperty("BaseFare")
	private BaseFare baseFare;
	@JsonProperty("EquivFare")
	private EquivFare equivFare;
	@JsonProperty("TotalTax")
	private TotalTax totalTax;
	@JsonProperty("ServiceTax")
	private Object serviceTax;
	@JsonProperty("TotalFare")
	private TotalFare totalFare;
	@JsonProperty("ActualFare")
	private ActualFare actualFare;

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

	public TotalTax getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(TotalTax totalTax) {
		this.totalTax = totalTax;
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

	public ItinTotalFare(BaseFare baseFare, EquivFare equivFare, TotalTax totalTax, Object serviceTax,
			TotalFare totalFare, ActualFare actualFare) {
		super();
		this.baseFare = baseFare;
		this.equivFare = equivFare;
		this.totalTax = totalTax;
		this.serviceTax = serviceTax;
		this.totalFare = totalFare;
		this.actualFare = actualFare;
	}

	public ItinTotalFare() {
		super();
	}

}
