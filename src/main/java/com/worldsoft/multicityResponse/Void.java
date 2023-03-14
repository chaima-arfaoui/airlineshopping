package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Void {
	@JsonProperty("TATinMinutes")
	private String tATinMinutes;

	public String gettATinMinutes() {
		return tATinMinutes;
	}

	public void settATinMinutes(String tATinMinutes) {
		this.tATinMinutes = tATinMinutes;
	}

	public Void(String tATinMinutes) {
		super();
		this.tATinMinutes = tATinMinutes;
	}

	public Void() {
		super();
	}

}
