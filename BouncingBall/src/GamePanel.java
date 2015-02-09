
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;



public class GamePanel extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Ball ball = new Ball();

	public GamePanel() {		
		this.setPreferredSize(new Dimension(500,500));
		Timer tim = new Timer(30, this);
		tim.start();
	}
	
	private void update(){
		ball.update();
	}
	
	public void paintComponent(Graphics g){
		g.setColor(Color.black);
		g.fillRect(0, 0, 500, 500);
		ball.paint(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		update();
		repaint();
	}


}