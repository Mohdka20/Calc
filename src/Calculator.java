import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener  {
	// declaration
	double input1 = 0;
	double input2 = 0;
	double result = 0;
	char function ;
	
	JFrame frame;
	JTextField field;
	JButton [] numInput = new JButton [10];
	JButton [] funInput = new JButton [8];
	JButton add,sub,div,mult,eq,dot,cls,del;

	
	
	
	Calculator(){
		 frame = new JFrame ("Calculator"); 
		 frame.setSize(450,550);
		 frame.setVisible(true);
		 frame.setLayout(null);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	
	}
	public static void main(String[] args) {
	

	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
}
