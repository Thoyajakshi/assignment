package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Movie {

	private String movieName;

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

}
