package com.worldsoft.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SeatsRemaining {
	@JsonProperty("BelowMinimum") 
    private boolean belowMinimum;
    @JsonProperty("Number") 
    private int number;
	public boolean isBelowMinimum() {
		return belowMinimum;
	}
	public void setBelowMinimum(boolean belowMinimum) {
		this.belowMinimum = belowMinimum;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public SeatsRemaining(boolean belowMinimum, int number) {
		super();
		this.belowMinimum = belowMinimum;
		this.number = number;
	}
	public SeatsRemaining() {
		super();
	}
    

}
