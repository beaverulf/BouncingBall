import java.awt.Color;
import java.awt.Graphics;

import javax.naming.LimitExceededException;

public class Ball {

	private int size = 30;

	private PVector velocity = new PVector(0,0);
	private PVector location = new PVector(250, 250);
	private PVector acceleration;
	private PVector gravity;
	private float speedLimit = 2f;

	public Ball() {
		acceleration = new PVector(0,0.5f);

	}

	public void update() {
		velocity.add(acceleration);
		velocity.limit(speedLimit);
		
		location.add(velocity);
		checkBorders();

		System.out.println("Y: "+ velocity.getY());
		
		
	}

	private void checkBorders(){
		
		if (location.getX() < 0) {
			velocity.setX(velocity.getX() * -1);
			
		} else if (location.getX() + size > 500f){
			
			velocity.setX(velocity.getX() * -1);
			location.setX(500-size);
		}

		if (location.getY() < 0 ) {
			velocity.setY(velocity.getY() * -1);
			
		} else if (location.getY() + size > 500) {
			velocity.setY(velocity.getY() * -1);
			location.setY(500-size);
			
			
		}
	}

	
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect((int)location.getX(), (int)location.getY(), size, size);
	}
}
