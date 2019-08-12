package com.bridgelabz.conditionaljavaprogram;

import java.util.Scanner;

import com.bridgelabz.utility.Utils;

public class Sqrt {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Utils utility = new Utils();
		
		int sqrtNo;
		
		System.out.print("Enter the no.:- ");
		sqrtNo = scanner.nextInt();
		
		if(utility.checkNumber(sqrtNo))
		{
			System.out.println(utility.sqrtNumber(sqrtNo));
		}
		else
			System.out.println("The no should be Non Negative");
		
		
	}

}
