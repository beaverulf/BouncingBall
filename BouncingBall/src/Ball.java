import java.awt.Color;
import java.awt.Graphics;

public class Ball {

	private int size = 30;

	private PVector velocity = new PVector(1, 4);
	private PVector location = new PVector(250, 250);
	private PVector acceleration = new PVector(0, 1);

	public void update() {

		location.add(velocity);
//		velocity.add(acceleration);

		if (location.getX() < 0 || location.getX() + size > 500) {
			velocity.setX(velocity.getX() * -1);

		}

		if (location.getY() < 0 || location.getY() + size > 500) {
			velocity.setY(velocity.getY() * -1);

		}
	}

	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect((int) location.getX(), (int) location.getY(), size, size);
	}

}
