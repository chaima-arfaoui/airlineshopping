package com.worldsoft.ptrentitiesResponse;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PTRDetail {
	@JsonProperty("PTRId")
	public int pTRId;
	@JsonProperty("PTRType")
	public String pTRType;
	@JsonProperty("MFRef")
	public String mFRef;
	@JsonProperty("BookingStatus")
	public String bookingStatus;
	@JsonProperty("PTRStatus")
	public String pTRStatus;
	@JsonProperty("CreditNoteNumber")
	public String creditNoteNumber;
	@JsonProperty("TotalRefundAmount")
	public String totalRefundAmount;
	@JsonProperty("Currency")
	public String currency;
	@JsonProperty("CreatedBy")
	public String createdBy;
	@JsonProperty("Resolution")
	public String resolution;
	@JsonProperty("CreditNoteStatus")
	public String creditNoteStatus;
	public ArrayList<PTRPaxDetail> pTRPaxDetails;

	public int getpTRId() {
		return pTRId;
	}

	public void setpTRId(int pTRId) {
		this.pTRId = pTRId;
	}

	public String getpTRType() {
		return pTRType;
	}

	public void setpTRType(String pTRType) {
		this.pTRType = pTRType;
	}

	public String getmFRef() {
		return mFRef;
	}

	public void setmFRef(String mFRef) {
		this.mFRef = mFRef;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public String getpTRStatus() {
		return pTRStatus;
	}

	public void setpTRStatus(String pTRStatus) {
		this.pTRStatus = pTRStatus;
	}

	public String getCreditNoteNumber() {
		return creditNoteNumber;
	}

	public void setCreditNoteNumber(String creditNoteNumber) {
		this.creditNoteNumber = creditNoteNumber;
	}

	public String getTotalRefundAmount() {
		return totalRefundAmount;
	}

	public void setTotalRefundAmount(String totalRefundAmount) {
		this.totalRefundAmount = totalRefundAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getCreditNoteStatus() {
		return creditNoteStatus;
	}

	public void setCreditNoteStatus(String creditNoteStatus) {
		this.creditNoteStatus = creditNoteStatus;
	}

	public ArrayList<PTRPaxDetail> getpTRPaxDetails() {
		return pTRPaxDetails;
	}

	public void setpTRPaxDetails(ArrayList<PTRPaxDetail> pTRPaxDetails) {
		this.pTRPaxDetails = pTRPaxDetails;
	}

	public PTRDetail(int pTRId, String pTRType, String mFRef, String bookingStatus, String pTRStatus,
			String creditNoteNumber, String totalRefundAmount, String currency, String createdBy, String resolution,
			String creditNoteStatus, ArrayList<PTRPaxDetail> pTRPaxDetails) {
		super();
		this.pTRId = pTRId;
		this.pTRType = pTRType;
		this.mFRef = mFRef;
		this.bookingStatus = bookingStatus;
		this.pTRStatus = pTRStatus;
		this.creditNoteNumber = creditNoteNumber;
		this.totalRefundAmount = totalRefundAmount;
		this.currency = currency;
		this.createdBy = createdBy;
		this.resolution = resolution;
		this.creditNoteStatus = creditNoteStatus;
		this.pTRPaxDetails = pTRPaxDetails;
	}

	public PTRDetail() {
		super();
	}

}
