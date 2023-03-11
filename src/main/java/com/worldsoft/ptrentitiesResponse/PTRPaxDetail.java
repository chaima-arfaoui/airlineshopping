package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PTRPaxDetail {
	@JsonProperty("Id")
	public int id;
	@JsonProperty("PTRId")
	public int pTRId;
	@JsonProperty("PaxId")
	public int paxId;
	@JsonProperty("TicketNumber")
	public String ticketNumber;
	@JsonProperty("TicketStatus")
	public int ticketStatus;
	@JsonProperty("IsActive")
	public boolean isActive;
	@JsonProperty("PassengerType")
	public String passengerType;
	@JsonProperty("Tittle")
	public String tittle;
	@JsonProperty("FirstName")
	public String firstName;
	@JsonProperty("LastName")
	public String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getpTRId() {
		return pTRId;
	}

	public void setpTRId(int pTRId) {
		this.pTRId = pTRId;
	}

	public int getPaxId() {
		return paxId;
	}

	public void setPaxId(int paxId) {
		this.paxId = paxId;
	}

	public String getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(String ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public int getTicketStatus() {
		return ticketStatus;
	}

	public void setTicketStatus(int ticketStatus) {
		this.ticketStatus = ticketStatus;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public String getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public PTRPaxDetail(int id, int pTRId, int paxId, String ticketNumber, int ticketStatus, boolean isActive,
			String passengerType, String tittle, String firstName, String lastName) {
		super();
		this.id = id;
		this.pTRId = pTRId;
		this.paxId = paxId;
		this.ticketNumber = ticketNumber;
		this.ticketStatus = ticketStatus;
		this.isActive = isActive;
		this.passengerType = passengerType;
		this.tittle = tittle;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public PTRPaxDetail() {
		super();
	}

}
