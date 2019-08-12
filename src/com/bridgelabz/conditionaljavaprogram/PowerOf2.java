/******************************************************************************
 *  
 *  Purpose: To calculate the power of 2.
 *
 *  @author  rahul
 *  @version 1.0
 *  @since   12-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.conditionaljavaprogram;

import com.bridgelabz.utility.Utils;

public class PowerOf2 {

	public static void main(String[] args) {
		
		Utils utility = new Utils();
		
		int n = Integer.parseInt(args[0]);
		
		utility.powerOf2(n);
		
	}

}
