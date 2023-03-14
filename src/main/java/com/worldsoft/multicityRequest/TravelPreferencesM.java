package com.worldsoft.multicityRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TravelPreferencesM {
	@JsonProperty("MaxStopsQuantity") 
    private String maxStopsQuantity;
    @JsonProperty("CabinPreference") 
    private String cabinPreference;
    @JsonProperty("Preferences") 
    private Preferences preferences;
    @JsonProperty("AirTripType") 
    private String airTripType;
	public String getMaxStopsQuantity() {
		return maxStopsQuantity;
	}
	public void setMaxStopsQuantity(String maxStopsQuantity) {
		this.maxStopsQuantity = maxStopsQuantity;
	}
	public String getCabinPreference() {
		return cabinPreference;
	}
	public void setCabinPreference(String cabinPreference) {
		this.cabinPreference = cabinPreference;
	}
	public Preferences getPreferences() {
		return preferences;
	}
	public void setPreferences(Preferences preferences) {
		this.preferences = preferences;
	}
	public String getAirTripType() {
		return airTripType;
	}
	public void setAirTripType(String airTripType) {
		this.airTripType = airTripType;
	}
	public TravelPreferencesM(String maxStopsQuantity, String cabinPreference, Preferences preferences,
			String airTripType) {
		super();
		this.maxStopsQuantity = maxStopsQuantity;
		this.cabinPreference = cabinPreference;
		this.preferences = preferences;
		this.airTripType = airTripType;
	}
	public TravelPreferencesM() {
		super();
	}
    

}
