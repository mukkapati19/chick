package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client {

	public static void main(String[] args) {
		
ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
Car c=(Car)applicationContext.getBean(Car.class);
	c.engineName();
	
	}

}
