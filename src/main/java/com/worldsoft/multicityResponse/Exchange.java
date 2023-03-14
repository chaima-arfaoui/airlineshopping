package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Exchange {
	@JsonProperty("TATinMinutes")
	private String tATinMinutes;

	public String gettATinMinutes() {
		return tATinMinutes;
	}

	public void settATinMinutes(String tATinMinutes) {
		this.tATinMinutes = tATinMinutes;
	}

	public Exchange(String tATinMinutes) {
		super();
		this.tATinMinutes = tATinMinutes;
	}

	public Exchange() {
		super();
	}

}
