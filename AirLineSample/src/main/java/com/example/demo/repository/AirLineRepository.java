package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.AirLineDetails;
import com.example.demo.util.AirLineRowMapper;

@Repository
public class AirLineRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<AirLineDetails> getScheduledFlights(){
		return jdbcTemplate.query("SELECT * FROM AIRLINE_DETAILS", new AirLineRowMapper());
		 
	}
	
	public String getFlightStatus(int pnr) {
		return jdbcTemplate.queryForObject("SELECT STATUS from AIRLINE_DETAILS where pnr=?", new Object[]{pnr}, String.class);
	}
	
}
