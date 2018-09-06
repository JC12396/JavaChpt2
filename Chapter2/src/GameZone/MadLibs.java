package GameZone;

import javax.swing.JOptionPane;

public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color;
		String name;
		String number;
		
		color = JOptionPane.showInputDialog(null, "Name a color", "Naming a Color", JOptionPane.INFORMATION_MESSAGE);
		name = JOptionPane.showInputDialog(null, "Enter a name please", "Figuring Out a Name", JOptionPane.INFORMATION_MESSAGE);
		number = JOptionPane.showInputDialog(null, "Enter a number", "Entering a Number", JOptionPane.INFORMATION_MESSAGE);
	
		JOptionPane.showMessageDialog(null, "The " + color + " Dragon named " + name + " is turning " + number + " years old!");
	
	}

}
