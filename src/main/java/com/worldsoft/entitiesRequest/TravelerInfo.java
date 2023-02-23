package com.worldsoft.entitiesRequest;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TravelerInfo {
	 @JsonProperty("AirTravelers") 
	 private ArrayList<AirTraveler> airTravelers;
	    @JsonProperty("CountryCode") 
	    private String countryCode;
	    @JsonProperty("AreaCode") 
	    private String areaCode;
	    @JsonProperty("PhoneNumber") 
	    private String phoneNumber;
	    @JsonProperty("Email") 
	    private String email;
	    @JsonProperty("PostCode") 
	    private String postCode;
		public ArrayList<AirTraveler> getAirTravelers() {
			return airTravelers;
		}
		public void setAirTravelers(ArrayList<AirTraveler> airTravelers) {
			this.airTravelers = airTravelers;
		}
		public String getCountryCode() {
			return countryCode;
		}
		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}
		public String getAreaCode() {
			return areaCode;
		}
		public void setAreaCode(String areaCode) {
			this.areaCode = areaCode;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPostCode() {
			return postCode;
		}
		public void setPostCode(String postCode) {
			this.postCode = postCode;
		}
		public TravelerInfo(ArrayList<AirTraveler> airTravelers, String countryCode, String areaCode,
				String phoneNumber, String email, String postCode) {
			super();
			this.airTravelers = airTravelers;
			this.countryCode = countryCode;
			this.areaCode = areaCode;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.postCode = postCode;
		}
		public TravelerInfo() {
			super();
		}
	    

}
