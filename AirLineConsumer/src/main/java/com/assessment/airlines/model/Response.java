package com.assessment.airlines.model;

import java.util.List;

import org.springframework.stereotype.Component;


import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class Response {

private List<AirLineDetails> response;

public List<AirLineDetails> getResponse() {
	return response;
}

public void setResponse(List<AirLineDetails> response) {
	this.response = response;
}


}