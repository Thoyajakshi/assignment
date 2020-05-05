package com.assessment.airlines.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.airlines.model.Request;
import com.assessment.airlines.model.AirLineResponse;
import com.assessment.airlines.service.AirLineService;

@RestController
public class AirLineController {
	@Autowired
	AirLineService service;
	
	@PostMapping("/flights")
	public AirLineResponse getSortedFlights(Request request) {
		AirLineResponse response=service.fetchFlightDetails(request);
		
		return response;
	}

}
