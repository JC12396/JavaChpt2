package Excersises;

import javax.swing.JOptionPane;

public class DelgatosTacos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wantTacos;
		int wantBurritos;
		int wantChipsAndSalsa;
		int wantYellowRice;
		int wantMiniTacos;
		double priceTacos = 3.00;
		double priceBurritos = 3.50;
		double priceChipsAndSalsa = 2.50;
		double priceYellowRice = 1.50;
		double priceMiniTacos = 1.60;
		double total;
		double totalAndTax;
		
		wantBurritos = Integer.parseInt( JOptionPane.showInputDialog(null, "How many burritos?", "Food Order", JOptionPane.INFORMATION_MESSAGE));
		wantChipsAndSalsa = Integer.parseInt( JOptionPane.showInputDialog(null, "How much Chips and Salsa?", "Food Order", JOptionPane.INFORMATION_MESSAGE));
		wantYellowRice = Integer.parseInt( JOptionPane.showInputDialog(null, "How much Yellow Rice?", "Food Order", JOptionPane.INFORMATION_MESSAGE));
		wantMiniTacos = Integer.parseInt( JOptionPane.showInputDialog(null, "How many Mini Tacos?", "Food Order", JOptionPane.INFORMATION_MESSAGE));
		wantTacos = Integer.parseInt( JOptionPane.showInputDialog(null, "How many Tacos?", "Food Order", JOptionPane.INFORMATION_MESSAGE));
		
		total = (wantTacos * priceTacos) + (wantBurritos * priceBurritos) + (wantYellowRice * priceYellowRice) + (wantChipsAndSalsa * priceChipsAndSalsa) + (wantMiniTacos * priceMiniTacos);
		
		totalAndTax = total * .07;
		
		JOptionPane.showMessageDialog(null, "The total without tax is $" + total + " and with tax it is $" + totalAndTax);
		JOptionPane.showMessageDialog(null, "Thank you for shopping at Delgados Tacos!!!");
		
		System.out.println("X                                                                 XXXXXXXXXXX                         X");
		System.out.println("X                                                             XXXXXXXXXXXXXXXXXX                            X");
		System.out.println("X                                                          XXXXXXXXXXXXXXXXXXXXXXX                         X");
		System.out.println("X                                                         XXXXXXXXXXXXXXXXXXXXXXXXXX                        X");
		System.out.println("X                                                        XXXXXXXXXXXXXXXXXXXXXXXXXXXX                        X");
		System.out.println("X                                                       XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX                         X");
		System.out.println("X                                       XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX                                               X");
		System.out.println("X                                       X                                                 X          X               X");
		System.out.println("X                                       X                                                 X           X                   X");
		System.out.println("X                                       X         X   lXXXXXXXXXXXXXXXXXXXXl X            X            X                    X");
		System.out.println("X                                       X          X  l                    l  X           X             X                 X");
		System.out.println("X                                       X          X  l                    l  X           X              X                     X");
		System.out.println("X                                       X           X l                    l   X          X               X                        X");
		System.out.println("X                                       X            Xl                    l    X         XXXXXXXXXXXXXXXXXXXXXXXXXXXX                        X");
		System.out.println("X                                       X             XXXXXXXXXXXXXXXXXXXXXXXXXXX                                    X                X");
		System.out.println("X                                       X                                                                            X                X");
		System.out.println("X                                       X                                                                            X                       X");
		System.out.println("X                                       X            XXXXXXXX                               XXXXXXXX                 X             X");
		System.out.println("X                                       X           XOOOOOOOOX                             XOOOOOOOOX                X          X");
		System.out.println("X                                       X          XOOOOOOOOOOX                           XOOOOOOOOOOX               X          X");
		System.out.println("X                                       XXXXXXXXXXXOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXXXXXXXOOOOOOOOOOOOXXXXXXXXXXXXXXXX          X");
		System.out.println("X                                                  OOOOOOOOOOOO                           OOOOOOOOOOOO                                                                         X");
		System.out.println("X                                                   OOOOOOOOOO                             OOOOOOOOOO                          X");
		System.out.println("X                                                    OOOOOOOO                               OOOOOOOO                                                X");
		
		
	}

}
