package com.worldsoft.entitiesResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ETicket {
	 @JsonProperty("ItemRPH") 
	    private int itemRPH;
	    @JsonProperty("ETicketNumber") 
	    private String eTicketNumber;
	    @JsonProperty("ETicketType") 
	    private String eTicketType;
		public int getItemRPH() {
			return itemRPH;
		}
		public void setItemRPH(int itemRPH) {
			this.itemRPH = itemRPH;
		}
		public String geteTicketNumber() {
			return eTicketNumber;
		}
		public void seteTicketNumber(String eTicketNumber) {
			this.eTicketNumber = eTicketNumber;
		}
		public String geteTicketType() {
			return eTicketType;
		}
		public void seteTicketType(String eTicketType) {
			this.eTicketType = eTicketType;
		}
		public ETicket(int itemRPH, String eTicketNumber, String eTicketType) {
			super();
			this.itemRPH = itemRPH;
			this.eTicketNumber = eTicketNumber;
			this.eTicketType = eTicketType;
		}
		public ETicket() {
			super();
		}
	    

}
