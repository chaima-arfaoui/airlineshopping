package com.worldsoft.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FareRulesResponse {
	 @JsonProperty("Data") 
	    private Data data;
	    @JsonProperty("Success") 
	    private boolean success;
		public Data getData() {
			return data;
		}
		public void setData(Data data) {
			this.data = data;
		}
		public boolean isSuccess() {
			return success;
		}
		public void setSuccess(boolean success) {
			this.success = success;
		}
		public FareRulesResponse(Data data, boolean success) {
			super();
			this.data = data;
			this.success = success;
		}
		public FareRulesResponse() {
			super();
		}
	    

}
