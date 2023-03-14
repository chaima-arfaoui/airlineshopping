package com.worldsoft.multicityRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Preferences {
	@JsonProperty("CabinClassPreference")
	private CabinClassPreference cabinClassPreference;

	public CabinClassPreference getCabinClassPreference() {
		return cabinClassPreference;
	}

	public void setCabinClassPreference(CabinClassPreference cabinClassPreference) {
		this.cabinClassPreference = cabinClassPreference;
	}

	public Preferences(CabinClassPreference cabinClassPreference) {
		super();
		this.cabinClassPreference = cabinClassPreference;
	}

	public Preferences() {
		super();
	}

}
