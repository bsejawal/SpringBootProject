package com.bsejawal.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
/*	 
//	@Before("execution(public String com.bsejawal.spring.aop.model.Circle.getName())")
	@Before("allGetters() && allCircleMethods())")
	public void loggingAdvice(){
		System.out.println("Advice run. Get method called");
	}*/
	
	 
	@Before("allCircleMethods())")
	public void loggingAdvice(JoinPoint joinPoint){ // JointPoint has information about the actual method called that trigger advice
//		System.out.println("Advice run. Get method called");
		System.out.println(joinPoint.toString());
	}
	
	/*@Before("allGetters())")
	public void secondAdvice(){
		System.out.println("Second Advice executed");
	}*/
	
	@Pointcut("execution(* get*())")
	public void allGetters(){
		
	}
//	@Pointcut("execution(* * com.bsejawal.spring.aop.model.Circle.*(..))") // all access specifier, all return type, all methods, any arguments
//	@Pointcut("within(com.bsejawal.spring.aop.model.Circle)") // all methods of this class
//	@Pointcut("within(com.bsejawal.spring.aop.model.*)") // to all classes of this package
//	@Pointcut("within(com.bsejawal.spring.aop.model..*)") // double dot means, this applies to sub package(s) also
	@Pointcut("within(com.bsejawal.spring.aop.model.Circle)")
	public void allCircleMethods(){
		
	}

}