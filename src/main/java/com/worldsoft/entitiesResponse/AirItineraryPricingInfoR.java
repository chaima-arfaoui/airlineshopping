package com.worldsoft.entitiesResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AirItineraryPricingInfoR {
	 @JsonProperty("DivideInPartyIndicator") 
	    private boolean divideInPartyIndicator;
	    @JsonProperty("FareInfos") 
	    private ArrayList<FareInfo> fareInfos;
	    @JsonProperty("FareSourceCode") 
	    private String fareSourceCode;
	    @JsonProperty("FareType") 
	    private String fareType;
	    @JsonProperty("IsRefundable") 
	    private String isRefundable;
	    @JsonProperty("ItinTotalFare") 
	    private ItinTotalFare itinTotalFare;
	    @JsonProperty("PTC_FareBreakdowns") 
	    private ArrayList<PTCFareBreakdown> pTC_FareBreakdowns;
		public boolean isDivideInPartyIndicator() {
			return divideInPartyIndicator;
		}
		public void setDivideInPartyIndicator(boolean divideInPartyIndicator) {
			this.divideInPartyIndicator = divideInPartyIndicator;
		}
		public ArrayList<FareInfo> getFareInfos() {
			return fareInfos;
		}
		public void setFareInfos(ArrayList<FareInfo> fareInfos) {
			this.fareInfos = fareInfos;
		}
		public String getFareSourceCode() {
			return fareSourceCode;
		}
		public void setFareSourceCode(String fareSourceCode) {
			this.fareSourceCode = fareSourceCode;
		}
		public String getFareType() {
			return fareType;
		}
		public void setFareType(String fareType) {
			this.fareType = fareType;
		}
		public String getIsRefundable() {
			return isRefundable;
		}
		public void setIsRefundable(String isRefundable) {
			this.isRefundable = isRefundable;
		}
		public ItinTotalFare getItinTotalFare() {
			return itinTotalFare;
		}
		public void setItinTotalFare(ItinTotalFare itinTotalFare) {
			this.itinTotalFare = itinTotalFare;
		}
		public ArrayList<PTCFareBreakdown> getpTC_FareBreakdowns() {
			return pTC_FareBreakdowns;
		}
		public void setpTC_FareBreakdowns(ArrayList<PTCFareBreakdown> pTC_FareBreakdowns) {
			this.pTC_FareBreakdowns = pTC_FareBreakdowns;
		}
		public AirItineraryPricingInfoR(boolean divideInPartyIndicator, ArrayList<FareInfo> fareInfos,
				String fareSourceCode, String fareType, String isRefundable, ItinTotalFare itinTotalFare,
				ArrayList<PTCFareBreakdown> pTC_FareBreakdowns) {
			super();
			this.divideInPartyIndicator = divideInPartyIndicator;
			this.fareInfos = fareInfos;
			this.fareSourceCode = fareSourceCode;
			this.fareType = fareType;
			this.isRefundable = isRefundable;
			this.itinTotalFare = itinTotalFare;
			this.pTC_FareBreakdowns = pTC_FareBreakdowns;
		}
		public AirItineraryPricingInfoR() {
			super();
		}
	    
	}



