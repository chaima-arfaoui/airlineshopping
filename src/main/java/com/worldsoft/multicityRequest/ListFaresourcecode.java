package com.worldsoft.multicityRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ListFaresourcecode {
	@JsonProperty("FareSourceCode")
	private String fareSourceCode;

	public String getFareSourceCode() {
		return fareSourceCode;
	}

	public void setFareSourceCode(String fareSourceCode) {
		this.fareSourceCode = fareSourceCode;
	}

	public ListFaresourcecode(String fareSourceCode) {
		super();
		this.fareSourceCode = fareSourceCode;
	}

	public ListFaresourcecode() {
		super();
	}

}
