package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AirLineDetails;
import com.example.demo.repository.AirLineRepository;
import com.example.demo.response.Response;

@Service
public class AirLineServiceImpl implements AirLineService {

	@Autowired
	AirLineRepository repository;
	
	@Override
	public List<AirLineDetails> getScheduledFlights() {
		return repository.getScheduledFlights();
	}

	@Override
	public String getFlightStatus(int pnr) {
		return repository.getFlightStatus(pnr);
	}
	
	



}
