package com.learn.spring.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.learn.spring.java.model.Car;
import com.learn.spring.java.model.ElectricCar;

@Configuration
@Import(value = ElectricCar.class)
public class BeanDependencyAppConfig {

	@Bean
	public Car car() {
		return new Car();
	}
}
