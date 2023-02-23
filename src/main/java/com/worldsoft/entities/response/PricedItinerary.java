package com.worldsoft.entities.response;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PricedItinerary {
	 @JsonProperty("AirItineraryPricingInfo") 
	    private AirItineraryPricingInfo airItineraryPricingInfo;
	    @JsonProperty("DirectionInd") 
	    private String directionInd;
	    @JsonProperty("IsPassportMandatory") 
	    private boolean isPassportMandatory;
	    @JsonProperty("OriginDestinationOptions") 
	    private ArrayList<OriginDestinationOption> originDestinationOptions;
	    @JsonProperty("PaxNameCharacterLimit") 
	    private int paxNameCharacterLimit;
	    @JsonProperty("RequiredFieldsToBook") 
	    private ArrayList<String> requiredFieldsToBook;
	    @JsonProperty("SequenceNumber") 
	    private int sequenceNumber;
	    @JsonProperty("TicketType") 
	    private String ticketType;
	    @JsonProperty("ValidatingAirlineCode") 
	    private String validatingAirlineCode;
		public AirItineraryPricingInfo getAirItineraryPricingInfo() {
			return airItineraryPricingInfo;
		}
		public void setAirItineraryPricingInfo(AirItineraryPricingInfo airItineraryPricingInfo) {
			this.airItineraryPricingInfo = airItineraryPricingInfo;
		}
		public String getDirectionInd() {
			return directionInd;
		}
		public void setDirectionInd(String directionInd) {
			this.directionInd = directionInd;
		}
		public boolean isPassportMandatory() {
			return isPassportMandatory;
		}
		public void setPassportMandatory(boolean isPassportMandatory) {
			this.isPassportMandatory = isPassportMandatory;
		}
		public ArrayList<OriginDestinationOption> getOriginDestinationOptions() {
			return originDestinationOptions;
		}
		public void setOriginDestinationOptions(ArrayList<OriginDestinationOption> originDestinationOptions) {
			this.originDestinationOptions = originDestinationOptions;
		}
		public int getPaxNameCharacterLimit() {
			return paxNameCharacterLimit;
		}
		public void setPaxNameCharacterLimit(int paxNameCharacterLimit) {
			this.paxNameCharacterLimit = paxNameCharacterLimit;
		}
		public ArrayList<String> getRequiredFieldsToBook() {
			return requiredFieldsToBook;
		}
		public void setRequiredFieldsToBook(ArrayList<String> requiredFieldsToBook) {
			this.requiredFieldsToBook = requiredFieldsToBook;
		}
		public int getSequenceNumber() {
			return sequenceNumber;
		}
		public void setSequenceNumber(int sequenceNumber) {
			this.sequenceNumber = sequenceNumber;
		}
		public String getTicketType() {
			return ticketType;
		}
		public void setTicketType(String ticketType) {
			this.ticketType = ticketType;
		}
		public String getValidatingAirlineCode() {
			return validatingAirlineCode;
		}
		public void setValidatingAirlineCode(String validatingAirlineCode) {
			this.validatingAirlineCode = validatingAirlineCode;
		}
		public PricedItinerary(AirItineraryPricingInfo airItineraryPricingInfo, String directionInd,
				boolean isPassportMandatory, ArrayList<OriginDestinationOption> originDestinationOptions,
				int paxNameCharacterLimit, ArrayList<String> requiredFieldsToBook, int sequenceNumber,
				String ticketType, String validatingAirlineCode) {
			super();
			this.airItineraryPricingInfo = airItineraryPricingInfo;
			this.directionInd = directionInd;
			this.isPassportMandatory = isPassportMandatory;
			this.originDestinationOptions = originDestinationOptions;
			this.paxNameCharacterLimit = paxNameCharacterLimit;
			this.requiredFieldsToBook = requiredFieldsToBook;
			this.sequenceNumber = sequenceNumber;
			this.ticketType = ticketType;
			this.validatingAirlineCode = validatingAirlineCode;
		}
		public PricedItinerary() {
			super();
		}
	    

}
