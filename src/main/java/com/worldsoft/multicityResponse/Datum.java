package com.worldsoft.multicityResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Datum {
	@JsonProperty("ConversationId")
	public String conversationId;
	@JsonProperty("FlightSegmentList")
	public ArrayList<FlightSegmentList> flightSegmentList;
	@JsonProperty("ItineraryReferenceList")
	public ArrayList<ItineraryReferenceList> itineraryReferenceList;
	@JsonProperty("FulfillmentDetailsList")
	public ArrayList<Object> fulfillmentDetailsList;
	@JsonProperty("PenaltiesInfoList")
	public ArrayList<PenaltiesInfoList> penaltiesInfoList;
	@JsonProperty("FlightFaresList")
	public ArrayList<FlightFaresList> flightFaresList;
	@JsonProperty("PricedItineraries")
	public ArrayList<PricedItinerary> pricedItineraries;
	@JsonProperty("ATAinfoList")
	public ArrayList<Object> aTAinfoList;
	@JsonProperty("GroupedItems")
	public ArrayList<GroupedItem> groupedItems;

	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public ArrayList<FlightSegmentList> getFlightSegmentList() {
		return flightSegmentList;
	}

	public void setFlightSegmentList(ArrayList<FlightSegmentList> flightSegmentList) {
		this.flightSegmentList = flightSegmentList;
	}

	public ArrayList<ItineraryReferenceList> getItineraryReferenceList() {
		return itineraryReferenceList;
	}

	public void setItineraryReferenceList(ArrayList<ItineraryReferenceList> itineraryReferenceList) {
		this.itineraryReferenceList = itineraryReferenceList;
	}

	public ArrayList<Object> getFulfillmentDetailsList() {
		return fulfillmentDetailsList;
	}

	public void setFulfillmentDetailsList(ArrayList<Object> fulfillmentDetailsList) {
		this.fulfillmentDetailsList = fulfillmentDetailsList;
	}

	public ArrayList<PenaltiesInfoList> getPenaltiesInfoList() {
		return penaltiesInfoList;
	}

	public void setPenaltiesInfoList(ArrayList<PenaltiesInfoList> penaltiesInfoList) {
		this.penaltiesInfoList = penaltiesInfoList;
	}

	public ArrayList<FlightFaresList> getFlightFaresList() {
		return flightFaresList;
	}

	public void setFlightFaresList(ArrayList<FlightFaresList> flightFaresList) {
		this.flightFaresList = flightFaresList;
	}

	public ArrayList<PricedItinerary> getPricedItineraries() {
		return pricedItineraries;
	}

	public void setPricedItineraries(ArrayList<PricedItinerary> pricedItineraries) {
		this.pricedItineraries = pricedItineraries;
	}

	public ArrayList<Object> getaTAinfoList() {
		return aTAinfoList;
	}

	public void setaTAinfoList(ArrayList<Object> aTAinfoList) {
		this.aTAinfoList = aTAinfoList;
	}

	public ArrayList<GroupedItem> getGroupedItems() {
		return groupedItems;
	}

	public void setGroupedItems(ArrayList<GroupedItem> groupedItems) {
		this.groupedItems = groupedItems;
	}

	public Datum(String conversationId, ArrayList<FlightSegmentList> flightSegmentList,
			ArrayList<ItineraryReferenceList> itineraryReferenceList, ArrayList<Object> fulfillmentDetailsList,
			ArrayList<PenaltiesInfoList> penaltiesInfoList, ArrayList<FlightFaresList> flightFaresList,
			ArrayList<PricedItinerary> pricedItineraries, ArrayList<Object> aTAinfoList,
			ArrayList<GroupedItem> groupedItems) {
		super();
		this.conversationId = conversationId;
		this.flightSegmentList = flightSegmentList;
		this.itineraryReferenceList = itineraryReferenceList;
		this.fulfillmentDetailsList = fulfillmentDetailsList;
		this.penaltiesInfoList = penaltiesInfoList;
		this.flightFaresList = flightFaresList;
		this.pricedItineraries = pricedItineraries;
		this.aTAinfoList = aTAinfoList;
		this.groupedItems = groupedItems;
	}

	public Datum() {
		super();
	}

}
