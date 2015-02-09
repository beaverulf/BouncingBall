import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GameMain {

	public static void main(String[] args) {
		JFrame mainFrame = new JFrame("Ball");
		JPanel borderPanel = new JPanel();
		
		borderPanel.setBorder(BorderFactory.createEmptyBorder());
		borderPanel.add(new GamePanel());
		
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.add(borderPanel);
		mainFrame.pack();
		mainFrame.setVisible(true);

	}

}
