package com.worldsoft.multicityResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AirItineraryPricingInfo {
	@JsonProperty("ItinTotalFare")
	private ItinTotalFare itinTotalFare;
	@JsonProperty("PTC_FareBreakdowns")
	private ArrayList<PTCFareBreakdown> pTC_FareBreakdowns;
	@JsonProperty("FareInfos")
	private ArrayList<FareInfo> fareInfos;
	@JsonProperty("IsMOFare")
	private Object isMOFare;
	@JsonProperty("SplitItinerary")
	private String splitItinerary;
	@JsonProperty("IsRefundable")
	private String isRefundable;
	@JsonProperty("CrossBorderIndicator")
	private Object crossBorderIndicator;
	@JsonProperty("IsCommissionable")
	private Object isCommissionable;
	@JsonProperty("FareSourceCode")
	private String fareSourceCode;
	@JsonProperty("FareType")
	private String fareType;
	@JsonProperty("DivideInPartyIndicator")
	private boolean divideInPartyIndicator;

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

	public ArrayList<FareInfo> getFareInfos() {
		return fareInfos;
	}

	public void setFareInfos(ArrayList<FareInfo> fareInfos) {
		this.fareInfos = fareInfos;
	}

	public Object getIsMOFare() {
		return isMOFare;
	}

	public void setIsMOFare(Object isMOFare) {
		this.isMOFare = isMOFare;
	}

	public String getSplitItinerary() {
		return splitItinerary;
	}

	public void setSplitItinerary(String splitItinerary) {
		this.splitItinerary = splitItinerary;
	}

	public String getIsRefundable() {
		return isRefundable;
	}

	public void setIsRefundable(String isRefundable) {
		this.isRefundable = isRefundable;
	}

	public Object getCrossBorderIndicator() {
		return crossBorderIndicator;
	}

	public void setCrossBorderIndicator(Object crossBorderIndicator) {
		this.crossBorderIndicator = crossBorderIndicator;
	}

	public Object getIsCommissionable() {
		return isCommissionable;
	}

	public void setIsCommissionable(Object isCommissionable) {
		this.isCommissionable = isCommissionable;
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

	public boolean isDivideInPartyIndicator() {
		return divideInPartyIndicator;
	}

	public void setDivideInPartyIndicator(boolean divideInPartyIndicator) {
		this.divideInPartyIndicator = divideInPartyIndicator;
	}

	public AirItineraryPricingInfo(ItinTotalFare itinTotalFare, ArrayList<PTCFareBreakdown> pTC_FareBreakdowns,
			ArrayList<FareInfo> fareInfos, Object isMOFare, String splitItinerary, String isRefundable,
			Object crossBorderIndicator, Object isCommissionable, String fareSourceCode, String fareType,
			boolean divideInPartyIndicator) {
		super();
		this.itinTotalFare = itinTotalFare;
		this.pTC_FareBreakdowns = pTC_FareBreakdowns;
		this.fareInfos = fareInfos;
		this.isMOFare = isMOFare;
		this.splitItinerary = splitItinerary;
		this.isRefundable = isRefundable;
		this.crossBorderIndicator = crossBorderIndicator;
		this.isCommissionable = isCommissionable;
		this.fareSourceCode = fareSourceCode;
		this.fareType = fareType;
		this.divideInPartyIndicator = divideInPartyIndicator;
	}

	public AirItineraryPricingInfo() {
		super();
	}

}
