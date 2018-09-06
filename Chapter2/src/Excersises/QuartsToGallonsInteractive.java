package Excersises;

import java.util.Scanner;

public class QuartsToGallonsInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quartsInGallon = 4;
		int quartsPaintNeed;
		int gallonTotal;
		int quartTotal;
		
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Please enter how many quarts of paint you need. >> ");
		quartsPaintNeed = input.nextInt();
		
		gallonTotal = quartsPaintNeed / quartsInGallon;
		quartTotal = quartsPaintNeed % quartsInGallon;
		
		System.out.println("You will need " + gallonTotal + " gallons and " + quartTotal + " quarts." );
	}

}
