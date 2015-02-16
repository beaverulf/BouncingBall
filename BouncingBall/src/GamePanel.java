
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
import javax.swing.Timer;



public class GamePanel extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Ball ball = new Ball();
	Line line = new Line();

	public GamePanel() {		
		this.setPreferredSize(new Dimension(500,500));
		Timer tim = new Timer(30, this);
		tim.start();
	}
	
	private void update(){
		ball.update();
		line.update();
	}
	
	public void paintComponent(Graphics g){
		g.setColor(Color.black);
		g.fillRect(0, 0, 500, 500);
		line.paint(g);
		ball.paint(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		update();
		repaint();
	}




}