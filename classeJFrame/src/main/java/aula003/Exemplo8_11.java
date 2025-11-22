package aula003;

import javax.swing.*;
import java.awt.*;

public class Exemplo8_11 extends NFrame
{
	JPanel P1, P2, P3, P4, P5, P6 ;
	
	Exemplo8_11()
	{
		setTitle("Trabalhando com paineis \"JPanel\"");
		setLocation(120,50);
		setResizable(false);
		P1 = new JPanel();
		P1.setLayout(null);
		P1.setBounds(10,140,280,130);
		P1.setBackground(Color.magenta);
		P1.setBorder(BorderFactory.createLineBorder(Color.black,2));
				
		P2 = new JPanel();
		P2.setBackground(Color.pink);
		P2.setLayout(null);
		P2.setBounds(305,140,280,130);
		P2.setBorder(BorderFactory.createLineBorder(Color.black,2));
		
		P3 = new JPanel();
		P3.setBackground(Color.green);
		P3.setLayout(null);
		P3.setBounds(10,280,280,130);
		P3.setBorder(BorderFactory.createLineBorder(Color.black,2));
		
		P4 = new JPanel();
		P4.setBackground(Color.white);
		P4.setLayout(null);
		P4.setBounds(305,280,280,130);
		P4.setBorder(BorderFactory.createLineBorder(Color.black,2));
		
		P5 = new JPanel();
		P5.setBackground(Color.orange);
		P5.setLayout(null);
		P5.setBounds(10,10,280,120);
		P5.setBorder(BorderFactory.createLineBorder(Color.black,2));
		
		P6 = new JPanel();
		P6.setBackground(Color.yellow);
		P6.setLayout(null);
		P6.setBounds(305,10,280,120);
		P6.setBorder(BorderFactory.createLineBorder(Color.black,2));
		
		getContentPane().setLayout(null);
		getContentPane().add(P1);
		getContentPane().add(P2);
		getContentPane().add(P3);
		getContentPane().add(P4);
		getContentPane().add(P5);
		getContentPane().add(P6);    
	}
}
