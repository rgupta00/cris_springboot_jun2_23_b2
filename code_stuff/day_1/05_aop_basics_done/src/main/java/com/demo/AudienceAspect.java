package com.demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect	//Aspect =advice + pointcut*
public class AudienceAspect {
	
	
//	@Before("execution( * com.demo..*.do*(..))")
//	public void clapping() {
//		System.out.println("wow maza aa gaya!");
//	}
	
	
	@After("execution( * com.demo..*.do*(..))")
	public void clapping1() {
		System.out.println("after");
	}
	
	@AfterReturning("execution( * com.demo..*.do*(..))")
	public void clapping2() {
		System.out.println("after returning");
	}
	
}


//@Pointcut("execution( * com.demo.*.*(..))")
//public void foo() {}
//
//@After("foo()")
//public void clapping() {
//	System.out.println("wow maza aa gaya!");
//}