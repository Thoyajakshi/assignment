package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.MovieRating;
import com.example.demo.util.MovieRatingRowMapper;

@Repository
public class MovieRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void insertRating(String customerId,String movieName,String rating) {
		int count=jdbcTemplate.queryForObject("SELECT count(*) from CUSTOMER where id=?", new Object[]{customerId}, Integer.class); 
		if (count>0){ 
			jdbcTemplate.update("INSERT INTO MOVIE_RATING(id, movie_name, rating) VALUES (?,?,?) ", new Object[]{ customerId, movieName, rating});
		}
		}
	

		public List<String> getMoviesList(){
			List<String> movieList=jdbcTemplate.queryForList("SELECT DISTINCT MOVIE_NAME FROM MOVIE_RATING", String.class); 
			return movieList;
		}

		public List<MovieRating> getListOfMoviesAndRatings(){

		return jdbcTemplate.query("SELECT ID, MOVIE_NAME, RATING FROM MOVIE_RATING", new MovieRatingRowMapper());
		}
		
}
