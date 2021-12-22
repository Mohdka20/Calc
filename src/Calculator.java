import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener  {
	// declarations
	double input1 = 0;
	double input2 = 0;
	double result = 0;
	char function ;
	
	JFrame frame;
	JTextField field;
	JButton [] numInput = new JButton [10];
	JButton [] funInput = new JButton [10];
	JButton add,sub,div,mult,eq,dot,clr,del,neg,empty;
	JPanel panel;
	
	Calculator(){
		// creating the frame
		 frame = new JFrame ("Calculator"); 
		 frame.setSize(450,550);
		 frame.setLayout(null);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 // creating the field
		 field = new JTextField();
		 field.setBounds(50,25, 300, 50);
		 field.setEditable(false);
		 //Instantiating the function array
		 add = new JButton("+");
		 sub = new JButton("-");
		 div = new JButton("÷");
		 mult = new JButton("*");
		 eq = new JButton("=");
		 dot = new JButton(".");
		 neg = new JButton("(-/+)");
		 clr = new JButton("Clear");
		 del = new JButton("Delete");
		 empty = new JButton("");

		 //Functions array values
		 funInput[0]= add;
		 funInput[1]= sub;
		 funInput[2]= div;
		 funInput[3]= mult;
		 funInput[4]= eq;
		 funInput[5]= dot;
		 funInput[6]= clr;
		 funInput[7]= del;
		 funInput[8]= neg;

		 // looping over the function array and read 
		 for (int index = 0; index < 8 ; index++) {
			 funInput[index].addActionListener(this);
		 }
		 // looping over the numbers array and setting value to the buttons
		 for (int index = 0; index < 10 ; index++) {
			 numInput[index]= new JButton(String.valueOf(index));
			 numInput[index].addActionListener(this);
		 }
		 // sitting layout and bounds of the panel
		 panel = new JPanel();
		 panel.setBounds(50,100,300,300);
		 panel.setLayout(new GridLayout(5,4,10,10));
		 //adding panel to the frame 
		 frame.add(panel);
		 frame.add(field);
		 frame.setVisible(true);
		 // adding the buttons to the panel

		 
		 panel.add(numInput[1]);
		 panel.add(numInput[2]);
		 panel.add(numInput[3]);
		 panel.add(add);
		 panel.add(numInput[4]);
		 panel.add(numInput[5]);
		 panel.add(numInput[6]);
		 panel.add(sub);
		 panel.add(numInput[7]);
		 panel.add(numInput[8]);
		 panel.add(numInput[9]);
		 panel.add(mult);
		 panel.add(neg);
		 panel.add(numInput[0]);
		 panel.add(dot);
		 panel.add(div);
		 panel.add(clr);
		 panel.add(del);
		 panel.add(empty);
		 panel.add(eq);


	
	}
	public static void main(String[] args) {
	
     Calculator Calc = new Calculator();

	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
		
		}
	}

