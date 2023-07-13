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
		MagicNumber magicNumber = new MagicNumber();
		String nullString = null;
		String myString = null;

		List<String> listPayment = new ArrayList<>();
		listPayment.add("BCA");
		listPayment.add("Gopay");


		magicNumber.testMagicNumber();

		String briPayment = listPayment.stream().filter(payment -> payment.equals("BRI")).findAny().orElse(null);
		System.out.println();


		System.out.println("Equal? " + myString.equals("foo"));

		//naming - variable
		String WrongVariableName = "";

		// constant on left
		Boolean constantLeft = briPayment.equals(PaymentEnum.BCA);

		// use stringUtils
		Boolean isEmptyStringUtil = StringUtils.isEmpty(WrongVariableName);
		Boolean isEmptyString = WrongVariableName.isEmpty();
		Boolean isEmptyStringNull = nullString.isEmpty();


		// magic number
		double radius = 20;
		double circle = 3.14 * radius;

		// boxing boolean
		Boolean test = testBoolean();
		if (test) {
			System.out.println("test");
		}

		System.out.println(isEmptyStringNull);
		System.out.println(isEmptyStringUtil);
		System.out.println(isEmptyStringNull);
		System.out.println(isEmptyString);
		System.out.println(constantLeft);
		printMyName();




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
	public static void printMyName () {
		System.out.println("MyName");
	}




}
