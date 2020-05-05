package com.assessment.airlines.transmitter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.assessment.airlines.model.Response;
@Component
public class FlightTransmitter {

	@Autowired
	RestTemplate restTemplate;
	
	public Response getResponseFromFlightService() {
		Response response=new Response();
		try {
			//response=restTemplate.postForObject(url, request, responseType)
			response=restTemplate.getForObject("http://localhost:8080/api/rest/ScheduledFlights", Response.class);
		}catch(RestClientException exception) {
			System.out.println("Error in calling flight service"+exception.getMessage());
		}
		return response;
	}
}
