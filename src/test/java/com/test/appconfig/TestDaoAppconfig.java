package com.test.appconfig;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@Configurable
@ImportResource({"classpath:test-dao-context.xml"})
@ComponentScan(basePackages={
		"com.study.dao",
})
public class TestDaoAppconfig {

}
