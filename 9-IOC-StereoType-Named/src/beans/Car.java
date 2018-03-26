package beans;

import javax.annotation.Resource;
import javax.inject.Named;

import eng.Engine;

//@Component
@Named
public class Car {
@Resource	
private Engine engine;

public Engine getEngine() {
	return engine;
}

public void setEngine(Engine engine) {
	this.engine = engine;
}

public void engineName(){
	System.out.println("car engine name is"+engine.getName());
}
}
