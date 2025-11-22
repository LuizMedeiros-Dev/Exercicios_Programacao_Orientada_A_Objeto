package aula003;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


//define o conteúdo e as posições dos rótulos dentro da tela.
public class Aplicacao1_1 extends NFrame{
	JLabel L1, L2,L3,L4,L5,L6 ;
	
	public Aplicacao1_1()
	{
		setTitle("Calcula Consumo");
		setBounds(150,100,500,375);
		setResizable(false);
		L1 =new JLabel("CONSUMO DE AUTOMÓVEL", JLabel.CENTER);
		L1.setFont(new Font("Helvetica",Font.BOLD,18));
		L1.setBorder(BorderFactory.createLineBorder(Color.black,1));
		L1.setBounds(100,30,300,30);
		
		L2 =new JLabel("Kilometros Rodados",JLabel.CENTER);
		L2.setFont(new Font("Sans Serif",Font.BOLD,16));
		L2.setBounds(150,80,200,30);
		
		L3 =new JLabel("Anterior",JLabel.RIGHT);
		L3.setFont(new Font("Sans Serif",Font.BOLD,14));
		L3.setBounds(70,120,100,20);
		
		L4 =new JLabel("Atual",JLabel.RIGHT);
		L4.setFont(new Font("Sans Serif",Font.BOLD,14));
		L4.setBounds(70,150,100,20);
		
		L5 =new JLabel("Abastecimento",JLabel.CENTER);
		L5.setFont(new Font("Sans Serif",Font.BOLD,16));
		L5.setBounds(150,180,200,30);
		
		L6 =new JLabel("Litros",JLabel.RIGHT);
		L6.setFont(new Font("Sans Serif",Font.BOLD,16));
		L6.setBounds(70,220,100,20);
	
		getContentPane().setLayout(null);
		getContentPane().add(L1);
		getContentPane().add(L2);
		getContentPane().add(L3);
		getContentPane().add(L4);
		getContentPane().add(L5);
		getContentPane().add(L6);
	
	}
}


