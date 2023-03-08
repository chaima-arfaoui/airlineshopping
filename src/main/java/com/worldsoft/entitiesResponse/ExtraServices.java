package com.worldsoft.entitiesResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExtraServices {
	 @JsonProperty("Services") 
	    private ArrayList<Object> services;

	public ArrayList<Object> getServices() {
		return services;
	}

	public void setServices(ArrayList<Object> services) {
		this.services = services;
	}

	public ExtraServices(ArrayList<Object> services) {
		super();
		this.services = services;
	}

	public ExtraServices() {
		super();
	}
	 

}
