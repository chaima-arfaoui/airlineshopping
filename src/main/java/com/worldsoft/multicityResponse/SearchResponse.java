package com.worldsoft.multicityResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResponse {
	 @JsonProperty("Data") 
	    public ArrayList<Datum> data;
	    @JsonProperty("Success") 
	    public boolean success;
	    @JsonProperty("Message") 
	    public String message;
		public ArrayList<Datum> getData() {
			return data;
		}
		public void setData(ArrayList<Datum> data) {
			this.data = data;
		}
		public boolean isSuccess() {
			return success;
		}
		public void setSuccess(boolean success) {
			this.success = success;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public SearchResponse(ArrayList<Datum> data, boolean success, String message) {
			super();
			this.data = data;
			this.success = success;
			this.message = message;
		}
		public SearchResponse() {
			super();
		}
	    
}
