package com.worldsoft.entitiesResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PassengerInfo {
	@JsonProperty("Passenger")
	private Passenger passenger;
	@JsonProperty("ETickets")
	private ArrayList<ETicket> eTickets;

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public ArrayList<ETicket> geteTickets() {
		return eTickets;
	}

	public void seteTickets(ArrayList<ETicket> eTickets) {
		this.eTickets = eTickets;
	}

	public PassengerInfo(Passenger passenger, ArrayList<ETicket> eTickets) {
		super();
		this.passenger = passenger;
		this.eTickets = eTickets;
	}

	public PassengerInfo() {
		super();
	}

}
