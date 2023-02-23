package com.worldsoft.entitiesRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestSSR {
	 @JsonProperty("SSRCode") 
	 private String sSRCode;
	    @JsonProperty("FreeText") 
	    private String freeText;
		public String getsSRCode() {
			return sSRCode;
		}
		public void setsSRCode(String sSRCode) {
			this.sSRCode = sSRCode;
		}
		public String getFreeText() {
			return freeText;
		}
		public void setFreeText(String freeText) {
			this.freeText = freeText;
		}
		public RequestSSR(String sSRCode, String freeText) {
			super();
			this.sSRCode = sSRCode;
			this.freeText = freeText;
		}
		public RequestSSR() {
			super();
		}

}
