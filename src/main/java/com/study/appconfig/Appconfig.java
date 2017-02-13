package com.study.appconfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@Configurable
@ImportResource({"classpath:context.xml"})
@ComponentScan(basePackages={
		"com.study.controller",
		"com.study.dao",
		"com.study.service"
	})
public class Appconfig {

}
