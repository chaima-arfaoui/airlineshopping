package com.worldsoft.multicityRequest;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RevalidationRequest {
	@JsonProperty("ListFaresourcecode")
	private ArrayList<ListFaresourcecode> listFaresourcecode;
	@JsonProperty("Target")
	private String target;
	@JsonProperty("ConversationId")
	private String conversationId;

	public ArrayList<ListFaresourcecode> getListFaresourcecode() {
		return listFaresourcecode;
	}

	public void setListFaresourcecode(ArrayList<ListFaresourcecode> listFaresourcecode) {
		this.listFaresourcecode = listFaresourcecode;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId(String conversationId) {
		this.conversationId = conversationId;
	}

	public RevalidationRequest(ArrayList<ListFaresourcecode> listFaresourcecode, String target, String conversationId) {
		super();
		this.listFaresourcecode = listFaresourcecode;
		this.target = target;
		this.conversationId = conversationId;
	}

	public RevalidationRequest() {
		super();
	}

}
