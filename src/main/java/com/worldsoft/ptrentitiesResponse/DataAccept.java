package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataAccept {
	 @JsonProperty("PTRId") 
	    private int pTRId;
	    @JsonProperty("PTRType") 
	    private String pTRType;
	    @JsonProperty("SLAInMinutes") 
	    private int sLAInMinutes;
	    @JsonProperty("PTRStatus") 
	    private String pTRStatus;
	    @JsonProperty("Message") 
	    private String message;
		public int getpTRId() {
			return pTRId;
		}
		public void setpTRId(int pTRId) {
			this.pTRId = pTRId;
		}
		public String getpTRType() {
			return pTRType;
		}
		public void setpTRType(String pTRType) {
			this.pTRType = pTRType;
		}
		public int getsLAInMinutes() {
			return sLAInMinutes;
		}
		public void setsLAInMinutes(int sLAInMinutes) {
			this.sLAInMinutes = sLAInMinutes;
		}
		public String getpTRStatus() {
			return pTRStatus;
		}
		public void setpTRStatus(String pTRStatus) {
			this.pTRStatus = pTRStatus;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public DataAccept(int pTRId, String pTRType, int sLAInMinutes, String pTRStatus, String message) {
			super();
			this.pTRId = pTRId;
			this.pTRType = pTRType;
			this.sLAInMinutes = sLAInMinutes;
			this.pTRStatus = pTRStatus;
			this.message = message;
		}
		public DataAccept() {
			super();
		}
	    
}
