package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FareRulesResponse {
	 @JsonProperty("Data") 
	    private Datafarerules data;
	    @JsonProperty("Success") 
	    private boolean success;
		public Datafarerules getData() {
			return data;
		}
		public void setData(Datafarerules data) {
			this.data = data;
		}
		public boolean isSuccess() {
			return success;
		}
		public void setSuccess(boolean success) {
			this.success = success;
		}
		public FareRulesResponse(Datafarerules data, boolean success) {
			super();
			this.data = data;
			this.success = success;
		}
		public FareRulesResponse() {
			super();
		}
	    

}
