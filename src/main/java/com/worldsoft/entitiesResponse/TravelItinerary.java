package com.worldsoft.entitiesResponse;

import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TravelItinerary {
	@JsonProperty("MFRef") 
    private String mFRef;
    @JsonProperty("TripType") 
    private String tripType;
    @JsonProperty("ExtraServices") 
    private ExtraServices extraServices;
    @JsonProperty("TicketStatus") 
    private String ticketStatus;
    @JsonProperty("BookingStatus") 
    private String bookingStatus;
    @JsonProperty("Origin") 
    private String origin;
    @JsonProperty("Destination") 
    private String destination;
    @JsonProperty("FareType") 
    private String fareType;
    @JsonProperty("PassengerInfos") 
    private ArrayList<PassengerInfo> passengerInfos;
    @JsonProperty("TripDetailsPTC_FareBreakdowns") 
    private ArrayList<TripDetailsPTCFareBreakdown> tripDetailsPTC_FareBreakdowns;
    @JsonProperty("VoidingWindow") 
    private Date voidingWindow;
    @JsonProperty("ClientUTCOffset") 
    private double clientUTCOffset;
    @JsonProperty("Itineraries") 
    private ArrayList<Itinerary> itineraries;
    /*@JsonProperty("TransactionDetails") 
    private TransactionDetails transactionDetails;*/
    @JsonProperty("BookingNotes") 
    private ArrayList<Object> bookingNotes;
    @JsonProperty("TicketingTimeLimit") 
    private Date ticketingTimeLimit;
    @JsonProperty("BookingMode") 
    private int bookingMode;
    @JsonProperty("ReroutingAllowed") 
    private String reroutingAllowed;
    @JsonProperty("SpoilageFee") 
    private double spoilageFee;
	public String getmFRef() {
		return mFRef;
	}
	public void setmFRef(String mFRef) {
		this.mFRef = mFRef;
	}
	public String getTripType() {
		return tripType;
	}
	public void setTripType(String tripType) {
		this.tripType = tripType;
	}
	public ExtraServices getExtraServices() {
		return extraServices;
	}
	public void setExtraServices(ExtraServices extraServices) {
		this.extraServices = extraServices;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getFareType() {
		return fareType;
	}
	public void setFareType(String fareType) {
		this.fareType = fareType;
	}
	public ArrayList<PassengerInfo> getPassengerInfos() {
		return passengerInfos;
	}
	public void setPassengerInfos(ArrayList<PassengerInfo> passengerInfos) {
		this.passengerInfos = passengerInfos;
	}
	public ArrayList<TripDetailsPTCFareBreakdown> getTripDetailsPTC_FareBreakdowns() {
		return tripDetailsPTC_FareBreakdowns;
	}
	public void setTripDetailsPTC_FareBreakdowns(ArrayList<TripDetailsPTCFareBreakdown> tripDetailsPTC_FareBreakdowns) {
		this.tripDetailsPTC_FareBreakdowns = tripDetailsPTC_FareBreakdowns;
	}
	public Date getVoidingWindow() {
		return voidingWindow;
	}
	public void setVoidingWindow(Date voidingWindow) {
		this.voidingWindow = voidingWindow;
	}
	public double getClientUTCOffset() {
		return clientUTCOffset;
	}
	public void setClientUTCOffset(double clientUTCOffset) {
		this.clientUTCOffset = clientUTCOffset;
	}
	public ArrayList<Itinerary> getItineraries() {
		return itineraries;
	}
	public void setItineraries(ArrayList<Itinerary> itineraries) {
		this.itineraries = itineraries;
	}
	/*public TransactionDetails getTransactionDetails() {
		return transactionDetails;
	}
	public void setTransactionDetails(TransactionDetails transactionDetails) {
		this.transactionDetails = transactionDetails;
	}*/
	public ArrayList<Object> getBookingNotes() {
		return bookingNotes;
	}
	public void setBookingNotes(ArrayList<Object> bookingNotes) {
		this.bookingNotes = bookingNotes;
	}
	public Date getTicketingTimeLimit() {
		return ticketingTimeLimit;
	}
	public void setTicketingTimeLimit(Date ticketingTimeLimit) {
		this.ticketingTimeLimit = ticketingTimeLimit;
	}
	public int getBookingMode() {
		return bookingMode;
	}
	public void setBookingMode(int bookingMode) {
		this.bookingMode = bookingMode;
	}
	public String getReroutingAllowed() {
		return reroutingAllowed;
	}
	public void setReroutingAllowed(String reroutingAllowed) {
		this.reroutingAllowed = reroutingAllowed;
	}
	public double getSpoilageFee() {
		return spoilageFee;
	}
	public void setSpoilageFee(double spoilageFee) {
		this.spoilageFee = spoilageFee;
	}
	public TravelItinerary(String mFRef, String tripType, ExtraServices extraServices, String ticketStatus,
			String bookingStatus, String origin, String destination, String fareType,
			ArrayList<PassengerInfo> passengerInfos,
			ArrayList<TripDetailsPTCFareBreakdown> tripDetailsPTC_FareBreakdowns, Date voidingWindow,
			double clientUTCOffset, ArrayList<Itinerary> itineraries, TransactionDetails transactionDetails,
			ArrayList<Object> bookingNotes, Date ticketingTimeLimit, int bookingMode, String reroutingAllowed,
			double spoilageFee) {
		super();
		this.mFRef = mFRef;
		this.tripType = tripType;
		this.extraServices = extraServices;
		this.ticketStatus = ticketStatus;
		this.bookingStatus = bookingStatus;
		this.origin = origin;
		this.destination = destination;
		this.fareType = fareType;
		this.passengerInfos = passengerInfos;
		this.tripDetailsPTC_FareBreakdowns = tripDetailsPTC_FareBreakdowns;
		this.voidingWindow = voidingWindow;
		this.clientUTCOffset = clientUTCOffset;
		this.itineraries = itineraries;
		//this.transactionDetails = transactionDetails;
		this.bookingNotes = bookingNotes;
		this.ticketingTimeLimit = ticketingTimeLimit;
		this.bookingMode = bookingMode;
		this.reroutingAllowed = reroutingAllowed;
		this.spoilageFee = spoilageFee;
	}
	public TravelItinerary() {
		super();
	}
    
}
