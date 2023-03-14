package com.worldsoft.multicityResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PricedItineraryS {
	@JsonProperty("RequiredFieldsToBookInOtherLanguages")
	private ArrayList<Object> requiredFieldsToBookInOtherLanguages;
	@JsonProperty("OriginDestinationOptions")
	private ArrayList<OriginDestinationOption> originDestinationOptions;
	@JsonProperty("AirItineraryPricingInfo")
	private AirItineraryPricingInfoS airItineraryPricingInfo;
	@JsonProperty("ExtraServices1_1")
	private Object extraServices1_1;
	@JsonProperty("RequiredFieldsToBook")
	private Object requiredFieldsToBook;
	@JsonProperty("SequenceNumber")
	private int sequenceNumber;
	@JsonProperty("DirectionInd")
	private String directionInd;
	@JsonProperty("TicketType")
	private String ticketType;
	@JsonProperty("ValidatingAirlineCode")
	private String validatingAirlineCode;
	@JsonProperty("IsPassportMandatory")
	private boolean isPassportMandatory;
	@JsonProperty("IsResidentFare")
	private boolean isResidentFare;
	@JsonProperty("ResidentFareDocumentTypeLists")
	private Object residentFareDocumentTypeLists;
	@JsonProperty("PaxNameCharacterLimit")
	private int paxNameCharacterLimit;
	@JsonProperty("FirstNameCharacterLimit")
	private int firstNameCharacterLimit;
	@JsonProperty("LastNameCharacterLimit")
	private int lastNameCharacterLimit;
	@JsonProperty("Fulfillmentdetails")
	private Fulfillmentdetails fulfillmentdetails;

	public ArrayList<Object> getRequiredFieldsToBookInOtherLanguages() {
		return requiredFieldsToBookInOtherLanguages;
	}

	public void setRequiredFieldsToBookInOtherLanguages(ArrayList<Object> requiredFieldsToBookInOtherLanguages) {
		this.requiredFieldsToBookInOtherLanguages = requiredFieldsToBookInOtherLanguages;
	}

	public ArrayList<OriginDestinationOption> getOriginDestinationOptions() {
		return originDestinationOptions;
	}

	public void setOriginDestinationOptions(ArrayList<OriginDestinationOption> originDestinationOptions) {
		this.originDestinationOptions = originDestinationOptions;
	}

	public AirItineraryPricingInfoS getAirItineraryPricingInfo() {
		return airItineraryPricingInfo;
	}

	public void setAirItineraryPricingInfo(AirItineraryPricingInfoS airItineraryPricingInfo) {
		this.airItineraryPricingInfo = airItineraryPricingInfo;
	}

	public Object getExtraServices1_1() {
		return extraServices1_1;
	}

	public void setExtraServices1_1(Object extraServices1_1) {
		this.extraServices1_1 = extraServices1_1;
	}

	public Object getRequiredFieldsToBook() {
		return requiredFieldsToBook;
	}

	public void setRequiredFieldsToBook(Object requiredFieldsToBook) {
		this.requiredFieldsToBook = requiredFieldsToBook;
	}

	public int getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getDirectionInd() {
		return directionInd;
	}

	public void setDirectionInd(String directionInd) {
		this.directionInd = directionInd;
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

	public boolean isPassportMandatory() {
		return isPassportMandatory;
	}

	public void setPassportMandatory(boolean isPassportMandatory) {
		this.isPassportMandatory = isPassportMandatory;
	}

	public boolean isResidentFare() {
		return isResidentFare;
	}

	public void setResidentFare(boolean isResidentFare) {
		this.isResidentFare = isResidentFare;
	}

	public Object getResidentFareDocumentTypeLists() {
		return residentFareDocumentTypeLists;
	}

	public void setResidentFareDocumentTypeLists(Object residentFareDocumentTypeLists) {
		this.residentFareDocumentTypeLists = residentFareDocumentTypeLists;
	}

	public int getPaxNameCharacterLimit() {
		return paxNameCharacterLimit;
	}

	public void setPaxNameCharacterLimit(int paxNameCharacterLimit) {
		this.paxNameCharacterLimit = paxNameCharacterLimit;
	}

	public int getFirstNameCharacterLimit() {
		return firstNameCharacterLimit;
	}

	public void setFirstNameCharacterLimit(int firstNameCharacterLimit) {
		this.firstNameCharacterLimit = firstNameCharacterLimit;
	}

	public int getLastNameCharacterLimit() {
		return lastNameCharacterLimit;
	}

	public void setLastNameCharacterLimit(int lastNameCharacterLimit) {
		this.lastNameCharacterLimit = lastNameCharacterLimit;
	}

	public Fulfillmentdetails getFulfillmentdetails() {
		return fulfillmentdetails;
	}

	public void setFulfillmentdetails(Fulfillmentdetails fulfillmentdetails) {
		this.fulfillmentdetails = fulfillmentdetails;
	}

	public PricedItineraryS(ArrayList<Object> requiredFieldsToBookInOtherLanguages,
			ArrayList<OriginDestinationOption> originDestinationOptions,
			AirItineraryPricingInfoS airItineraryPricingInfo, Object extraServices1_1, Object requiredFieldsToBook,
			int sequenceNumber, String directionInd, String ticketType, String validatingAirlineCode,
			boolean isPassportMandatory, boolean isResidentFare, Object residentFareDocumentTypeLists,
			int paxNameCharacterLimit, int firstNameCharacterLimit, int lastNameCharacterLimit,
			Fulfillmentdetails fulfillmentdetails) {
		super();
		this.requiredFieldsToBookInOtherLanguages = requiredFieldsToBookInOtherLanguages;
		this.originDestinationOptions = originDestinationOptions;
		this.airItineraryPricingInfo = airItineraryPricingInfo;
		this.extraServices1_1 = extraServices1_1;
		this.requiredFieldsToBook = requiredFieldsToBook;
		this.sequenceNumber = sequenceNumber;
		this.directionInd = directionInd;
		this.ticketType = ticketType;
		this.validatingAirlineCode = validatingAirlineCode;
		this.isPassportMandatory = isPassportMandatory;
		this.isResidentFare = isResidentFare;
		this.residentFareDocumentTypeLists = residentFareDocumentTypeLists;
		this.paxNameCharacterLimit = paxNameCharacterLimit;
		this.firstNameCharacterLimit = firstNameCharacterLimit;
		this.lastNameCharacterLimit = lastNameCharacterLimit;
		this.fulfillmentdetails = fulfillmentdetails;
	}

	public PricedItineraryS() {
		super();
	}

}
