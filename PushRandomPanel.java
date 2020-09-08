import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public class PushRandomPanel extends JPanel{
	 private JButton push;
	 private JLabel label;
	
	 public PushRandomPanel() {
		 push = new JButton("Push Me!");
		 label = new JLabel();
		 push.addActionListener(new ButtonListener());
		 add(push);
		 add(label);
		 setBackground(Color.lightGray);
		 setPreferredSize(new Dimension(300, 40));
	 }
	 
	private class ButtonListener implements ActionListener { 
		public void actionPerformed(ActionEvent event){
			int random = (int)(100.0 * Math.random()+1);
			label.setText("Random Number: " + random);
		}
	}
}
