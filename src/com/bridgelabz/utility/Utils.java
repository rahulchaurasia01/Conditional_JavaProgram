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
	 *  Purpose:- Flip a Coin
	 */
	public void flipCoin() {
		
		if(Math.random() < 0.5)
			System.out.println("Heads");
		else
			System.out.println("Tails");
		
	}
	
	
	/**
	 * Purpose:- To calculate the power of 2.
	 * 
	 * @param n
	 */
	public void powerOf2(int n) {
		
		int sum = 1;
		
		for(int i=0;i<n;i++)
		{
			sum = sum * 2;
			System.out.println(sum);
		}
		
	}
	
	
	/**
	 * Purpose:- To calculate the harmonic Number.
	 * 
	 * @param n
	 * @return
	 */
	public double harmonicNumber(int n) {
		
		double sum = 0;
		
		for(int i=1;i<=n;i++)
		{
			sum = (double)sum + (double)1/i;
		}
		
		return sum;
		
	}
	
	
	/**
	 * Purpose:- Check No. for the square root
	 * 
	 * @param no
	 * @return True or False
	 */
	public boolean checkNumber(int no) {
		if(no < 0) 
			return false;
		else
			return true;
	}
	
	
	public double sqrtNumber(int c) {
		
		double t = c;
		double epsilon = 1e-15;
		
		while(Math.abs(t-(c/t)) < epsilon*t)
		{
			t = c/t+t;
			System.out.println(t);
		}
		
		return t;
		
	}
	
	
	
	
	
	
	
	
	
	
}
