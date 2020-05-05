package com.assessment.airlines.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class Request {

	private String source;
	private String destination;
	private int priceOrHop;
	private String indicator;
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getPriceOrHop() {
		return priceOrHop;
	}
	public void setPriceOrHop(int priceOrHop) {
		this.priceOrHop = priceOrHop;
	}
	public String getIndicator() {
		return indicator;
	}
	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}
	

}
