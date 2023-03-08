package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MFRefResult {
	 @JsonProperty("Success") 
	    private boolean success;
	    @JsonProperty("MFRef") 
	    private String mFRef;
		public boolean isSuccess() {
			return success;
		}
		public void setSuccess(boolean success) {
			this.success = success;
		}
		public String getmFRef() {
			return mFRef;
		}
		public void setmFRef(String mFRef) {
			this.mFRef = mFRef;
		}
		public MFRefResult(boolean success, String mFRef) {
			super();
			this.success = success;
			this.mFRef = mFRef;
		}
		public MFRefResult() {
			super();
		}
	    

}
