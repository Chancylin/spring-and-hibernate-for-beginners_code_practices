package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class AfterThrowingDemoApp {

	public static void main(String[] args) {
		// read Spring config java file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get bean from Spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

		// call a method to find the accounts
		List<Account> theAccounts = null;
		
		try {
			// add a boolean flag to simulate exception
			boolean tripWire = true;
			theAccountDAO.findAccounts(tripWire);
		} catch (Exception ex) {
			System.out.println("\n\nMain Program... caught exception: " + ex);
		}
		
		// display the accounts
		System.out.println("\n\nMain Program: AfterThrowingDemoApp");
		System.out.println("----");
		
		System.out.println(theAccounts);
		
		System.out.println("\n");
		
		// close context
		context.close();

	}

}
