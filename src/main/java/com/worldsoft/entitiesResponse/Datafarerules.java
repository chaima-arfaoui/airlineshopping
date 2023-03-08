package com.worldsoft.entitiesResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Datafarerules {
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
	    @JsonProperty("TraceId") 
	    private String traceId;
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
		public String getTraceId() {
			return traceId;
		}
		public void setTraceId(String traceId) {
			this.traceId = traceId;
		}
		public Datafarerules(ArrayList<BaggageInfo> baggageInfos, String conversationId, ArrayList<Object> errors,
				ArrayList<FareRule> fareRules, boolean success, String target, String traceId) {
			super();
			this.baggageInfos = baggageInfos;
			this.conversationId = conversationId;
			this.errors = errors;
			this.fareRules = fareRules;
			this.success = success;
			this.target = target;
			this.traceId = traceId;
		}
		public Datafarerules() {
			super();
		}
	    

}
