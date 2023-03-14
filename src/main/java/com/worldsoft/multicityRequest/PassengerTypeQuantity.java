package com.worldsoft.multicityRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PassengerTypeQuantity {
	@JsonProperty("Code")
	private String code;
	@JsonProperty("Quantity")
	private int quantity;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public PassengerTypeQuantity(String code, int quantity) {
		super();
		this.code = code;
		this.quantity = quantity;
	}

	public PassengerTypeQuantity() {
		super();
	}

}
