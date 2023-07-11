package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Boolean test = testBoolean();

		if (test) {
			System.out.println("test");
		}

	}

	private static Boolean testBoolean () {
		return false;
	}



}
