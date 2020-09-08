import javax.swing.JFrame;
public class PushRandom{
 //-----------------------------------------------------------------
 // Creates and displays the main program frame.
 //-----------------------------------------------------------------
	 public static void main(String[] args) {
		 JFrame frame = new JFrame("Random Number!");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 PushRandomPanel panel = new PushRandomPanel();
		 frame.getContentPane().add(panel);
		 frame.pack();
		 frame.setVisible(true);
	 }
}