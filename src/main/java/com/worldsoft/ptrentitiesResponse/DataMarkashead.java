package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataMarkashead {
	@JsonProperty("Id")
	private int id;
	@JsonProperty("RequestType")
	private String requestType;
	@JsonProperty("Status")
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public DataMarkashead(int id, String requestType, String status) {
		super();
		this.id = id;
		this.requestType = requestType;
		this.status = status;
	}

	public DataMarkashead() {
		super();
	}

}
