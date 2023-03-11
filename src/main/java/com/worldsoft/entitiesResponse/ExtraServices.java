package com.worldsoft.entitiesResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExtraServices {
	 @JsonProperty("Services") 
	    private ArrayList<Service> services;

	public ArrayList<Service> getServices() {
		return services;
	}

	public void setServices(ArrayList<Service> services) {
		this.services = services;
	}

	public ExtraServices(ArrayList<Service> services) {
		super();
		this.services = services;
	}

	public ExtraServices() {
		super();
	}
	 

}