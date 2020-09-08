//********************************************************************
// StyleOptionsPanel.java Java Foundations
//
// Demonstrates the use of check boxes.
//********************************************************************
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StyleOptionsPanel extends JPanel{
	private JLabel saying;
	private JCheckBox bold, italic;
//-----------------------------------------------------------------
// Sets up a panel with a label and some check boxes that
// control the style of the label's font.
//-----------------------------------------------------------------
	public StyleOptionsPanel(){
		saying = new JLabel("CHECK A BOX!");
		saying.setFont(new Font("Helvetica", Font.PLAIN, 36));
		bold = new JCheckBox("Bold");
		bold.setBackground(Color.pink);
		italic = new JCheckBox("Italic");
		italic.setBackground(Color.green);
		StyleListener listener = new StyleListener();
		bold.addItemListener(listener);
		italic.addItemListener(listener);
		add(saying);
		add(bold);
		add(italic);
		setBackground(Color.white);
		setPreferredSize(new Dimension(300, 100));
	}
	//*****************************************************************
	// Represents the listener for both check boxes.
	//*****************************************************************
	private class StyleListener implements ItemListener{
	//--------------------------------------------------------------
	// Updates the style of the label font style.
	//--------------------------------------------------------------
		public void itemStateChanged(ItemEvent event){
			int style = Font.PLAIN;
			if (bold.isSelected())
			style = Font.BOLD;
			if (italic.isSelected())
			style += Font.ITALIC;
			saying.setFont(new Font("Helvetica", style, 36));
		}
	}
}
