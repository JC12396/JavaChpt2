package Excersises;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eggsWant;
		double eggDozenCost = 3.25;
		double eggSingleCost = 0.45;
		int dozenAmount;
		int singleAmount;
		double total;
		
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Please enter how many eggs you would like. >> ");
		eggsWant = input.nextInt();
		
		dozenAmount = eggsWant / 12;
		singleAmount = eggsWant % 12;
		total = (eggDozenCost * dozenAmount) + (eggSingleCost * singleAmount);
		
		System.out.println("You ordered " + eggsWant + " eggs. That's " + dozenAmount +" dozen at $" + eggDozenCost + " per dozen and " + singleAmount + " loose eggs at " + eggSingleCost + " cents each");
		System.out.println("for a total of $ " + total + ".");
		
	}

}
