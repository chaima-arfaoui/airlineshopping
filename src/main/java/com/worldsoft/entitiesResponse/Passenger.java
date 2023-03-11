package com.worldsoft.entitiesResponse;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Passenger {
	@JsonProperty("Gender")
	private String gender;
	@JsonProperty("DateOfBirth")
	private Date dateOfBirth;
	@JsonProperty("EmailAddress")
	private String emailAddress;
	@JsonProperty("PhoneNumber")
	private String phoneNumber;
	@JsonProperty("PassportExpiresOn")
	private Date passportExpiresOn;
	@JsonProperty("PassportNationality")
	private String passportNationality;
	@JsonProperty("PassengerNationality")
	private String passengerNationality;
	@JsonProperty("PostCode")
	private String postCode;
	@JsonProperty("PassportIssuanceCountry")
	private String passportIssuanceCountry;
	@JsonProperty("PassengerType")
	private String passengerType;
	@JsonProperty("PaxName")
	private PaxName paxName;
	@JsonProperty("PassportNumber")
	private String passportNumber;
	@JsonProperty("NationalID")
	private String nationalID;
	@JsonProperty("NameNumber")
	private int nameNumber;
	@JsonProperty("TicketStatus")
	private String ticketStatus;

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getPassportExpiresOn() {
		return passportExpiresOn;
	}

	public void setPassportExpiresOn(Date passportExpiresOn) {
		this.passportExpiresOn = passportExpiresOn;
	}

	public String getPassportNationality() {
		return passportNationality;
	}

	public void setPassportNationality(String passportNationality) {
		this.passportNationality = passportNationality;
	}

	public String getPassengerNationality() {
		return passengerNationality;
	}

	public void setPassengerNationality(String passengerNationality) {
		this.passengerNationality = passengerNationality;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getPassportIssuanceCountry() {
		return passportIssuanceCountry;
	}

	public void setPassportIssuanceCountry(String passportIssuanceCountry) {
		this.passportIssuanceCountry = passportIssuanceCountry;
	}

	public String getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	public PaxName getPaxName() {
		return paxName;
	}

	public void setPaxName(PaxName paxName) {
		this.paxName = paxName;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getNationalID() {
		return nationalID;
	}

	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}

	public int getNameNumber() {
		return nameNumber;
	}

	public void setNameNumber(int nameNumber) {
		this.nameNumber = nameNumber;
	}

	public String getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public Passenger(String gender, Date dateOfBirth, String emailAddress, String phoneNumber, Date passportExpiresOn,
			String passportNationality, String passengerNationality, String postCode, String passportIssuanceCountry,
			String passengerType, PaxName paxName, String passportNumber, String nationalID, int nameNumber,
			String ticketStatus) {
		super();
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.passportExpiresOn = passportExpiresOn;
		this.passportNationality = passportNationality;
		this.passengerNationality = passengerNationality;
		this.postCode = postCode;
		this.passportIssuanceCountry = passportIssuanceCountry;
		this.passengerType = passengerType;
		this.paxName = paxName;
		this.passportNumber = passportNumber;
		this.nationalID = nationalID;
		this.nameNumber = nameNumber;
		this.ticketStatus = ticketStatus;
	}

	public Passenger() {
		super();
	}

}
