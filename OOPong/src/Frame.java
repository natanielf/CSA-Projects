import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Frame extends JPanel implements KeyListener, ActionListener{
	// Instance variables - visible to other methods
	
	// Frame width and height properties
	int frameWidth = 800, frameHeight = 600;
	
	// Paddles
	private Paddle leftPaddle = new Paddle(20, 20);
	private Paddle rightPaddle = new Paddle(200, 20);
	
	// Paint gets called ~60x per second
	public void paint(Graphics g) {
		super.paintComponent(g);
		
		Ball ball = new Ball(25, 50, 50);
		ball.paint(g);
		
		// Paint paddles
		leftPaddle.paint(g);
		rightPaddle.paint(g);
		
	}
	
	public Frame() {
		JFrame f = new JFrame("Pong");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(frameWidth, frameHeight);
		f.add(this);
		f.addKeyListener(this);
		t = new Timer(16, this);
		t.start();
		f.setVisible(true);
	}
	
	public static void main(String[] arg) {
		Frame f = new Frame();
	}	
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getKeyCode() == 83) {
			leftPaddle.setVelocity(5);
		}
		if (arg0.getKeyCode() == 87) {
			leftPaddle.setVelocity(-5);
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getKeyCode() == 83 || arg0.getKeyCode() == 87) {
			leftPaddle.setVelocity(0);
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	Timer t;

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}
}
