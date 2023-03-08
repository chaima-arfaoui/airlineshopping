package com.worldsoft.entitiesResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataRetreive {
	@JsonProperty("MFRefResult") 
    private MFRefResult mFRefResult;

	public MFRefResult getmFRefResult() {
		return mFRefResult;
	}

	public void setmFRefResult(MFRefResult mFRefResult) {
		this.mFRefResult = mFRefResult;
	}

	public DataRetreive(MFRefResult mFRefResult) {
		super();
		this.mFRefResult = mFRefResult;
	}

	public DataRetreive() {
		super();
	}
	
	

}
