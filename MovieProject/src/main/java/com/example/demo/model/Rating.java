package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Rating {

	private String rating;

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

}
