package com.assessment.airlines.service;

import org.springframework.stereotype.Service;

import com.assessment.airlines.model.Request;
import com.assessment.airlines.model.AirLineResponse;


public interface AirLineService {
	public AirLineResponse fetchFlightDetails(Request request);
		

}
