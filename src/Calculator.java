
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame {
	
	JLabel l1,l2,l3,l4;
	JTextField t1,t2;
	JButton b1,b2;
	public Calculator(){}
	public Calculator(String s)
	{
		super(s);
	}
	public void SetComponents()
    {
    	l1=new JLabel("addition of two numbers");
    	l2=new JLabel("first no.");
    	l3=new JLabel("second no.");
    	l4=new JLabel();
    	t1=new JTextField();
    	t2=new JTextField();
    	b1=new JButton("add");
    	b2=new JButton("mul");
    	
    	setLayout(null);
		  l1.setBounds(40,5,200,50);
	     	l2.setBounds(50,50,150,50);
	     	l3.setBounds(50,150,150,50);
	        t1.setBounds(130,50,150,50);
	        t2.setBounds(130,150,150,50);
	        b1.setBounds(100,220,100,50);
	        b2.setBounds(300,220,100,50);
	        l4.setBounds(50,300,150,50);
	        b1.addActionListener(new Handler());
	        b2.addActionListener(new Mul());
           add(l1);
           add(l2);
           add(t1);
           add(l3);
           add(t2);
           add(b1);
           add(b2);
           add(l4);
     }

class Handler implements ActionListener{
   	 public void actionPerformed(ActionEvent e){
   		 int a=Integer.parseInt(t1.getText());
   	     int b=Integer.parseInt(t2.getText());
   		  int s=a+b;
   		  l4.setText("sum is  "+s);
   		  }
}

class Mul implements ActionListener{
   	 public void actionPerformed(ActionEvent e){
   		 int a=Integer.parseInt(t1.getText());
   	     int b=Integer.parseInt(t2.getText());
   		  int s=a*b;
   		  l4.setText("multiplication is  "+s);
   		  }
}
   	  public static void main(String[] args) {
		Calculator obj=new Calculator("SwingExample");
		obj.SetComponents();
		obj.setSize(400,400);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	}

