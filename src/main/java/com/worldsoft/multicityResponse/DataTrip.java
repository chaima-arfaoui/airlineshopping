package com.worldsoft.multicityResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataTrip {
	private ArrayList<String> bookingRefs;
	@JsonProperty("Errors")
	private Object errors;

	public ArrayList<String> getBookingRefs() {
		return bookingRefs;
	}

	public void setBookingRefs(ArrayList<String> bookingRefs) {
		this.bookingRefs = bookingRefs;
	}

	public Object getErrors() {
		return errors;
	}

	public void setErrors(Object errors) {
		this.errors = errors;
	}

	public DataTrip(ArrayList<String> bookingRefs, Object errors) {
		super();
		this.bookingRefs = bookingRefs;
		this.errors = errors;
	}

	public DataTrip() {
		super();
	}

}
