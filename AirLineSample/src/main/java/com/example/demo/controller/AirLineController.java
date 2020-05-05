package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AirLineDetails;
import com.example.demo.response.Response;
import com.example.demo.service.AirLineServiceImpl;

@RestController
public class AirLineController {

	@Autowired
	AirLineDetails details;
	
	@Autowired
	AirLineServiceImpl service;
	
	@GetMapping(value="api/rest/ScheduledFlights")
	public @ResponseBody Response getScheduleFlights(){
		Response res=new Response();
		res.setResponse(service.getScheduledFlights());
		return res;
		
		
	}

	@RequestMapping(value="api/rest/status/{pnr}")
	public String getStatusOfFlight(@PathVariable(name="pnr") int pnr) {
		
		return service.getFlightStatus(pnr);
		
	}
}
