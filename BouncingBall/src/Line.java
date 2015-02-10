import java.awt.Color;
import java.awt.Graphics;

public class Line {

    private PVector mouse = new PVector(2, 2);

    public Line() {

    }

    public void update(PVector v) {
	mouse.sub(v);
    }

    public void paint(Graphics g) {
	g.setColor(Color.GREEN);
	g.drawLine(250, 250, (int)mouse.getX(), (int)mouse.getY());
    }

}
