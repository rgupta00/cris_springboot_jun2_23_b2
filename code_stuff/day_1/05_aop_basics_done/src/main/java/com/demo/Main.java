package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;

public class Main {

	
	public static void main(String[] args) {
	
		ApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Magician magician=(Magician) ctx.getBean("m");
		String value=magician.doMagic();
		System.out.println(value);
//		


		
	}
}






