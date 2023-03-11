package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TripDetailsPassengerFare {
	@JsonProperty("EquiFare")
	private EquiFare equiFare;
	@JsonProperty("Tax")
	private Tax tax;
	@JsonProperty("ServiceTax")
	private ServiceTax serviceTax;
	@JsonProperty("TotalFare")
	private TotalFare totalFare;
	@JsonProperty("AirportTaxBreakUp")
	private String airportTaxBreakUp;

	public EquiFare getEquiFare() {
		return equiFare;
	}

	public void setEquiFare(EquiFare equiFare) {
		this.equiFare = equiFare;
	}

	public Tax getTax() {
		return tax;
	}

	public void setTax(Tax tax) {
		this.tax = tax;
	}

	public ServiceTax getServiceTax() {
		return serviceTax;
	}

	public void setServiceTax(ServiceTax serviceTax) {
		this.serviceTax = serviceTax;
	}

	public TotalFare getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(TotalFare totalFare) {
		this.totalFare = totalFare;
	}

	public String getAirportTaxBreakUp() {
		return airportTaxBreakUp;
	}

	public void setAirportTaxBreakUp(String airportTaxBreakUp) {
		this.airportTaxBreakUp = airportTaxBreakUp;
	}

	public TripDetailsPassengerFare(EquiFare equiFare, Tax tax, ServiceTax serviceTax, TotalFare totalFare,
			String airportTaxBreakUp) {
		super();
		this.equiFare = equiFare;
		this.tax = tax;
		this.serviceTax = serviceTax;
		this.totalFare = totalFare;
		this.airportTaxBreakUp = airportTaxBreakUp;
	}

	public TripDetailsPassengerFare() {
		super();
	}

}
