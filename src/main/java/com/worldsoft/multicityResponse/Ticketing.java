package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ticketing {
	@JsonProperty("TATinMinutes")
	private String tATinMinutes;

	public String gettATinMinutes() {
		return tATinMinutes;
	}

	public void settATinMinutes(String tATinMinutes) {
		this.tATinMinutes = tATinMinutes;
	}

	public Ticketing(String tATinMinutes) {
		super();
		this.tATinMinutes = tATinMinutes;
	}

	public Ticketing() {
		super();
	}

}
