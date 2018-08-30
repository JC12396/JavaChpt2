package Excersises;

import java.util.Scanner;

public class FreeLance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstName;
		int num1;
		int num2;
		int total;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name? >> ");
		firstName = input.nextLine();
		System.out.println("List a interger. >> ");
		num1 = input.nextInt();
		System.out.println("List another interger. >> ");
		num2 = input.nextInt();
		
		total = num1 + num2;
		
		System.out.println("Your first name is " + firstName);
		System.out.println("Your first interger was " + num1);
		System.out.println("Your second interger was " + num2);
		System.out.println("The total of the two intergers is " + total);
		
		
	}

}
