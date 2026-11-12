package com.Arrays;

import java.util.Scanner;

public class Loan {
	static Scanner sc = new Scanner(System.in);

	String getCustomerName() {
		sc.nextLine();
		System.out.println("Enter your name:");
		String name = sc.nextLine();
		return name;

	}

	int getCustomerAge() {
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		return age;
	}

	double getCustomerSalaryInfo() {
		System.out.println("Enter your salary:");
		double sal = sc.nextDouble();
		return sal;
	}

	int cibilInfo() {
		System.out.println("Enter cibil score:");
		int cibil = sc.nextInt();
		return cibil;
	}

	double getRoi() {
		int cibil = cibilInfo();
		double roi = 12.0;
		if (cibil >= 300 && cibil < 500) {
			System.out.println("poor-high risk for lenders");
			return roi + 1.0;
		} else if (cibil >= 750 && cibil <= 900) {
			System.out.println("Excellent-high approval chances and better interest rates");
			return roi - 4.0;
		} else {
			System.out.println("Invalid cibil score:");
			return roi;
		}
	}

	boolean isValidPhone() {
		System.out.println("Enter your phone:");
		String phone = sc.next();
		boolean isValid = phone.matches("^[6-9][0-9]{9}");
		return isValid;

	}

	boolean isAadharValid() {
		System.out.println("Enter your Aadhar:");
		String aadhar = sc.next();
		boolean isAadharValid = aadhar.matches("^[2-9][0-9]{11}");
		return isAadharValid;
	}

	// ABCDE1234H..
	boolean isPanValid() {
		System.out.println("Enter your pan details:");
		String pan = sc.next();
		boolean isPanValid = pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}");
		return isPanValid;
	}

}
