package com.worldsoft.entities.response;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PassengerFare {
	 @JsonProperty("BaseFare") 
	    private BaseFare baseFare;
	    @JsonProperty("EquivFare") 
	    private EquivFare equivFare;
	    @JsonProperty("Surcharges") 
	    private ArrayList<Object> surcharges;
	    @JsonProperty("Taxes") 
	    private ArrayList<Taxis> taxes;
	    @JsonProperty("TotalFare") 
	    private TotalFare totalFare;
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
		public ArrayList<Object> getSurcharges() {
			return surcharges;
		}
		public void setSurcharges(ArrayList<Object> surcharges) {
			this.surcharges = surcharges;
		}
		public ArrayList<Taxis> getTaxes() {
			return taxes;
		}
		public void setTaxes(ArrayList<Taxis> taxes) {
			this.taxes = taxes;
		}
		public TotalFare getTotalFare() {
			return totalFare;
		}
		public void setTotalFare(TotalFare totalFare) {
			this.totalFare = totalFare;
		}
		public PassengerFare(BaseFare baseFare, EquivFare equivFare, ArrayList<Object> surcharges,
				ArrayList<Taxis> taxes, TotalFare totalFare) {
			super();
			this.baseFare = baseFare;
			this.equivFare = equivFare;
			this.surcharges = surcharges;
			this.taxes = taxes;
			this.totalFare = totalFare;
		}
		public PassengerFare() {
			super();
		}
	    
	}


