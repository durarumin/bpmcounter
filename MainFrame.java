package bpm;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class MainFrame extends JFrame implements ActionListener{

	private JLabel label;
	private int i = 0;
	
	public void CreateFrame(){
    	JFrame frame = new JFrame("BPM counter");

 		label = new JLabel();
  		label.setText(" ");
  		frame.add(label, BorderLayout.NORTH);
  	
   		JButton button = new JButton("Click!");
  		frame.add(button,  BorderLayout.CENTER);
  		button.addActionListener(this);
  	
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	frame.setBounds( 10, 10, 300, 200);
    	frame.setVisible(true);
  }
	
	public void actionPerformed(ActionEvent e){
		i++;
		label.setText( Integer.toString(i) );
	}
}
