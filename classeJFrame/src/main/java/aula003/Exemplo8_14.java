/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula003;
import javax.swing.*;
import java.awt.*;

public class Exemplo8_14 extends Exemplo8_13
{
	ImageIcon Im1, Im2, Im3,Im4,Im5,Im6 ;
	JLabel Lx1, Lx2, Lx3,Lx4, Lx5, Lx6 ;
	
	public Exemplo8_14()
	{
		L1.setText("HOT DOG    R$ 4,60 ");
		L2.setText("CHURRASCO    R$ 5,60 ");
		L3.setText("BAURU   R$ 4,80 ");
		L4.setText("X-EGG    R$ 4,50 ");
		L5.setText("CALABRESA    R$ 6,80 ");
		L6.setText("X-SALADA    R$ 7,50 ");
		
		Im1 = new ImageIcon("C:/IMAGENS/Hot_Dog.gif");
		Im2 = new ImageIcon("C:/IMAGENS/Churrasco.gif");
		Im3 = new ImageIcon("C:/IMAGENS/Bauru.gif");
		Im4 = new ImageIcon("C:/IMAGENS/Egg.gif");
		Im5 = new ImageIcon("C:/IMAGENS/Calabresa.gif");
		Im6 = new ImageIcon("C:/IMAGENS/Salada.gif");
		
		Lx1 = new JLabel(Im1);
		Lx1.setBounds(170,10,100,100);
		Lx1.setVisible(true);
		
		
		Lx2 = new JLabel(Im2);
		Lx2.setBounds(170,10,100,100);
		Lx2.setVisible(false);
		
		Lx3 = new JLabel(Im3);
		Lx3.setBounds(170,10,100,100);
		Lx3.setVisible(false);
		
		Lx4 = new JLabel(Im4);
		Lx4.setBounds(170,10,100,100);
		Lx4.setVisible(false);
		
		Lx5 = new JLabel(Im5);
		Lx5.setBounds(170,20,100,100);
		Lx5.setVisible(false);
		
		Lx6 = new JLabel(Im6);
		Lx6.setBounds(170,20,100,100);
		Lx6.setVisible(false);
		
		P5.add(Lx1);
		P6.add(Lx2);
		P1.add(Lx3);
		P2.add(Lx4);
		P3.add(Lx5);
		P4.add(Lx6);
		
	}
}

