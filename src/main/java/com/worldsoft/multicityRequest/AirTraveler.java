package com.worldsoft.multicityRequest;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AirTraveler {
	@JsonProperty("PassengerType")
	private String passengerType;
	@JsonProperty("Gender")
	private String gender;
	@JsonProperty("PassengerName")
	private PassengerName passengerName;
	@JsonProperty("DateOfBirth")
	private Date dateOfBirth;
	@JsonProperty("Passport")
	private Passport passport;
	@JsonProperty("PassengerNationality")
	private String passengerNationality;

	public String getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public PassengerName getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(PassengerName passengerName) {
		this.passengerName = passengerName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public String getPassengerNationality() {
		return passengerNationality;
	}

	public void setPassengerNationality(String passengerNationality) {
		this.passengerNationality = passengerNationality;
	}

	public AirTraveler(String passengerType, String gender, PassengerName passengerName, Date dateOfBirth,
			Passport passport, String passengerNationality) {
		super();
		this.passengerType = passengerType;
		this.gender = gender;
		this.passengerName = passengerName;
		this.dateOfBirth = dateOfBirth;
		this.passport = passport;
		this.passengerNationality = passengerNationality;
	}

	public AirTraveler() {
		super();
	}

}
