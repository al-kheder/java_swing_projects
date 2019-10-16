package DemoAli;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

    public class Taschenrechner extends JFrame {
	 //label
           private	JLabel text1;
            private JLabel text2;
      double num1;
      double num2;
      String operation;
      double result;
    String answer;
    //textfield
             private JTextField textField;
    
    
    //Font
            private Font schrift;

    //button 
			    private JButton btn1;
			    private JButton btn2;
			    private JButton btn3;
			    private JButton btn4;
			    private JButton btn5;
			    private JButton btn6;
			    private JButton btn7;
			    private JButton btn8;
			    private JButton btn9;
			    private JButton btn0;
			    
			    private JButton btnPlus;
			    private JButton btnMinus;
			    private JButton btnMulti;
			    private JButton btnDiv;
			    private JButton btnc;
			    private JButton btnEqual;
    
public Taschenrechner() {
 

 
 
				 
				 
				 setLocationRelativeTo(null);
				 
				 
				 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				 
				 
				setTitle("TaschenRechner");
				
				initComponent();
				
				setLayout(null);
				 
				 
				//add(text1);
				//add(text2);
				 
				//add textfield
				add(textField);
				
				// to add button
				add(btn1);
				
				add(btn2);
				add(btn3);
				add(btn4);
				add(btn5);
				
				add(btn6);
				add(btn7);
				add(btn8);  
				add(btn9);
				add(btn0);
				add(btnPlus);
				add(btnMinus);
				add(btnMulti);
				add(btnDiv);
				add(btnc);
				add(btnEqual);
				// nach der  intialisierung soll die frame gezeigt werden
				setSize(300, 250);
				
				setVisible(true);
}//Taschenrechner

/*
private class Taschenrechne_ implements ActionListener{

	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==btn1) {
		textField="";
	}
		
	}
	
}//Taschenrechner_
*/



public  void initComponent() {
/*
// LABEL text
text1=new JLabel("Hello Welt ");
text2=new JLabel("the treaining make the super man ");

//to set where the text have to be in the frame 
text1.setBounds(10, 20, 100, 30);
text1.setFont(schrift);
text2.setBounds(10,50,250,30);

*/	
//Font
//Font	schrift=new Font(schriftArt,Typ,Große);
schrift=new Font("Serif",Font.BOLD+Font.ITALIC,15);
textField=new JTextField(20);
textField.setBounds(7, 30, 200, 40);

// BUTTON 
btn1=new JButton();
btn2=new JButton();
btn3=new JButton();
btn4=new JButton();
btn5=new JButton();
btn6=new JButton();
btn7=new JButton();
btn8=new JButton();
btn9=new JButton();
btn0=new JButton();

btnPlus=new JButton();
btnMinus=new JButton();
btnMulti=new JButton();
btnDiv=new JButton();
btnc=new JButton();
btnEqual=new JButton();





//btn1.setText("1");
btn1.setText("1");
btn1.setFont(schrift);
btn1.setBounds(10, 80, 50,20);
btn1.addActionListener(new ActionListener() {

	public void actionPerformed(ActionEvent e) {
		String num=textField.getText()+btn1.getText();
		textField.setText(num);
		
	}
	
});


btn2.setText("2");
btn2.setFont(schrift);
btn2.setBounds(75, 80, 50,20);
btn2.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String num=textField.getText()+btn2.getText();
		textField.setText(num);
		
	}
});


btn3.setText("3");
btn3.setFont(schrift);
btn3.setBounds(140, 80, 50,20);
btn3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String num=textField.getText()+btn3.getText();
		textField.setText(num);
	}
});


btn4.setText("4");
btn4.setFont(schrift);
btn4.setBounds(10, 105, 50,20);
btn4.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String num=textField.getText()+btn4.getText();
		textField.setText(num);
	}
});
btn5.setText("5");
btn5.setFont(schrift);
btn5.setBounds(75, 105, 50,20);
btn5.addActionListener(new ActionListener () {
	public void actionPerformed(ActionEvent e) 
	{
		String num=textField.getText()+btn5.getText();
		textField.setText(num);
	}
});


btn6.setText("6");
btn6.setFont(schrift);
btn6.setBounds(140, 105, 50,20);
btn6.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String num=textField.getText()+btn6.getText();
		textField.setText(num);
	}
});


btn7.setText("7");
btn7.setFont(schrift);
btn7.setBounds(10, 130, 50,20);
btn7.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String num=textField.getText()+btn7.getText();
		textField.setText(num);
	}
});


btn8.setText("8");
btn8.setFont(schrift);
btn8.setBounds(75, 130, 50,20);
btn8.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String num=textField.getText()+btn8.getText();
		textField.setText(num);
		
	}
});


btn9.setText("9");
btn9.setFont(schrift);
btn9.setBounds(140, 130, 50,20);
btn9.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String num=textField.getText()+btn9.getText();
		textField.setText(num);
	}
});

btn0.setText("0");
btn0.setFont(schrift);
btn0.setBounds(10, 155, 50,20);
btn0.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String num=textField.getText()+btn0.getText();
		textField.setText(num);
	}
});
btnPlus.setText("+");
btnPlus.setFont(schrift);
btnPlus.setBounds(210, 80, 50,20);
btnPlus.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		num1=Double.parseDouble(textField.getText());
		textField.setText("");
		operation="+";
	}
});

btnMinus.setText("-");
btnMinus.setFont(schrift);
btnMinus.setBounds(210, 105, 50,20);
btnMinus.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		num1=Double.parseDouble(textField.getText());
		textField.setText("");
		operation="-";
	}
});


btnMulti.setText("*");
btnMulti.setFont(schrift);
btnMulti.setBounds(210, 130, 50,20);
btnMulti.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		num1=Double.parseDouble(textField.getText());
		textField.setText("");
		operation="*";
	}
});

btnDiv.setText("/");
btnDiv.setFont(schrift);
btnDiv.setBounds(210, 155, 50,20);
btnDiv.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		num1=Double.parseDouble(textField.getText());
		textField.setText("");
		operation="/";
	}
});

btnc.setText("C");
btnc.setFont(schrift);
btnc.setBounds(140, 155, 50, 20);
btnc.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		textField.setText(null);
	}
});
btnEqual.setText("=");
btnEqual.setFont(schrift);
btnEqual.setBounds(75, 155, 50,20);
btnEqual.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
     String answer;
		num2=Double.parseDouble(textField.getText());
		if(operation=="+") {
			result=num1+num2;
			answer=String.format("%.2f",result);
			
			textField.setText(answer);
		}
		if(operation=="-") {
			result=num1-num2;
			answer=String.format("%.2f", result);
			textField.setText(answer);
		}
		if(operation=="*") {
			result=num1*num2;
			answer=String.format("%.2f", result);
			textField.setText(answer);
		}
		if(operation=="/") {
			result=num1/num2;
			answer=String.format("%.2f", result);
			textField.setText(answer);
		}
	}
});

}//initComponent
}
