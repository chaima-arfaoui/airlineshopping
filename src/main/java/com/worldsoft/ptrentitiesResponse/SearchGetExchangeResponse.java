package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchGetExchangeResponse {
	  @JsonProperty("Data") 
	    private Dataptr data;
	    @JsonProperty("Success") 
	    private boolean success;
		public Dataptr getData() {
			return data;
		}
		public void setData(Dataptr data) {
			this.data = data;
		}
		public boolean isSuccess() {
			return success;
		}
		public void setSuccess(boolean success) {
			this.success = success;
		}
		public SearchGetExchangeResponse(Dataptr data, boolean success) {
			super();
			this.data = data;
			this.success = success;
		}
		public SearchGetExchangeResponse() {
			super();
		}
	    

}
