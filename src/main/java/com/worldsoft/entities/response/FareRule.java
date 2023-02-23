package com.worldsoft.entities.response;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FareRule {
	 @JsonProperty("Airline") 
	    private String airline;
	    @JsonProperty("CityPair") 
	    private String cityPair;
	    @JsonProperty("RuleDetails") 
	    private ArrayList<RuleDetail> ruleDetails;
		public String getAirline() {
			return airline;
		}
		public void setAirline(String airline) {
			this.airline = airline;
		}
		public String getCityPair() {
			return cityPair;
		}
		public void setCityPair(String cityPair) {
			this.cityPair = cityPair;
		}
		public ArrayList<RuleDetail> getRuleDetails() {
			return ruleDetails;
		}
		public void setRuleDetails(ArrayList<RuleDetail> ruleDetails) {
			this.ruleDetails = ruleDetails;
		}
		public FareRule(String airline, String cityPair, ArrayList<RuleDetail> ruleDetails) {
			super();
			this.airline = airline;
			this.cityPair = cityPair;
			this.ruleDetails = ruleDetails;
		}
		public FareRule() {
			super();
		}
	    

}
