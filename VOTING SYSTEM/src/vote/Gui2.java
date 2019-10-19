package vote;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Gui2 extends JFrame {
	Gui2()
	{
		setVisible(true);
		setSize(400, 400);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel L=new JLabel("WELCOME");
		JButton B=new JButton("SUBMIT");
		JRadioButton r=new JRadioButton("CONGRESS");
		JRadioButton r1=new JRadioButton("BJP");
		JRadioButton r2=new JRadioButton("AAP");
		JLabel L1=new JLabel("    ");
		add(L1);
		add(r);
		add(r1);
		add(r2);
		add(L);
		add(B);
		L.setBounds(100, 20, 90, 20);
		B.setBounds(100, 100, 90, 20);
		r.setBounds(20, 50, 90, 20);
		r1.setBounds(20, 70, 90, 20);
		r2.setBounds(20, 90, 90, 20);
		L1.setBounds(100, 120, 90, 20);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r);
		bg.add(r1);
		bg.add(r2);
		B.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				L1.setText("THANKYOU");			}
		});
	}

}
