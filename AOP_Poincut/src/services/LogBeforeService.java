package services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import bussiness.Bank;

public class LogBeforeService implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object ret, Method m, Object[] param, Object o) throws Throwable {
		// TODO Auto-generated method stub
		Log l	=LogFactory.getLog(Bank.class);
	    l.info("deposit method......"+ret);
	
	}

//public class LogBeforeService Implements MethodBeforeAdvice
//@Override
//	public void before(Method m, Object[] param, Object o) throws Throwable {
//		
//	Log l	=LogFactory.getLog(Bank.class);
//	l.info("deposit method......");
//	}

}
