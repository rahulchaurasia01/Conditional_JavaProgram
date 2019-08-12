/******************************************************************************
 *  
 *  Purpose: To calculate the harmonic number.
 *
 *  @author  rahul
 *  @version 1.0
 *  @since   12-08-2019
 *
 ******************************************************************************/


package com.bridgelabz.conditionaljavaprogram;

import com.bridgelabz.utility.Utils;

public class HarmonicNumber {

	public static void main(String[] args) {
		
		Utils utility = new Utils();
		
		int n = Integer.parseInt(args[0]);
		
		double result = utility.harmonicNumber(n);
		
		System.out.println("The nth Harmonic Number is:- "+result);
		
	}

}
