import java.awt.Color;
import java.awt.Graphics;

/*
 *  What is a class in Java?
 *  A template/blueprint/recipe for objects.
 *  It is also an abstract data type.
 *  
 *  How do you create objects from a class?
 *  The default constructor is used to instantiate
 *  objects
 */

// You can only have one public class per file.
public class Ball {

	// #1 - Parts of a class
	// Instance variables / properties
	private int x, y; // location
	private int diameter; // size
	private Color color; // color
	
	// #2 - Parts of a class
	// constructors
	// helps with creation of class
	// assigns values to the instance variables
	public Ball() {
		x = (int) (Math.random() * 801);
		y = (int) (Math.random() * 601);
		
		diameter = 15;
		
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);
		
		// calling a constructor to create an
		// object of type Color
		color = new Color(red, green, blue);
	}
	
	public Ball(int diameter, int x, int y) {
		this.diameter = diameter;
		this.x = x;
		this.y = y;
	}
	
	// Add a method to the ball that allows it to
	// paint itself
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, diameter, diameter);
	}

}
