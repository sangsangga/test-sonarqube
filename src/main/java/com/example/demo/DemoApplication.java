package com.example.demo;

import constant.PaymentEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import servicedb.MagicNumber;
import servicedb.newService;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
		String nullString = null;
		String myString = null;
		String unUsed = "test";

		//deprecated code can't be used
		String name = getMyName();


		//String literal on the left
		System.out.println("Equal? " + myString.equals("foo"));

		//naming - variable
		String WrongVariableName = "";

		// use stringUtils
		Boolean isEmptyStringUtil = StringUtils.isEmpty(WrongVariableName);
		Boolean isEmptyString = WrongVariableName.isEmpty();
		Boolean isEmptyStringNull = nullString.isEmpty();


		// magic number
		for (int i = 0; i< 4; i++) {
			System.out.println(i);
		}

		// boxing boolean
		Boolean test = testBoolean();
		if (Boolean.TRUE.equals(test)) {
			System.out.println("test");
		}

		System.out.println(isEmptyStringNull);
		System.out.println(isEmptyStringUtil);
		System.out.println(isEmptyStringNull);
		System.out.println(isEmptyString);
		System.out.println(name);




	}

	private static Boolean testBoolean () {
		return false;
	}

	public String mySchool () {
		int age = 18;
		if (age < 5 ) {
			return "Balita";
		} else if (age > 6 && age <= 12) {
			return "SD";
		} else if (age > 12 && age < 15) {
			return "SMP";
		}
		return "SMA";
	}

	//code duplication
	public String myAge () {
		int age = 18;
		if (age < 5 ) {
			return "Balita";
		} else if (age > 6 && age <= 12) {
			return "SD";
		} else if (age > 12 && age < 15) {
			return "SMP";
		}
		return "SMA";
	}

	@Deprecated
	public static String getMyName () {
		return "MyName";
	}




}
