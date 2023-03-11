package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Createptresponse {
	 @JsonProperty("Success") 
	    public boolean success;
	    @JsonProperty("Data") 
	    public DatavoidQuote data;
		public boolean isSuccess() {
			return success;
		}
		public void setSuccess(boolean success) {
			this.success = success;
		}
		public DatavoidQuote getData() {
			return data;
		}
		public void setData(DatavoidQuote data) {
			this.data = data;
		}
		public Createptresponse(boolean success, DatavoidQuote data) {
			super();
			this.success = success;
			this.data = data;
		}
		public Createptresponse() {
			super();
		}
	    

}
