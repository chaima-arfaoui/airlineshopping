package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SeatsRemaining {
	@JsonProperty("Number")
	private int number;
	@JsonProperty("BelowMinimum")
	private boolean belowMinimum;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isBelowMinimum() {
		return belowMinimum;
	}

	public void setBelowMinimum(boolean belowMinimum) {
		this.belowMinimum = belowMinimum;
	}

	public SeatsRemaining(int number, boolean belowMinimum) {
		super();
		this.number = number;
		this.belowMinimum = belowMinimum;
	}

	public SeatsRemaining() {
		super();
	}

}
