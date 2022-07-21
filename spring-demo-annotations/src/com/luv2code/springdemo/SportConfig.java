package com.luv2code.springdemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configuration
// @ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
@PropertySource("classpath:mylogger.properties")
public class SportConfig {
	
	@Bean
	public MyLoggerConfig myLoggerConfig(@Value("${root.logger.level}") String rootLoggerLevel,
										 @Value("${printed.logger.level}") String printedLoggerLevel) {

		MyLoggerConfig myLoggerConfig = new MyLoggerConfig(rootLoggerLevel, printedLoggerLevel);

		return myLoggerConfig;
	}
	
	// define bean for our sad fortune service
	// the method name will be the bean name
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}

}
