package com.luv2code.aopdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableAspectJAutoProxy
@PropertySource("classpath:mylogger.properties")
@ComponentScan("com.luv2code.aopdemo")
public class DemoConfig {
	
	@Bean
	public MyLoggerConfig myLoggerConfig(@Value("${root.logger.level}") String rootLoggerLevel,
										 @Value("${printed.logger.level}") String printedLoggerLevel) {

		MyLoggerConfig myLoggerConfig = new MyLoggerConfig(rootLoggerLevel, printedLoggerLevel);

		return myLoggerConfig;
	}
	
}
