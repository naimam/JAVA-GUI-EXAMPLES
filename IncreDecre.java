import javax.swing.JFrame;
public class IncreDecre{
//-----------------------------------------------------------------
// Creates and displays the main program frame.
//-----------------------------------------------------------------
	public static void main(String[] args){
		JFrame frame = new JFrame("Plus or Minus");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new IncreDecrePanel());
		frame.pack();
		frame.setVisible(true);
	}
}

