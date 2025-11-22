/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula003;

import javax.swing.*;
import java.awt.*;

public class Exemplo8_12 extends Exemplo8_11
{
	JLabel L1, L2, L3, L4, L5, L6;
	
	public Exemplo8_12()
	{
		L1 = new JLabel("Aqui fica o primeiro titulo");
		L1.setLocation(50,0);
		L1.setSize(200,20);
		
		L2 = new JLabel("Aqui fica o segundo titulo");
		L2.setLocation(40,0);
		L2.setSize(200,20);
		
		L3 = new JLabel("Aqui fica o terceiro titulo");
		L3.setLocation(50,0);
		L3.setSize(200,20);
		
		L4 = new JLabel("Aqui fica o quarto titulo");
		L4.setLocation(50,0);
		L4.setSize(200,20);
		
		L5 = new JLabel("Aqui fica o quinto titulo");
		L5.setLocation(50,0);
		L5.setSize(200,20);
		
		L6 = new JLabel("Aqui fica o sexto titulo");
		L6.setLocation(50,0);
		L6.setSize(200,20);
			
		P1.setLayout(null);
		P1.add(L3);
		
		P2.setLayout(null);
		P2.add(L4);
		
		P3.setLayout(null);
		P3.add(L5);
		
		P4.setLayout(null);
		P4.add(L6);
		
		P5.setLayout(null);
		P5.add(L1);
		
		P6.setLayout(null);
		P6.add(L2);
	}
	
}

