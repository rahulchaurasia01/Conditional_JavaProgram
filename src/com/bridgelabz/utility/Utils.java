/******************************************************************************
 *  
 *  Purpose: The Utility file to store the logic of all the program.
 *
 *  @author  rahul
 *  @version 1.0
 *  @since   12-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.utility;

public class Utils {

	
	/**
	 *  Purpose:- Flip a Coin - Head or Tails
	 */
	public void flipCoin() {
		
		if(Math.random() < 0.5)
			System.out.println("Heads");
		else
			System.out.println("Tails");
		
	}
	
}
