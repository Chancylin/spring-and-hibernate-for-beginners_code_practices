package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		// read Spring config java file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get bean from Spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

		// call business method
		theAccountDAO.addAccount();
		
		// do it again here
		System.out.println("\n lets call it again!\n");
		
		// call the business method again
		theAccountDAO.addAccount();
		
		// close context
		context.close();

	}

}
