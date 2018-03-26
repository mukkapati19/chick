package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import engn.Engine;
@Component
public class Car {
	@Autowired
private Engine engine;

public void carInfo(){
	
	System.out.println("car engine model is "+engine.getModel());
}
}
