package YouDoIt;

import java.util.Scanner;

public class IntergerDemoInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anInt;
		byte aByte;
		short aShort;
		long aLong;
		String name;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("What is your name? >> ");
		name = input.nextLine();
		System.out.println("Please enter an interger >> ");
		anInt = input.nextInt();
		System.out.println("Please enter a Byte >> ");
		aByte = input.nextByte();
		System.out.println("Please enter a short >> ");
		aShort = input.nextShort();
		System.out.println("Please enter a long >> ");
		aLong = input.nextLong();
		
		System.out.println("The int is " + anInt);
		System.out.println("The byte is " + aByte);
		System.out.println("The short is " + aShort);
		System.out.println("The long is " + aLong);
		System.out.println("Your name is " + name);
		
		
		
		
		
	}

}
