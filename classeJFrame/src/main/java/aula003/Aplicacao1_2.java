



//Segunda classe: simplifica os códigos e contém a implementação das três caixas de texto JTextField e dos três botões do sistema.

package aula003;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Aplicacao1_2 extends Aplicacao1_1{
	
	static JTextField Tx1, Tx2, Tx3 ;
	JButton B1, B2, B3 ;
	
	public Aplicacao1_2()
	{
		Tx1 = new JTextField();
		this.Tx1 = Tx1;
		Tx1.setBounds(190,120,80,20);
		
		Tx2 = new JTextField();
		this.Tx2 = Tx2;
		Tx2.setBounds(190,150,80,20);
		
		Tx3 = new JTextField();
		this.Tx3 = Tx3;
		Tx3.setBounds(190,220,80,20);
		
		B1 =new JButton("Limpar");
		B1.setSize(120,30);
		B1.setLocation(50,280);
		
		B2 =new JButton("Calcular");
		B2.setSize(120,30);
		B2.setLocation(190,280);
		
		B3 =new JButton("Sair");
		B3.setSize(120,30);
		B3.setLocation(330,280);
		
		getContentPane().add(Tx1);
		getContentPane().add(Tx2);
		getContentPane().add(Tx3);
		getContentPane().add(B1);
		getContentPane().add(B2);
		getContentPane().add(B3);
	}
}

