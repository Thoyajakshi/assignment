package com.example.demo.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.MovieRating;
import com.example.demo.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	MovieRepository repository;
	@Override
	public void updateMovieRating(String customerId, String movieName, String rating) {
		repository.insertRating(customerId, movieName, rating);
	}

	@Override
	public String retrieveHighRatedMovie() {
		List<String> movieList=repository.getMoviesList();
		List<MovieRating> movieRatingList=repository.getListOfMoviesAndRatings();
		HashMap<String, Integer> map=new HashMap<>();
		for(String movieName: movieList) {
			int sum=0;
			int count=0;
			for(MovieRating movieRating: movieRatingList) {
				if(movieRating.getMovieName().equalsIgnoreCase(movieName)) {
					sum=sum+movieRating.getRating();
					count++;
					
				}
			}
			map.put(movieName, (sum/count));
		}
		int highestRating=0;
		String highestMovie="";
		for(Map.Entry mapElement:map.entrySet()) {
			String key=(String) mapElement.getKey();
			int value=(int) mapElement.getValue();
			if(value>highestRating) {
				highestRating=value;
				highestMovie=key;
			}
		}
		return highestMovie;
	}

}
