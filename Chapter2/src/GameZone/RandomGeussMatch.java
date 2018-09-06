package GameZone;

import java.util.Scanner;

public class RandomGeussMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int random;
		int userInput;
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Please enter a number from 1 to 5 >> ");
		userInput = input.nextInt();
		
		random = 1 + (int)(Math.random() * 5);
		
		if (random == userInput) {
			System.out.println("You are correct! The random number is " + random + " and your guess was " + userInput);
		}
		else {
			System.out.println("You were wrong. The random number is " + random + " and your guess was " + userInput);
		}
	}

}
