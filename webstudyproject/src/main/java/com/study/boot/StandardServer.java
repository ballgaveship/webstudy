package com.study.boot;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StandardServer {
	
	private static ConfigurableApplicationContext context;

	public static void main(String[] args) {
		Class<?> clazz = null;
		try {
			clazz = Class.forName("com.study.appconfig.Appconfig");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		context = new AnnotationConfigApplicationContext(clazz);
		context.registerShutdownHook();
		
		for(;;) {}
	}
	
}
