package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Fulfillmentdetails {
	@JsonProperty("Ticketing")
	public Ticketing ticketing;
	@JsonProperty("Void")
	public Void voidd;
	@JsonProperty("Exchange")
	public Exchange exchange;
	@JsonProperty("Refund")
	public Refund refund;

	public Ticketing getTicketing() {
		return ticketing;
	}

	public void setTicketing(Ticketing ticketing) {
		this.ticketing = ticketing;
	}

	public Void getVoidd() {
		return voidd;
	}

	public void setVoidd(Void voidd) {
		this.voidd = voidd;
	}

	public Exchange getExchange() {
		return exchange;
	}

	public void setExchange(Exchange exchange) {
		this.exchange = exchange;
	}

	public Refund getRefund() {
		return refund;
	}

	public void setRefund(Refund refund) {
		this.refund = refund;
	}

	public Fulfillmentdetails(Ticketing ticketing, Void voidd, Exchange exchange, Refund refund) {
		super();
		this.ticketing = ticketing;
		this.voidd = voidd;
		this.exchange = exchange;
		this.refund = refund;
	}

	public Fulfillmentdetails() {
		super();
	}

}
