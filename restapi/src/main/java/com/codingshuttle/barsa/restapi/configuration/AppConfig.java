package com.codingshuttle.barsa.restapi.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import com.codingshuttle.barsa.restapi.ProdDB;
import org.springframework.context.annotation.Configuration;

import com.codingshuttle.barsa.restapi.DB;
import com.codingshuttle.barsa.restapi.DevDB;

@Configuration
public class AppConfig {

	@Bean
	@ConditionalOnProperty(name="project.mode", havingValue = "development")
	public DB getDevDBBean() {
		return new DevDB();
	}
	
	@Bean
	@ConditionalOnProperty(name="project.mode", havingValue = "production")
	public DB getProdDBBean() {
		return new ProdDB();
	}
}
