package com.corejava.test;
import java.util.*;
/**
 * This programe demonstrates console input.
 * @version 1.10 2014-10-16
 * @author Tony.Liu
 */

public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//get first input
		System.out.println("What is your name?");
		String name = in.nextLine();
		
		//get second input
		System.out.println("How old are you?");
		int age = in.nextInt();
		
		//display output on console
		System.out.println("Hello!" + name + ". Next year ,you'll be " + (age + 1));
	}

}
