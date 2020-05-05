package com.example.demo.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.AirLineDetails;

public class AirLineRowMapper implements RowMapper<AirLineDetails> {

	@Override
	public AirLineDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		AirLineDetails details=new AirLineDetails();
		details.setDestination(rs.getString("DESTINATION"));
		details.setName(rs.getString("NAME"));
		details.setPnr(rs.getInt("PNR"));
		details.setNoOfhops(rs.getInt("HOPS"));
		details.setSource(rs.getString("SOURCE"));
		details.setStatus(rs.getString("STATUS"));
		details.setTime(rs.getString("TIME"));
		details.setPrice(rs.getInt("PRICE"));
		return details;
	}


}
