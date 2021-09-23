import java.awt.Color;
import java.awt.Graphics;

public class Paddle {
	
	private int x, y; // location
	private int width, height; // size
	private Color color; // color
	
	private int velocity;
	
	public Paddle() {
		x = (int) (Math.random() * 401) + 200;
		y = (int) (Math.random() * 101) + 100;
	}
	
	public Paddle(int x, int y) {
		this.x = x;
		this.y = y;
		width = 25;
		height = 200;
	}
	
	public void paint(Graphics g) {
		y += velocity;
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}
	
	// Setter method
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

}
