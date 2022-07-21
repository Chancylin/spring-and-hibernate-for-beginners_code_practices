package com.luv2code.springdemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String fortune;
	
	public FileFortuneService() {
		System.out.println(">> FileFortuneService: inside default constructor");
	}
	
	@PostConstruct
	private void prepareFortune() throws FileNotFoundException {
		
		System.out.println(">> FileFortuneService: inside method preparaFortune (my own solution)");
		
		Scanner scanner = new Scanner(new FileReader("fortune-data.txt"));
		
		StringBuilder sb = new StringBuilder();
		
		while(scanner.hasNextLine()) {
		    sb.append(scanner.nextLine());
		}
		scanner.close();
		
		fortune = sb.toString();
	}
	
	@Override
	public String getFortune() {
		return fortune;
	}

}
