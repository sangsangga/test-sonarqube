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
		Boolean boxBoolean = testBoolean();
		List<Integer> emptyList = new ArrayList<>();
		List<Integer> nullList;
		String paymentBca = "BCA";
		String nullString = null;

		List<String> listPayment = new ArrayList<>();
		listPayment.add("BCA");
		listPayment.add("Gopay");

		String briPayment = listPayment.stream().filter(payment -> payment.equals("BRI")).findAny().orElse(null);


		//naming - variable
		String WrongVariableName = "";

		// constant on left
		Boolean constantLeft = briPayment.equals(PaymentEnum.BCA);

		// use stringUtils
		Boolean isEmptyStringUtil = StringUtils.isEmpty(WrongVariableName);
		Boolean isEmptyString = WrongVariableName.isEmpty();
		Boolean isEmptyStringNull = nullString.isEmpty();

		// use empty collection
		Boolean listEmpty = emptyList.isEmpty();
		Boolean listEmptyUtil = CollectionUtils.isEmpty(emptyList);


		// magic number
		for(int i = 0; i < 5 ; i++){
			System.out.println(i);
		}


		if (test) {
			System.out.println("test");
		}

		if (boxBoolean) {
			System.out.println("123");
		}

		System.out.println(isEmptyStringNull);
		System.out.println(isEmptyStringUtil);
		System.out.println(isEmptyStringNull);
		System.out.println(isEmptyString);
		System.out.println(constantLeft);
		System.out.println(listEmpty);
		System.out.println(listEmptyUtil);

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
