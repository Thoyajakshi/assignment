package com.example.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.*;

public class DBConfig {

@Bean(name="datasource")
@ConfigurationProperties("spring.datasource")
public DataSource datasource() {
	return DataSourceBuilder.create().build();
}
@Bean(name="jdbcTemplate")
public JdbcTemplate getJdbcTemplate(@Qualifier("datasource") DataSource datasource) {
	return new JdbcTemplate(datasource,false);
	}
}
