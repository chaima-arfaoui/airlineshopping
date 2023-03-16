package com.worldsoft.multicityResponse;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CabinBaggage {
	 @JsonProperty("Type") 
	    public String type;
	    @JsonProperty("Value") 
	    public String value;
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public CabinBaggage(String type, String value) {
			super();
			this.type = type;
			this.value = value;
		}
		public CabinBaggage() {
			super();
		}
	    

}
