package com.example.demo.service;

import java.util.List;

import com.example.demo.model.AirLineDetails;

public interface AirLineService {
	
	public List<AirLineDetails> getScheduledFlights();
	public String getFlightStatus(int pnr);

}
