import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Walker {
    private PVector location;
    private int size = 6;
    private Random ran;

    public Walker(int w) {
	location = new PVector((float) w / 2, (float) w / 2);
	ran = new Random(System.currentTimeMillis());

    }

    public void update() {
	int choice = ran.nextInt(4);
	step(choice);
    }

    public void step(int c) {
	if (c == 0) {
	    location.setX(location.getX() - 1);
	} else if (c == 2) {
	    location.setX(location.getX() + 1);
	} else if (c == 1) {
	    location.setY(location.getY() - 1);
	} else if (c == 3) {
	    location.setY(location.getY() + 1);
	}
    }

    public void paint(Graphics g) {
	g.setColor(Color.black);
	g.fillRect((int) location.getX(), (int) location.getY(), size, size);
    }
}
