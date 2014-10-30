/***********************************************************************
 Program Name: Circle.java
 Programmer's Name: Steven Bennett
 Program Description: Program accepts the radius of a circle as user input
 and prints the circle's diameter, circumference, and area.
 ***********************************************************************/ 
import javax.swing.JOptionPane;

public class Circle {

	public static void main(String[] args) {
		String inputRadius;
		int radius;
		
		//prompt for input of circle's radius
		inputRadius = JOptionPane.showInputDialog("Input Circle's Radius");
		
		//convert input string to integer
		radius = Integer.parseInt(inputRadius);
		
		//calculate diameter, circumference, and area.
		int diameter = 2 * radius;
		double circumference = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
		
		//output results of calculations
		JOptionPane.showMessageDialog(null, "The calculated diameter, circumference, and area are: \n" + "Diameter: " + diameter + "\n" + "Circumference: " + circumference + "\n" + "Area: " + area + "\n", "Results", JOptionPane.PLAIN_MESSAGE);
		
		//terminate program
		System.exit(0);
	}

}
