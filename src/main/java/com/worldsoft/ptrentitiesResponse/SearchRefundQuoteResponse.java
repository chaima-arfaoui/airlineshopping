package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchRefundQuoteResponse {
	 @JsonProperty("Success") 
	    public boolean success;
	    @JsonProperty("Data") 
	    public DataRefundQuote data;
		public boolean isSuccess() {
			return success;
		}
		public void setSuccess(boolean success) {
			this.success = success;
		}
		public DataRefundQuote getData() {
			return data;
		}
		public void setData(DataRefundQuote data) {
			this.data = data;
		}
		public SearchRefundQuoteResponse(boolean success, DataRefundQuote data) {
			super();
			this.success = success;
			this.data = data;
		}
		public SearchRefundQuoteResponse() {
			super();
		}
	    

}
