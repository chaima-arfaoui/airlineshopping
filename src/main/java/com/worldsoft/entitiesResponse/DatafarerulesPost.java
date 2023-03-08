package com.worldsoft.entitiesResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DatafarerulesPost {
	 @JsonProperty("BaggageInfos") 
	    private ArrayList<BaggageInfo> baggageInfos;
	    @JsonProperty("ConversationId") 
	    private String conversationId;
	    @JsonProperty("Errors") 
	    private ArrayList<Object> errors;
	    @JsonProperty("FareRules") 
	    private ArrayList<FareRule> fareRules;
	    @JsonProperty("Success") 
	    private boolean success;
	    @JsonProperty("Target") 
	    private String target;
		public ArrayList<BaggageInfo> getBaggageInfos() {
			return baggageInfos;
		}
		public void setBaggageInfos(ArrayList<BaggageInfo> baggageInfos) {
			this.baggageInfos = baggageInfos;
		}
		public String getConversationId() {
			return conversationId;
		}
		public void setConversationId(String conversationId) {
			this.conversationId = conversationId;
		}
		public ArrayList<Object> getErrors() {
			return errors;
		}
		public void setErrors(ArrayList<Object> errors) {
			this.errors = errors;
		}
		public ArrayList<FareRule> getFareRules() {
			return fareRules;
		}
		public void setFareRules(ArrayList<FareRule> fareRules) {
			this.fareRules = fareRules;
		}
		public boolean isSuccess() {
			return success;
		}
		public void setSuccess(boolean success) {
			this.success = success;
		}
		public String getTarget() {
			return target;
		}
		public void setTarget(String target) {
			this.target = target;
		}
		public DatafarerulesPost(ArrayList<BaggageInfo> baggageInfos, String conversationId, ArrayList<Object> errors,
				ArrayList<FareRule> fareRules, boolean success, String target) {
			super();
			this.baggageInfos = baggageInfos;
			this.conversationId = conversationId;
			this.errors = errors;
			this.fareRules = fareRules;
			this.success = success;
			this.target = target;
		}
		public DatafarerulesPost() {
			super();
		}
	    
	   }

