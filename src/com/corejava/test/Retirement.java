package com.corejava.test;
import java.util.*;
/**
 * This programe demonstrates  a<code>wile</code> loop.
 * @version 1.20 2014-10-16
 * @author Tony.Liu
 *
 */
public class Retirement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//read inputs
		Scanner in = new Scanner(System.in);
		
		System.out.println("How much money do you need to retire?");
		Double goal = in.nextDouble();
		
		System.out.println("How much money will you contribute every year?");
		double payment = in.nextDouble();
		
		System.out.println("Interest rate in %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int years = 0;
		
		//update account balance while goal isn't reached
		while(balance<goal)
		{
			balance += payment;
			double interest = balance * interestRate / 100;
			balance += interest;
			years++;
		}
		System.out.println("You can retire in " + years + "years");
	}

}
