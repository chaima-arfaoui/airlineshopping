package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Error {
	@JsonProperty("Code")
	public String code;
	@JsonProperty("Message")
	public String message;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Error(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public Error() {
		super();
	}

}
