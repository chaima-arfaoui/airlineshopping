package com.worldsoft.entitiesRequest;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Revalidation {
	 @JsonProperty("FareSourceCode") 
	 private String fareSourceCode;
	    @JsonProperty("Target") 
	    private String target;
	    @JsonProperty("ConversationId") 
	    private String conversationId;
		public String getFareSourceCode() {
			return fareSourceCode;
		}
		public void setFareSourceCode(String fareSourceCode) {
			this.fareSourceCode = fareSourceCode;
		}
		public String getTarget() {
			return target;
		}
		public void setTarget(String target) {
			this.target = target;
		}
		public String getConversationId() {
			return conversationId;
		}
		public void setConversationId(String conversationId) {
			this.conversationId = conversationId;
		}
		public Revalidation(String fareSourceCode, String target, String conversationId) {
			super();
			this.fareSourceCode = fareSourceCode;
			this.target = target;
			this.conversationId = conversationId;
		}
		public Revalidation() {
			super();
		}
	    
}
