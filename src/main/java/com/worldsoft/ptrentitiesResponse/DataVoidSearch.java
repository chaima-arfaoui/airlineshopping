package com.worldsoft.ptrentitiesResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataVoidSearch {
	@JsonProperty("PTRDetail")
	public ArrayList<PTRDetail> pTRDetail;

	public ArrayList<PTRDetail> getpTRDetail() {
		return pTRDetail;
	}

	public void setpTRDetail(ArrayList<PTRDetail> pTRDetail) {
		this.pTRDetail = pTRDetail;
	}

	public DataVoidSearch(ArrayList<PTRDetail> pTRDetail) {
		super();
		this.pTRDetail = pTRDetail;
	}

	public DataVoidSearch() {
		super();
	}

}
