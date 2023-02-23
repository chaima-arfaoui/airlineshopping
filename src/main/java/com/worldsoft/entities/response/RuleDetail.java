package com.worldsoft.entities.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RuleDetail {
	@JsonProperty("Category") 
    private String category;
    @JsonProperty("Rules") 
    private String rules;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getRules() {
		return rules;
	}
	public void setRules(String rules) {
		this.rules = rules;
		
	}
	public RuleDetail() {
		super();
	}
	public RuleDetail(String category, String rules) {
		super();
		this.category = category;
		this.rules = rules;
	}

}
