package Excersises;

import java.util.Scanner;

public class NauticalMilesInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double miles = 1.150779;
		double kilometers = 1.852;
		double nMiles;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many nautical miles are you traveling >> ");
		nMiles = input.nextInt();
		
		miles = nMiles * 1.150779;
		kilometers = nMiles * 1.609344;
		
		
		System.out.println(nMiles + " nautical miles is " + miles + " miles and " + kilometers + " kilometers.");
		
	}

}
