package com.example.demo;

import constant.PaymentEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Boolean test = testBoolean();
		String paymentBca = "BCA";
		String WrongVariableName = "";
		List<Integer> emptyList = new ArrayList<>();
		List<String> listPayment = new ArrayList<>();
		listPayment.add("BCA");
		listPayment.add("Gopay");

		String briPayment = listPayment.stream().filter(payment -> payment.equals("BRI")).findAny().orElse(null);

		if (test) {
			System.out.println("test");
		}


		int number = Integer.parseInt("23");
		boolean startsWithTest = briPayment.startsWith("a") ;
		System.out.println(number);
		System.out.println(startsWithTest);
		System.out.println(testBooleanNull());

		if (paymentBca.equals(PaymentEnum.BCA)) {
			System.out.println("benar");
		}

		Boolean listEmpty = emptyList.isEmpty();
		Boolean listEmptyUtil = CollectionUtils.isEmpty(emptyList);
		Boolean isEmptyString = StringUtils.isEmpty(WrongVariableName);

		System.out.println(listEmptyUtil);
		System.out.println(listEmpty);
		System.out.println(isEmptyString);
	}

	private static Boolean testBoolean () {
		return false;
	}

	private static Boolean testBooleanNull () {
		int number = 1;
		if (number == 2) {
			return true;
		}

		return null;
	}

	private static Boolean haha () {
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


}
