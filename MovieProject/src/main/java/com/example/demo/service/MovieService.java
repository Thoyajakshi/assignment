package com.example.demo.service;

public interface MovieService {

	public void updateMovieRating(String customerId,String movieName,String rating);
	public String retrieveHighRatedMovie();
}
