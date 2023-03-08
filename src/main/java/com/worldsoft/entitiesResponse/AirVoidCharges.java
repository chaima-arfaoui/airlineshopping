package com.worldsoft.entitiesResponse;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AirVoidCharges {
	 @JsonProperty("IsVoidable") 
	    private String isVoidable;
	    @JsonProperty("PassengerType") 
	    private String passengerType;
	    @JsonProperty("AdminCharges") 
	    private double adminCharges;
	    @JsonProperty("Currency") 
	    private String currency;
	    @JsonProperty("VoidingWindow") 
	    private Date voidingWindow;
	    @JsonProperty("VoidingFee") 
	    private double voidingFee;
		public String getIsVoidable() {
			return isVoidable;
		}
		public void setIsVoidable(String isVoidable) {
			this.isVoidable = isVoidable;
		}
		public String getPassengerType() {
			return passengerType;
		}
		public void setPassengerType(String passengerType) {
			this.passengerType = passengerType;
		}
		public double getAdminCharges() {
			return adminCharges;
		}
		public void setAdminCharges(double adminCharges) {
			this.adminCharges = adminCharges;
		}
		public String getCurrency() {
			return currency;
		}
		public void setCurrency(String currency) {
			this.currency = currency;
		}
		public Date getVoidingWindow() {
			return voidingWindow;
		}
		public void setVoidingWindow(Date voidingWindow) {
			this.voidingWindow = voidingWindow;
		}
		public double getVoidingFee() {
			return voidingFee;
		}
		public void setVoidingFee(double voidingFee) {
			this.voidingFee = voidingFee;
		}
		public AirVoidCharges(String isVoidable, String passengerType, double adminCharges, String currency,
				Date voidingWindow, double voidingFee) {
			super();
			this.isVoidable = isVoidable;
			this.passengerType = passengerType;
			this.adminCharges = adminCharges;
			this.currency = currency;
			this.voidingWindow = voidingWindow;
			this.voidingFee = voidingFee;
		}
		public AirVoidCharges() {
			super();
		}
	    

}
