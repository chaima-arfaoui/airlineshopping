package com.worldsoft.ptrentitiesResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dataptr {
	@JsonProperty("PTRDetail")
	private ArrayList<PTRDetail> pTRDetail;

	public ArrayList<PTRDetail> getpTRDetail() {
		return pTRDetail;
	}

	public void setpTRDetail(ArrayList<PTRDetail> pTRDetail) {
		this.pTRDetail = pTRDetail;
	}

	public Dataptr(ArrayList<PTRDetail> pTRDetail) {
		super();
		this.pTRDetail = pTRDetail;
	}

	public Dataptr() {
		super();
	}

}
