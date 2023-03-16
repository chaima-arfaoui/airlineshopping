package com.worldsoft.multicityResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PenaltiesInfoList {
	@JsonProperty("Penaltydetails")
	public ArrayList<Penaltydetail> penaltydetails;
	@JsonProperty("PenaltiesInfoRef")
	public int penaltiesInfoRef;

	public ArrayList<Penaltydetail> getPenaltydetails() {
		return penaltydetails;
	}

	public void setPenaltydetails(ArrayList<Penaltydetail> penaltydetails) {
		this.penaltydetails = penaltydetails;
	}

	public int getPenaltiesInfoRef() {
		return penaltiesInfoRef;
	}

	public void setPenaltiesInfoRef(int penaltiesInfoRef) {
		this.penaltiesInfoRef = penaltiesInfoRef;
	}

	public PenaltiesInfoList(ArrayList<Penaltydetail> penaltydetails, int penaltiesInfoRef) {
		super();
		this.penaltydetails = penaltydetails;
		this.penaltiesInfoRef = penaltiesInfoRef;
	}

	public PenaltiesInfoList() {
		super();
	}

}
