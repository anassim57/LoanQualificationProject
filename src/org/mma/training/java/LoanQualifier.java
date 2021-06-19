package org.mma.training.java;

import java.util.Scanner;

public class LoanQualifier {

	public static void main(String[] args) {

		//	intialize varibles
		int requiredsalary = 30000;
		int requiredMinimumServiceYear = 2;
		int requiredStateResidency = 1;

		// Get the unkown
		System.out.println("Enter your Salary:");
		Scanner scanner = new Scanner(System.in);
		double salary = scanner.nextDouble();
		System.out.println("Enter the year in your current job:");
		double yearsWorked = scanner.nextDouble();
		System.out.println("Enter the year of residency in the State:");
		double residencyYear = scanner.nextDouble();
		boolean approve = false;
		
		if (salary >= requiredsalary) {
			System.out.println("You meet the salary requirement");
			approve  = true;	
		} else {
			System.out.println(" You dont meet the salary");
		}
		if (yearsWorked >=requiredMinimumServiceYear) {
			
		System.out.println("You meet the work requirement");
		approve  = true;
		} else {
			System.out.println(" You dont meet the work required");
			
		}
		if (residencyYear >= requiredStateResidency) {
			System.out.println("You meet the  residency requirement ");
			approve  = true;
		} else {
			System.out.println(" You dont meet the residency requirement");
		
		}
		if(approve) {
			System.out.println("Congratulation you loan is approved");
		}else {
			System.out.println(" Sorry! You are not eligible");
		}
		
			}
}


