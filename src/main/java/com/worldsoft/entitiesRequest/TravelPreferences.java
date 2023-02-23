package com.worldsoft.entitiesRequest;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TravelPreferences{
    public TravelPreferences() {
		super();
	}
	@JsonProperty("MaxStopsQuantity") 
    private String maxStopsQuantity;
    @JsonProperty("VendorPreferenceCodes") 
    private ArrayList<String> vendorPreferenceCodes;
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
	public ArrayList<String> getVendorPreferenceCodes() {
		return vendorPreferenceCodes;
	}
	public void setVendorPreferenceCodes(ArrayList<String> vendorPreferenceCodes) {
		this.vendorPreferenceCodes = vendorPreferenceCodes;
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
	public TravelPreferences(String maxStopsQuantity, ArrayList<String> vendorPreferenceCodes, String cabinPreference,
			Preferences preferences, String airTripType) {
		super();
		this.maxStopsQuantity = maxStopsQuantity;
		this.vendorPreferenceCodes = vendorPreferenceCodes;
		this.cabinPreference = cabinPreference;
		this.preferences = preferences;
		this.airTripType = airTripType;
	}
    
}