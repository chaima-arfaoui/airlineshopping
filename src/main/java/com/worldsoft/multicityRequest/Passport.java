package com.worldsoft.multicityRequest;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Passport {
	@JsonProperty("PassportNumber")
	private String passportNumber;
	@JsonProperty("ExpiryDate")
	private String expiryDate;
	@JsonProperty("Country")
	private String country;

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Passport(String passportNumber, String expiryDate, String country) {
		super();
		this.passportNumber = passportNumber;
		this.expiryDate = expiryDate;
		this.country = country;
	}

	public Passport() {
		super();
	}

}
