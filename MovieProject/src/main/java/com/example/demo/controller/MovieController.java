package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.model.Movie;
import com.example.demo.model.Rating;
import com.example.demo.service.MovieServiceImpl;

@RestController
public class MovieController {

	@Autowired
	Movie movie;
	
	@Autowired
	Customer customer;
	
	@Autowired
	Rating movieRating;
	
	@Autowired
	MovieServiceImpl service;
	
	@RequestMapping(value="api/rest/customer/{customerId}/rate/{rating}/movieName/{movieName}")
	public void getCustomerId(@PathVariable(name="customerId") String customerId,@PathVariable(name="movieName") String movieName,@PathVariable(name="rating") String rating){
		customer.setCustomerId(customerId);
		movie.setMovieName(movieName);
		movieRating.setRating(rating);
		service.updateMovieRating(customerId, movieName, rating);
	}
	
	@GetMapping("/highestRatedMovie")
	public String getHighestRatedMovie() {
		return service.retrieveHighRatedMovie();
	}
	
}
