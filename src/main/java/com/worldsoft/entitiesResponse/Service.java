package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Service {
	@JsonProperty("Type") 
    private String type;
    @JsonProperty("NameNumber") 
    private int nameNumber;
    @JsonProperty("IsMandatory") 
    private boolean isMandatory;
    @JsonProperty("Description") 
    private String description;
    @JsonProperty("Behavior") 
    private String behavior;
    @JsonProperty("ServiceId") 
    private String serviceId;
    @JsonProperty("CheckInType") 
    private String checkInType;
    @JsonProperty("ServiceCost") 
    private ServiceCost serviceCost;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNameNumber() {
		return nameNumber;
	}
	public void setNameNumber(int nameNumber) {
		this.nameNumber = nameNumber;
	}
	public boolean isMandatory() {
		return isMandatory;
	}
	public void setMandatory(boolean isMandatory) {
		this.isMandatory = isMandatory;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBehavior() {
		return behavior;
	}
	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getCheckInType() {
		return checkInType;
	}
	public void setCheckInType(String checkInType) {
		this.checkInType = checkInType;
	}
	public ServiceCost getServiceCost() {
		return serviceCost;
	}
	public void setServiceCost(ServiceCost serviceCost) {
		this.serviceCost = serviceCost;
	}
	public Service(String type, int nameNumber, boolean isMandatory, String description, String behavior,
			String serviceId, String checkInType, ServiceCost serviceCost) {
		super();
		this.type = type;
		this.nameNumber = nameNumber;
		this.isMandatory = isMandatory;
		this.description = description;
		this.behavior = behavior;
		this.serviceId = serviceId;
		this.checkInType = checkInType;
		this.serviceCost = serviceCost;
	}
	public Service() {
		super();
	}
    

}
