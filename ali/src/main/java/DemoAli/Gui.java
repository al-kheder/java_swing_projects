package DemoAli;

import org.apache.logging.log4j.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Gui  extends Main{
	
	
	//define the components
	

//start my Gui
public  Gui() {
	JFrame frame=new JFrame("test");
	
	
//make jframe visible	
	    frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setSize(250, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   //jbutton
    JButton btn=new JButton("click");
    btn.setBounds(10, 20, 50, 20);
    logger.info("button");
    frame.add(btn);
    
    
    //jradio
    JRadioButton jr1=new JRadioButton("1-Male");
    JRadioButton jr2=new JRadioButton("2-Female");
     jr1.setBounds(20,50, 90, 25);
     jr2.setBounds(20,78, 130, 25);
     
//   accept just one select
     ButtonGroup btngr=new ButtonGroup();
     btngr.add(jr1);
     btngr.add(jr2);   

     
     frame.add(jr1);
     frame.add(jr2);
    frame.setVisible(true);
   logger.info(frame);

}
	public  void initComponent() {
		
		
	}
	
	
}
