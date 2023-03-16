package com.worldsoft.ptrentitiesResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataSearchRefund {
	@JsonProperty("PTRDetail")
	private ArrayList<PTRDetail> pTRDetail;

	public ArrayList<PTRDetail> getpTRDetail() {
		return pTRDetail;
	}

	public void setpTRDetail(ArrayList<PTRDetail> pTRDetail) {
		this.pTRDetail = pTRDetail;
	}

	public DataSearchRefund(ArrayList<PTRDetail> pTRDetail) {
		super();
		this.pTRDetail = pTRDetail;
	}

	public DataSearchRefund() {
		super();
	}

}
