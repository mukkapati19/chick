package services;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import bussiness.Bank;

public class LogAroundService implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO Auto-generated method stub
		Log l=LogFactory.getLog(Bank.class);
		l.info("before deposit ....");
		Object ret=mi.proceed();
		l.info("after deposit....");
		//System.out.println(ret);
		return ret;
	}

	}


