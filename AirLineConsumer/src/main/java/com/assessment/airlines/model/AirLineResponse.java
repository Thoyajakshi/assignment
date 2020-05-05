package com.assessment.airlines.model;

import java.util.List;

public class AirLineResponse {
	
	private List<AirLineDetails> flightDetailsList;
	private String message;
	public List<AirLineDetails> getFlightDetailsList() {
		return flightDetailsList;
	}
	public void setFlightDetailsList(List<AirLineDetails> flightDetailsList) {
		this.flightDetailsList = flightDetailsList;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
