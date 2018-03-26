package test;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bussiness.Bank;
import services.LogAroundService;

public class Client {
	public static void main(String args[]){
		
		ConfigurableApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
		Bank bproxy=(Bank)applicationContext.getBean("proxy");
	int a=bproxy.deposite(2000,"sbi143");
	System.out.println("money deposited.."+a);
		int i=bproxy.findAcnt("sbi143");
		System.out.println(i);
	applicationContext.close();
	}

}
