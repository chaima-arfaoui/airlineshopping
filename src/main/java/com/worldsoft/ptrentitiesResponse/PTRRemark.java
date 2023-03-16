package com.worldsoft.ptrentitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PTRRemark {
	@JsonProperty("Remarks")
	private String remarks;
	@JsonProperty("Reason")
	private String reason;
	@JsonProperty("RemarksType")
	private String remarksType;

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getRemarksType() {
		return remarksType;
	}

	public void setRemarksType(String remarksType) {
		this.remarksType = remarksType;
	}

	public PTRRemark(String remarks, String reason, String remarksType) {
		super();
		this.remarks = remarks;
		this.reason = reason;
		this.remarksType = remarksType;
	}

	public PTRRemark() {
		super();
	}

}
