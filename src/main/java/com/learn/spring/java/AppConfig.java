package com.learn.spring.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.learn.spring.java.model.Vehicle;

/**
 * @Configuration - indicates that this class can be used a source of bean definitions by the Spring IOC container. 
 * @Bean -indicates that method annotated with it wil return an object that should be registered as a bean in the 
 * spring application context.
 * 
 * @author Karen
 *
 */
@Configuration
public class AppConfig {
	
	@Bean
	public Vehicle vehicle() {
		return new Vehicle();
	}

}
