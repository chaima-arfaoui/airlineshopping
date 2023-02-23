package com.worldsoft.entitiesRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CabinClassPreference{
    @JsonProperty("CabinType") 
    private String cabinType;
    @JsonProperty("PreferenceLevel") 
    private String preferenceLevel;
	public String getCabinType() {
		return cabinType;
	}
	public void setCabinType(String cabinType) {
		this.cabinType = cabinType;
	}
	public String getPreferenceLevel() {
		return preferenceLevel;
	}
	public void setPreferenceLevel(String preferenceLevel) {
		this.preferenceLevel = preferenceLevel;
	}
	public CabinClassPreference(String cabinType, String preferenceLevel) {
		super();
		this.cabinType = cabinType;
		this.preferenceLevel = preferenceLevel;
	}
	public CabinClassPreference() {
		super();
	}
    
}