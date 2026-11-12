package com.Arrays;

import java.util.Scanner;

public class PersonalLoan extends Loan {
	static Scanner sc = new Scanner(System.in);

	void PersonalLoanDocInfo() {
		System.out.println("Personal loan documents have been receive succesfully !!!");
	}

	public static void main(String[] args) {

		System.out.println("Welcome to vcube banking loan !!");
		PersonalLoan pl = new PersonalLoan();
		boolean isValidPhone = pl.isValidPhone();
		boolean isAadharValid = pl.isAadharValid();
		boolean isPanValid = pl.isPanValid();
		if (isValidPhone && isAadharValid && isPanValid) {
			String name = pl.getCustomerName();
			System.out.println("Welcome to vcube banking loan Mr:" + name);
			double salary = pl.getCustomerSalaryInfo();
			double cibil = pl.cibilInfo();
			int age = pl.getCustomerAge();
			if (salary >= 800000.00 && (age >= 20 && age <= 60) && (cibil >= 300 && cibil <= 900)) {
				System.out.println("Congratulations!! you are eligible for personal loan!!");
				System.out.println("Your rate of interest is:" + pl.getRoi());
			} else {
				System.out.println("Focus on your career to get loan !!");
			}
		} else {
			System.out.println("Invalid Details!");
		}
	}

}
