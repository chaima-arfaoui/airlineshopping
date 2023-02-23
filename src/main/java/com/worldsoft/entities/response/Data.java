package com.worldsoft.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
	   @JsonProperty("SessionId") 
	    private String sessionId;

	    public String getSessionId() {
		return sessionId;
	     }

	    public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	    }

	public Data(String sessionId) {
		super();
		this.sessionId = sessionId;
	}
	 public Data() {

}
}
