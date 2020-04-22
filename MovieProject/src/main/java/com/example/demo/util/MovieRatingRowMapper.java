package com.example.demo.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.MovieRating;

public class MovieRatingRowMapper implements RowMapper<MovieRating>{

	@Override
	public MovieRating mapRow(ResultSet rs, int rowNum) throws SQLException {
		MovieRating movieRating =new MovieRating();
		movieRating.setId(rs.getString("ID"));
		movieRating.setMovieName(rs.getString("MOVIE_NAME"));
		movieRating.setRating(rs.getInt("RATING"));
		return movieRating;
	}

	

}
