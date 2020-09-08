import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IncreDecrePanel extends JPanel{
	private int num = 50;
	private JButton incre, decre;
	private JPanel buttonPanel;
	private JLabel label;
	public IncreDecrePanel() {
		incre = new JButton("Increment");
		decre = new JButton("Decrement");
		ButtonListener listener = new ButtonListener();
		incre.addActionListener(listener);
		decre.addActionListener(listener);
		label = new JLabel("Number: 50");
		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(200, 100));
		buttonPanel.setBackground(Color.white);
		buttonPanel.add(incre);
		buttonPanel.add(decre);
		setPreferredSize(new Dimension(200, 100));
		setBackground(Color.white);
		add(label);
		add(buttonPanel);
		
	}

	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if (event.getSource() == incre) {
				num++;
				label.setText("Number: " + num);
			}
			else {
				num--;
				label.setText("Number: " + num);
			}
		}
	}
}