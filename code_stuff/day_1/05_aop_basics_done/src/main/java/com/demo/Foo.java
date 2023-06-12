package com.demo;

import org.springframework.stereotype.Component;

@Component(value = "foo")
public class Foo {
	public void doMagic() {
		System.out.println("some foo work");
		
	}
}
