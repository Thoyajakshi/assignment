package com.assessment.airlines.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.airlines.model.AirLineDetails;
import com.assessment.airlines.model.Request;
import com.assessment.airlines.model.Response;
import com.assessment.airlines.model.AirLineResponse;
import com.assessment.airlines.service.AirLineService;
import com.assessment.airlines.transmitter.FlightTransmitter;

@Service
public class AirLineServiceImpl implements AirLineService {
	@Autowired
	FlightTransmitter transmitter;

	@Override
	public AirLineResponse fetchFlightDetails(Request request) {
		AirLineResponse response=new AirLineResponse();
		Response flightResponse=transmitter.getResponseFromFlightService();
		List<AirLineDetails> airLineDetails=new ArrayList<AirLineDetails>();
		if(null!=flightResponse && 0!=flightResponse.getResponse().size()) {
			for(AirLineDetails airLine:flightResponse.getResponse()) {
				if(request.getIndicator().equalsIgnoreCase("PRICE")) {
					if(airLine.getDestination().equalsIgnoreCase(request.getDestination())
							&& airLine.getSource().equalsIgnoreCase(request.getSource())
							&& request.getPriceOrHop()>=airLine.getPrice()) 
					{
						airLineDetails.add(airLine);
					}
				}
			else if(request.getIndicator().equalsIgnoreCase("HOP")) {
					if(airLine.getDestination().equalsIgnoreCase(request.getDestination())
							&& airLine.getSource().equalsIgnoreCase(request.getSource())
							&& request.getPriceOrHop()>=airLine.getNoOfhops()) 
					{
						airLineDetails.add(airLine);
					}
				}
			}
			if(airLineDetails.size()>0) {
				response.setFlightDetailsList(airLineDetails);
				response.setMessage(airLineDetails.size() + "Flights Found");
			}else {
				response.setMessage("0 Flights Found");
			}
		}else {
			response.setMessage("0 Flights Found");
		}
		
		return response;
	}

}
