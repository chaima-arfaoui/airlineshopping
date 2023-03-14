package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Refund {
	@JsonProperty("TATinMinutes")
	private String tATinMinutes;

	public String gettATinMinutes() {
		return tATinMinutes;
	}

	public void settATinMinutes(String tATinMinutes) {
		this.tATinMinutes = tATinMinutes;
	}

	public Refund(String tATinMinutes) {
		super();
		this.tATinMinutes = tATinMinutes;
	}

	public Refund() {
		super();
	}

}
