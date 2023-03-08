package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItinTotalFare {
	 @JsonProperty("ActualFare") 
	    private ActualFare actualFare;
	    @JsonProperty("BaseFare") 
	    private BaseFare baseFare;
	    @JsonProperty("EquivFare") 
	    private EquivFare equivFare;
	    @JsonProperty("TotalFare") 
	    private TotalFare totalFare;
	    @JsonProperty("TotalTax") 
	    private TotalTax totalTax;
		public ActualFare getActualFare() {
			return actualFare;
		}
		public void setActualFare(ActualFare actualFare) {
			this.actualFare = actualFare;
		}
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
		public TotalFare getTotalFare() {
			return totalFare;
		}
		public void setTotalFare(TotalFare totalFare) {
			this.totalFare = totalFare;
		}
		public TotalTax getTotalTax() {
			return totalTax;
		}
		public void setTotalTax(TotalTax totalTax) {
			this.totalTax = totalTax;
		}
		public ItinTotalFare(ActualFare actualFare, BaseFare baseFare, EquivFare equivFare, TotalFare totalFare,
				TotalTax totalTax) {
			super();
			this.actualFare = actualFare;
			this.baseFare = baseFare;
			this.equivFare = equivFare;
			this.totalFare = totalFare;
			this.totalTax = totalTax;
		}
		public ItinTotalFare() {
			super();
		}

}
