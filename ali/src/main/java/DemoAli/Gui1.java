package DemoAli;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Gui1 extends JFrame implements ActionListener{
   
	
	
	
	JLabel  label;
	JRadioButton r1;
	JRadioButton r2;
	
	JCheckBox check;
	
	JTextField textField;
	
	JButton btn;
	JButton btn1;
	
	
	
	
	
	public void initCopmponent() {
      
		Font font=new Font("Serif",Font.BOLD+Font.ITALIC,15);
		label=new JLabel();
		label.setBounds(10, 75, 140, 25);
		label.setFont(font);
		
		check=new JCheckBox();
		check.setBounds(10, 10, 200, 25);
		
		//ItemListener
		check.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(check.isSelected()) {
					label.setText("CheckBox is selected ");
				}
				
			}
			
		});//check Box
		
		
		
		
		//textfield
		
		textField=new JTextField();
		textField.setBounds(10, 40, 200, 30);
		//RadioButton
		r1=new JRadioButton();
		r2=new JRadioButton();
		r1.setBounds(10, 100, 125, 25);
		r2.setBounds(10, 130, 125, 25);
		r1.setText("Apple");
		r1.setToolTipText("here you will get "+r1.getText());
		r2.setText("Orange");
		r2.setToolTipText("here you will get "+r2.getText());
		r1.setFont(font);
		r2.setFont(font);
		ButtonGroup btngr=new ButtonGroup();
		btngr.add(r1);
		btngr.add(r2);
		
		btn=new JButton();
		btn.setText("click");
		btn.setFont(font);
		btn.setBounds(10, 165, 75, 25);
		btn.addActionListener(this);
		
		btn1=new JButton();
		btn1.setText("click2");
		btn1.setBounds(80,165, 75, 25);
// second Way to Add ActionListener to the Element 
		btn1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(r1.isSelected()) {
					
					label.setText(r1.getText());
				
				}
				if(r2.isSelected()) {
					
					label.setText(r2.getText());
				}
				
			}
		});
	}//initComponent
	//Add Action to the componenet 
	public void actionPerformed( ActionEvent e) {
		String str=textField.getText().toUpperCase();
		label.setText(str);
		
	
	}//Action
	
	
	// GUI1 our frame 
	Gui1(){
		
		initCopmponent();
		
		//add component
		add(r1);
		add(r2);
		add(btn);
		add(btn1);
		add(label);
		add(check);
		add(textField);
      setLocationRelativeTo(null);		
		setLayout(null);
		setSize(300, 300);
		setResizable(false);
		setTitle(" Training");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}//frame Gui1
	
	
	

}
