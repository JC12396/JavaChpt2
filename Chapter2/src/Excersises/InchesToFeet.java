package Excersises;

import java.util.Scanner;

public class InchesToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inches;
		int feet;
		int inchRem;
		
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Please enter how many inches tall you are >> ");
		inches = input.nextInt();
		
		feet = inches / 12;
		inchRem = inches % 12;
		
		System.out.print("You are " + feet + " feet and " + inchRem + " inches tall.");
		
		
	}

}
