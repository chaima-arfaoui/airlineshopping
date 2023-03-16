package com.worldsoft.ptrentitiesResponse;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestedPreference {
	 @JsonProperty("Option") 
	    private int option;
	    @JsonProperty("CreatedOn") 
	    private Date createdOn;
	    @JsonProperty("QuotedSegments") 
	    private ArrayList<QuotedSegment> quotedSegments;
	    @JsonProperty("QuotedFares") 
	    private ArrayList<QuotedFare> quotedFares;
	    @JsonProperty("PTRRemarks") 
	    private ArrayList<PTRRemark> pTRRemarks;
		public int getOption() {
			return option;
		}
		public void setOption(int option) {
			this.option = option;
		}
		public Date getCreatedOn() {
			return createdOn;
		}
		public void setCreatedOn(Date createdOn) {
			this.createdOn = createdOn;
		}
		public ArrayList<QuotedSegment> getQuotedSegments() {
			return quotedSegments;
		}
		public void setQuotedSegments(ArrayList<QuotedSegment> quotedSegments) {
			this.quotedSegments = quotedSegments;
		}
		public ArrayList<QuotedFare> getQuotedFares() {
			return quotedFares;
		}
		public void setQuotedFares(ArrayList<QuotedFare> quotedFares) {
			this.quotedFares = quotedFares;
		}
		public ArrayList<PTRRemark> getpTRRemarks() {
			return pTRRemarks;
		}
		public void setpTRRemarks(ArrayList<PTRRemark> pTRRemarks) {
			this.pTRRemarks = pTRRemarks;
		}
		public RequestedPreference(int option, Date createdOn, ArrayList<QuotedSegment> quotedSegments,
				ArrayList<QuotedFare> quotedFares, ArrayList<PTRRemark> pTRRemarks) {
			super();
			this.option = option;
			this.createdOn = createdOn;
			this.quotedSegments = quotedSegments;
			this.quotedFares = quotedFares;
			this.pTRRemarks = pTRRemarks;
		}
		public RequestedPreference() {
			super();
		}
	    

}
