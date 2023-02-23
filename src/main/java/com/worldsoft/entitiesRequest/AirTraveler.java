package com.worldsoft.entitiesRequest;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonProperty;
public class AirTraveler {
	 @JsonProperty("PassengerType") 
	    private String passengerType;
	    @JsonProperty("Gender") 
	    private String gender;
	    @JsonProperty("PassengerName") 
	    private PassengerName passengerName;
	    @JsonProperty("DateOfBirth") 
	    private Date dateOfBirth;
	    @JsonProperty("Passport") 
	    private Passport passport;
	    @JsonProperty("SpecialServiceRequest") 
	    private SpecialServiceRequest specialServiceRequest;
	    @JsonProperty("PassengerNationality") 
	    private String passengerNationality;
	    @JsonProperty("NationalID") 
	    private String nationalID;
		public String getPassengerType() {
			return passengerType;
		}
		public void setPassengerType(String passengerType) {
			this.passengerType = passengerType;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public PassengerName getPassengerName() {
			return passengerName;
		}
		public void setPassengerName(PassengerName passengerName) {
			this.passengerName = passengerName;
		}
		public Date getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public Passport getPassport() {
			return passport;
		}
		public void setPassport(Passport passport) {
			this.passport = passport;
		}
		public SpecialServiceRequest getSpecialServiceRequest() {
			return specialServiceRequest;
		}
		public void setSpecialServiceRequest(SpecialServiceRequest specialServiceRequest) {
			this.specialServiceRequest = specialServiceRequest;
		}
		public String getPassengerNationality() {
			return passengerNationality;
		}
		public void setPassengerNationality(String passengerNationality) {
			this.passengerNationality = passengerNationality;
		}
		public String getNationalID() {
			return nationalID;
		}
		public void setNationalID(String nationalID) {
			this.nationalID = nationalID;
		}
		public AirTraveler(String passengerType, String gender, PassengerName passengerName, Date dateOfBirth,
				Passport passport, SpecialServiceRequest specialServiceRequest, String passengerNationality,
				String nationalID) {
			super();
			this.passengerType = passengerType;
			this.gender = gender;
			this.passengerName = passengerName;
			this.dateOfBirth = dateOfBirth;
			this.passport = passport;
			this.specialServiceRequest = specialServiceRequest;
			this.passengerNationality = passengerNationality;
			this.nationalID = nationalID;
		}
		public AirTraveler() {
			
		}
	    

}
