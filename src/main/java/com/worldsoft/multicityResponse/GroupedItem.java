package com.worldsoft.multicityResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GroupedItem {
	@JsonProperty("Itins")
	public ArrayList<String> itins;
	@JsonProperty("Segments")
	public ArrayList<String> segments;

	public ArrayList<String> getItins() {
		return itins;
	}

	public void setItins(ArrayList<String> itins) {
		this.itins = itins;
	}

	public ArrayList<String> getSegments() {
		return segments;
	}

	public void setSegments(ArrayList<String> segments) {
		this.segments = segments;
	}

	public GroupedItem(ArrayList<String> itins, ArrayList<String> segments) {
		super();
		this.itins = itins;
		this.segments = segments;
	}

	public GroupedItem() {
		super();
	}

}
