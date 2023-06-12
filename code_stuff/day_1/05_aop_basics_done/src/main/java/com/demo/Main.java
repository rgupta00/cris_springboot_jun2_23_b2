package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;

public class Main {

	
	public static void main(String[] args) {
		//When magician show magic after then Audience must do clapping 
		
		Magician magician2=new Magician();
		System.out.println(magician2.getClass());
		
		
		//dp: Proxy dp
		ApplicationContext ctx=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
//		Foo foo=(Foo) ctx.getBean("foo");
//		
//		foo.doMagic();
		
		Magician magician=(Magician) ctx.getBean("m");
		magician.doMagic();
//		

	
		//System.out.println(magician.getClass());
		
		
	}
}






