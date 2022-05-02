package com.greatlearning.gradedlab3.bracketbalancing;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter string brackets");
		String characters=sc.next();
		BalanceBracket bb =new BalanceBracket();

		boolean answer = bb.BalanceBracket(characters);

		if(answer==true) {
			System.out.println("The entered String has Balanced Brackets");
		}else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
		sc.close();
	}

}
