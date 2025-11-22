/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula003;

import javax.swing.*;
import java.awt.*;

public class Exemplo8_13 extends Exemplo8_12
{
	static JButton B1, B2, B3, B4, B5, B6;
	
	public Exemplo8_13()
	{
		getContentPane().setBackground(Color.red);
		B1 = new JButton("Bauru");
		B1.setBounds(60,100,100,20);
		B1.setToolTipText("Está uma delicia ");
		B1.setBackground(Color.magenta);
		
		B2 = new JButton("X-Egg");
		B2.setBounds(60,100,100,20);
		B2.setToolTipText("Aproveite para pedir um suco ");
		B2.setBackground(Color.pink);
		
		B3 = new JButton("Calabresa");
		B3.setBounds(60,100,100,20);
		B3.setToolTipText("Que tal uma porçao de batatas ?");
		B3.setBackground(Color.green);
		
		B4 = new JButton("X-Salada");
		B4.setBounds(60,100,100,20);
		B4.setToolTipText("Fica ótimo com um refrigerante");
		B4.setBackground(Color.white);
		
		B5 = new JButton("Hot-Dog");
		B5.setBounds(60,90,100,20);
		B5.setToolTipText("Acompanhado com salada de batata");
		B5.setBackground(Color.orange);
		
		B6 = new JButton("Churrasco");
		B6.setBounds(60,90,100,20);
		B6.setToolTipText("Peça batatas fritas para acompanhar");
		B6.setBackground(Color.yellow);
			
		P1.add(B1);
		P2.add(B2);
		P3.add(B3);
		P4.add(B4);
		P5.add(B5);
		P6.add(B6);
		
	}
}
