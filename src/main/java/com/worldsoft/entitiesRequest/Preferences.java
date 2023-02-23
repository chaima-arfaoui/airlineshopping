package com.worldsoft.entitiesRequest;

public class Preferences {
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
