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

		if (test) {
			System.out.println("test");
		}


		int number = Integer.parseInt("23");
		System.out.println(number);

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

}
