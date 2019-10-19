package vote;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI extends JFrame {
	JLabel l;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JButton b;
	GUI()
	{
		//JFrame f=new JFrame("VOTE");
		setLayout(null);
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l= new JLabel("VOTING");
		l1=new JLabel("VOTER'S NAME");
		l2=new JLabel("ADHAAR NO.");
		l3=new JLabel("AGE");
		t1=new JTextField(30);
		t2=new JTextField(30);
		t3=new JTextField(30);
		b=new JButton("ENTER");
		//Color c= new Color(0,350,255);
		getContentPane().setBackground(Color.LIGHT_GRAY);
		l.setBounds(150,10, 90,20);
		l1.setBounds(10,50,90,20);
		l2.setBounds(10,80,90,20);
		l3.setBounds(10,110,90,20);
		t1.setBounds(100,50,90,20);
		t2.setBounds(100,80,90,20);
		t3.setBounds(100,110,90,20);
		b.setBounds(100,200,90,20);
		add(l);
		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(t3);
		add(b);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new Gui2();
				dispose();
				
			}
		});
		
	}

}
