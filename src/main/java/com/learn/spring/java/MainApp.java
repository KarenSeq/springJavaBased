package com.learn.spring.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learn.spring.java.model.Car;
import com.learn.spring.java.model.ElectricCar;
import com.learn.spring.java.model.Vehicle;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Vehicle vehicle = context.getBean(Vehicle.class);
		vehicle.setRegistrationId("KA-1234");
		System.out.println("Registration Id of vehicle is: " + vehicle.getRegistrationId());
		System.out.println("-----------------------------------------------------------------\n");
		
		System.out.println("--------------------Injecting bean dependency--------------------");
		
		/*
		 * You can also register multiple config classes as follows:
		 * AnnotationConfigApplicationContext ctx = new
		 * AnnotationConfigApplicationContext();
		 * 
		 * ctx.register(AppConfig.class, OtherConfig.class);
		 * ctx.register(AdditionalConfig.class); ctx.refresh();
		 */
		ApplicationContext context2 = new AnnotationConfigApplicationContext(BeanDependencyAppConfig.class);
		
		Car car = context2.getBean(Car.class);
		car.setBrand("Tesla");
		System.out.println("Brand of the car is: "+car.getBrand());
		ElectricCar ec = context2.getBean(ElectricCar.class);
		ec.setMileage("40");
		System.out.println("Car gives a mileage of "+ec.getMileage()+" kms");
		System.out.println("-----------------------------------------------------------------");
		
		((ConfigurableApplicationContext)context).close();
		((ConfigurableApplicationContext)context2).close();
	}
}
