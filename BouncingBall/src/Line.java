import java.awt.Color;
import java.awt.Graphics;
import java.awt.MouseInfo;

public class Line {

	private PVector mouse = new PVector(2, 2);
	private PVector center = new PVector(250, 250);

	public Line() {

	}

	public void update() {
		mouse.setX((float) MouseInfo.getPointerInfo().getLocation().getX());
		mouse.setY((float) MouseInfo.getPointerInfo().getLocation().getY());
//		mouse.sub(center);
	}

	public void paint(Graphics g) {
		g.setColor(Color.GREEN);
		g.drawLine((int)center.getX(), (int)center.getY(),(int)mouse.getX(),(int)mouse.getY());
		System.out.println((int)center.getX()-(int)mouse.getX());
		
	}

}
