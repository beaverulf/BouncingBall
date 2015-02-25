
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
//	Line line = new Line();
//	Walker walker = new Walker(500);

	public GamePanel() {		
		this.setPreferredSize(new Dimension(500,500));
		Timer tim = new Timer(11, this);
		tim.start();
	}
	
	private void update(){
		ball.update();
//		line.update();
//		walker.update();
	}
	
	@Override
	public void paintComponent(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 500, 500);
//		line.paint(g);
		
//		walker.paint(g);
		ball.paint(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	    
	    update();
		repaint();
	}
}